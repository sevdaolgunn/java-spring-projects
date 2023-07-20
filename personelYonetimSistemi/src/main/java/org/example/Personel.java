package org.example;

import javax.swing.table.TableRowSorter;

public abstract class Personel {
    private String name;
    private int age;

    public Personel(String name,int age){
        this.name = name;
        this.age = age;

    }

    public abstract void work();
    public abstract int Salary();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
