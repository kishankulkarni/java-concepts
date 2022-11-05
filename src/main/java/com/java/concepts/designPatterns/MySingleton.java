package com.java.concepts.designPatterns;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MySingleton implements Serializable, Cloneable {

    private static volatile MySingleton MY_SINGLETON = null;

    private MySingleton () {
        if (MY_SINGLETON != null) {
            throw new IllegalStateException("singleton instance already created!!!");
        }

    }

    public static MySingleton getInstance() {
        if (MY_SINGLETON == null) {
            synchronized (MySingleton.class){
                if (MY_SINGLETON == null) {
                    MY_SINGLETON = new MySingleton();
                }
            }
        }
        return MY_SINGLETON;
    }

    private Object readResolve() throws ObjectStreamException {
        return MY_SINGLETON;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return MY_SINGLETON;
    }

}
