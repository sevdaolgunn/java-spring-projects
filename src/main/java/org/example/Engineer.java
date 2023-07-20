package org.example;

public class Engineer extends Worker{

    public Engineer(String name){
        super(name);
        this.hour = 10;
        this.wage = 50;
    }

    @Override
    int Salary(){
        return this.hour * wage +super.baseSalary();
    }
}
