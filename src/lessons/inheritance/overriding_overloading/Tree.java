package lessons.inheritance.overriding_overloading;

import lessons.inheritance.overriding_overloading.Oak;

public class Tree {//package-private

    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public void grow(int a) {
        System.out.println("Tree is growing");
    }

    public String method1() {//package-private
        return "";
    }

    public String method2() {//Object is super class for String class
        return "";
    }
}

class TestOO {
    public static void main(String[] args) {
        Oak oak = new Oak(5);
        oak.grow(5);
    }
}

/**
 * private - visibility only inside class
 * package - private - visibility only inside package
 * protected - visibility only inside package + sub classes
 * public - visibility anywhere
 *
 */



