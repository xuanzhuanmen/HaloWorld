package com.cheng.learningdemo.json;

import com.alibaba.fastjson.JSON;
import com.cheng.learningdemo.domain.Person;

/**
 * 在实体类上使用fastjson的@JSONField注解，可以指定就送口返回参数key名。
 */
public class JSONFieldTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(28);
        person.setName("cheng");
        /**
         * 如果在实体类name属性上加上：@JSONField(name = "realName")
         * 返回结果如下：
         * {"age":28,"realName":"cheng"}
         */
        System.out.println(JSON.toJSONString(person));
    }
}
