package com.java.concepts.designPatterns;

import java.util.HashMap;

class Employees {

    private String name;

    public Employees(String name) { // constructor
        this.name = name;
    }

    @Override
    public int hashCode(){
        return 1;
    }

    @Override
    public boolean equals(Object obj){
        Employees emp=(Employees)obj;
        return (emp.name==this.name || emp.name.equals(this.name));
    }

    @Override
    public String toString() {
        return "Employee[ name=" + name + "] ";
    }

}

public class Employee {

    public static void main(String[] args) {
        HashMap<Employees, String> hm=new HashMap<Employees, String>();
        hm.put(new Employees("a"), "emp1");
        hm.put(new Employees("b"), "emp2");
        hm.put(new Employees("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data -> "+hm);
        System.out.println("HashMap's size -> "+hm.size());
        System.out.println(hm.get(new Employees("a")));
    }
}
