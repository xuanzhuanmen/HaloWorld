package com.cheng.learningdemo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.cheng.learningdemo.domain.Student;

/**
 * 接口中的所有null替换成""
 * 让输出的json中所有为null的字符串都变成空字符串，
 * 最简单的做法就是加一个值过滤器，这样就避免了有的字段为null，有的字段为空字符的现象。
 * from：https://segmentfault.com/q/1010000004216492
 */
public class JsonCastNullToEmptyString {
    /**
     * fastjson值过滤器
     */
    private static ValueFilter filter = new ValueFilter() {
        @Override
        public Object process(Object obj, String s, Object v) {
            if (v == null) {
                return "";
            }
            return v;
        }
    };

    private void test() {
        Student student = new Student();
        student.setAge(11);
        student.setGf(null);
        student.setName(null);
        System.out.println(JSON.toJSONString(student, filter));
    }

    public static void main(String[] args) {
        new JsonCastNullToEmptyString().test();
    }
}
