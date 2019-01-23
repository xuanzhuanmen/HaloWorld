package com.cheng.learningdemo.basic;

import com.cheng.learningdemo.domain.Person;

import java.lang.reflect.*;

/**
 * 一个例子让你了解java反射机制
 * 总结：通过这个例子，可以知道，java反射机制讲白了，就是我们可以在程序运行时，去操作类、类的属性和方法。
 * 就像操作一个对象一样，在操作一个类，获取这个类的所有相关信息，比如类的属性信息、类的方法信息、调用类的方法、创建一个对象。
 * from：https://blog.csdn.net/ljphhj/article/details/12858767
 */
public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
        ReflectDemo.demo1();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo2();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo3();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo4();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo5();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo6();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo7();
        System.out.println("------------------------------------------------------");
        ReflectDemo.demo8();
        System.out.println("------------------------------------------------------");
    }

    /**
     * 通过java反射机制，得到类的包名和类名
     */
    public static void demo1() {
        Person person = new Person();
        System.out.println("demo1包名：" + person.getClass().getPackage().getName());
        System.out.println("demo1完整类名：" + person.getClass().getName());
    }

    /**
     * 所有类都是Class类的实例对象
     */
    public static void demo2() {
        Class<?> class1 = null;
        Class<?> class2 = null;
        try {
            class1 = Class.forName("com.cheng.learningdemo.domain.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        class2 = Person.class;
        System.out.println("demo2包名：" + class1.getPackage().getName());
        System.out.println("demo2类名：" + class1.getName());
        System.out.println("demo2包名：" + class2.getPackage().getName());
        System.out.println("demo2类名：" + class2.getName());
    }

    /**
     * 通过java反射机制，用Class创建类对象。（反射存在的意义）
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void demo3() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> class1 = null;
        class1 = Class.forName("com.cheng.learningdemo.domain.Person");
        Person person = (Person) class1.newInstance();
        person.setAge(27);
        person.setName("cheng");
        System.out.println(person);
    }

    /**
     * 通过Java反射机制得到一个类的构造函数，并实现创建带参实例对象
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void demo4() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> class1 = null;
        Person person1 = null;
        Person person2 = null;
        // 类加载
        class1 = Class.forName("com.cheng.learningdemo.domain.Person");
        // 得到一系列构造函数集合
        Constructor<?>[] constructors = class1.getConstructors();
        for(int i=0;i<constructors.length;i++){
            System.out.println("i= " + i + "  "+constructors[i].toGenericString());
        }
        person1 = (Person) constructors[0].newInstance();
        person1.setName("haha");
        person1.setAge(27);
        System.out.println("person1----" + person1);
        // 使用有参数的构造方法，对应的实体类要有这个构造方法
        person2 = (Person) constructors[1].newInstance(20,"leo");
        System.out.println("person2----" + person2);
    }

    /**
     * 通过Java反射机制操作成员变量, set 和 get
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchFieldException
     */
    public static void demo5() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> class1 = null;
        class1 = Class.forName("com.cheng.learningdemo.domain.Person");
        Object obj = class1.newInstance();
        // 获取类的属性
        Field personNameField = class1.getDeclaredField("name");
        personNameField.setAccessible(true);
        personNameField.set(obj, "leo messi");
        System.out.println("Demo5: 修改属性之后得到属性变量的值：" + personNameField.get(obj));
    }

    /**
     * 通过反射机制得到类的属性和方法、接口信息，以及父类的属行、方法等信息
     * @throws ClassNotFoundException
     */
    public static void demo6() throws ClassNotFoundException {
        Class<?> classSon = null;
        classSon = Class.forName("com.cheng.learningdemo.domain.SuperMan");
        // 获取父类的名臣
        Class<?> superClass = classSon.getSuperclass();
        System.out.println(superClass.getName());

        // 遍历类的属性
        Field[] fields = classSon.getDeclaredFields();
        System.out.println("---------Demo6,取得类的属性：---------");
        for (int i = 0; i < fields.length; i++) {
            System.out.println("类中的成员: " + fields[i]);
        }

        // 获取类的方法集合
        Method[] methods = classSon.getDeclaredMethods();
        System.out.println("---------Demo6,取得类的方法：---------");
        for (int i = 0; i < methods.length; i++) {
            System.out.println("函数名：" + methods[i].getName());
            System.out.println("函数返回类型：" + methods[i].getReturnType());
            System.out.println("函数访问修饰符：" + Modifier.toString(methods[i].getModifiers()));
            System.out.println("函数代码写法： " + methods[i]);
        }

        //取得类实现的接口,因为接口类也属于Class,所以得到接口中的方法也是一样的方法得到
        Class<?> interfaces[] = classSon.getInterfaces();
        System.out.println("---------Demo6,取得类实现的接口：---------");
        for (int i = 0; i < interfaces.length; i++) {
            System.out.println("实现的接口类名: " + interfaces[i].getName() );
        }
    }

    //通过Java反射机制调用类方法

    /**
     * 通过java反射机制调用类的方法(invoke)
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws InvocationTargetException
     */
    public static void demo7() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> class1 = null;
        class1 = Class.forName("com.cheng.learningdemo.domain.SuperMan");

        System.out.println("Demo7: \n调用无参方法fly()：");
        Method method = class1.getMethod("fly");
        method.invoke(class1.newInstance());

        System.out.println("调用有参方法walk(int m)：");
        Method method1 = class1.getMethod("walk", int.class);
        method1.invoke(class1.newInstance(), 11);
    }

    /**
     * 通过java反射机制获取类加载器的相关信息
     * @throws ClassNotFoundException
     */
    public static void demo8() throws ClassNotFoundException {
        Class<?> class1 = null;
        class1 = Class.forName("com.cheng.learningdemo.domain.SuperMan");
        String classLoaderName = class1.getClassLoader().getClass().getName();
        System.out.println("获取类加载器的类名：" + classLoaderName);
    }
}
