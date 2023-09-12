package lessons.ls_09_23.ls_12_09_23;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) {
        MyCount myCount = new MyCount("path", "John", 32);

        Class<? extends MyCount> aClass = myCount.getClass();

        Class<MyCount> aClass1 = MyCount.class;

//        System.out.println(aClass.getName());
//        System.out.println(aClass.getSimpleName());

        Class<?> superclass = aClass.getSuperclass();

//        System.out.println(superclass.getSimpleName());

        Class<?>[] interfaces = aClass.getInterfaces();

        Arrays
                .stream(interfaces)
                .forEach(inter -> System.out.println(inter.getName()));

    }
}

class MyCount extends File implements Serializable, Cloneable {
    private String name;
    private int age;

    public MyCount(String pathname, String name, int age) {
        super(pathname);
        this.name = name;
        this.age = age;
    }
}
