package org.example;

public abstract class Worker {
    private String name;
    protected int hour;
    protected int wage;


    public Worker(String name, int hour){
        this.name = name;
        this.hour = hour;
    }

    public Worker(String name){ // no-abstract method
        this.name = name;
    }

    abstract int Salary(); //abstract method to calculate salary

    @Override
    public String toString(){
        return name+" "+ this.Salary();
    }
    int baseSalary(){
        return 1000;
    }
}
