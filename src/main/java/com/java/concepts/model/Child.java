package com.java.concepts.model;

class Parent {
    int a =10;

    void foo() {
        System.out.println("Im Parent");
    }
}

public class Child extends Parent{
    @Override
    void foo() {
        System.out.println("Im child");
    }

    public static void main(String[] args) {
        int b;
        Parent c = new Child();
        c.foo();
        c.a = 20;
        System.out.println(c.a);

    }
}
