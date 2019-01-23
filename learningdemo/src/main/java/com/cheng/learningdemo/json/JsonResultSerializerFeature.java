package com.cheng.learningdemo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.cheng.learningdemo.domain.Student;

/**
 * fastjson返回结果序列化属性配置
 * from：https://blog.csdn.net/a258831020/article/details/47333807
 */
public class JsonResultSerializerFeature {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("cheng");
        student.setAge(27);
        student.setMale(true);
        Student gf = new Student();
        gf.setName(null);
        gf.setAge(20);
        student.setGf(gf);
        // fastjson在转换对象为json时候，默认是不序列化为null的字段，就是说值为null的字段，结果是不展示出来的。
        System.out.println(JSON.toJSONString(student));
        // Fastjson的SerializerFeature序列化属性,指定结果的展示效果
        System.out.println(JSON.toJSONString(student, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty));
        System.out.println(JSON.toJSONString(student, SerializerFeature.WriteNullStringAsEmpty));
    }
}
