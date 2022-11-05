package com.java.concepts.designPatterns;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main implements Cloneable {

    public static void main(String[] args) {
//        breakSingletonByReflection();
//        breakSingletonBySerialization();
//        breakSingletonByCloning();
    }

    public static void breakSingletonByReflection() {
        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = null;
        try
        {
            Constructor[] constructors =
                    MySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (MySingleton) constructor.newInstance();
                break;
            }
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- "
                + instance1.hashCode());
        System.out.println("instance2.hashCode():- "
                + instance2.hashCode());
    }

    public static void breakSingletonBySerialization() {
        try
        {
            MySingleton instance1 = MySingleton.getInstance();
            // serialize object to file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

            MySingleton instance2 = (MySingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void breakSingletonByCloning() {
        try
        {
            MySingleton instance1 = MySingleton.getInstance();
            MySingleton instance2 = (MySingleton) instance1.clone();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
