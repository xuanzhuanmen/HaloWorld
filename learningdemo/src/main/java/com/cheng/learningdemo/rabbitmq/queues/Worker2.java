package com.cheng.learningdemo.rabbitmq.queues;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Worker2 {
    private static final String TASK_QUEUE_NAME = "task_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        final Connection connection = factory.newConnection();
        final Channel channel = connection.createChannel();

        channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);
        System.out.println("Worker2 [*] Waiting for messages. To exit press CTRL+C");
        // 每次从队列中获取数量
        // 此设置告诉rabbitmq，不要一次发送多条消息给消费者。
        // 保证消费者消费完当前消息并反馈后，才会收到另一条消息或任务。
        int prefetchCount = 1;
        channel.basicQos(prefetchCount);
        final Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");

                System.out.println("Worker2 [x] Received '" + message + "'");
                try {
                    doWork(message);
                } finally {
                    System.out.println("Worker2 [x] Done");
                    // 消息处理完成确认
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };
        // 消息消费完成确认
        // 必须要要有这一步，否则rabbitmq没有收到反馈，
        // 会导致消息一直存在于队列中，rabbitmq服务器内存爆满
        // 如果要监控这种错误，可以使用rabbitmqctl messages_unacknowledged命令打印出出相关的信息。
        channel.basicConsume(TASK_QUEUE_NAME, false, consumer);
    }

    /**
     * 任务处理
     * @param task
     */
    private static void doWork(String task) {
        try {
            Thread.sleep(1000); // 暂停1秒钟
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

}
