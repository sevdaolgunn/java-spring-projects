package org.example;

public class ChiefEngineer extends Worker{
    public ChiefEngineer(String name, int hour){
        super(name, hour); //üst sınıfın yapıcı metodu çağırılır.
        this.wage=20;
    }

    @Override
    int Salary(){
        return this.hour * wage * 2 + super.baseSalary();// üst sınıfın baseSalary() metodu çağılırır.
    }
}
