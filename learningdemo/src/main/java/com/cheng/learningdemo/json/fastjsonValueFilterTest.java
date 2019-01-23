package com.cheng.learningdemo.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.cheng.learningdemo.domain.Person;

/**
 * 关于fastjson的值过滤器ValueFilter
 * from：https://blog.csdn.net/saylessanddomore/article/details/79938937
 * from：https://segmentfault.com/q/1010000004216492
 */
public class fastjsonValueFilterTest {

    /**
     * 将所有值为null改为""
     */
    public static ValueFilter filter = new ValueFilter() {
        @Override
        public Object process(Object obj, String s, Object v) {
            if (v == null)
                return "";
            return v;
        }
    };

    /**
     * 字段为mobile，则脱敏
     */
    public static ValueFilter filter2 = new ValueFilter() {
        @Override
        public Object process(Object o, String s, Object o1) {
            if(s.toLowerCase().contains("mobile")) {
                return "*******";
            }
            return o1;
        }
    };

    public static void main(String[] args) {
        Person person = new Person();
        person.setName(null);
        person.setMobile("13865965996");
        person.setAge(27);
        System.out.println(JSON.toJSONString(person, filter2));
        System.out.println(JSON.toJSONString(person, filter));
    }

}
