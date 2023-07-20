package org.example;

public class Ördek extends Hayvan{

    public Ördek(String ad, int yas){
        super(ad, yas);
    }

    @Override
    public void sesCikar(){
        System.out.println("Vak Vak!!");
    }
}
