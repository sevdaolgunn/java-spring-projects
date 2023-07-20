package org.example;

public class Kedi extends Hayvan{

    public Kedi(String ad, int yas){
        super(ad, yas);
    }

    @Override
    public void sesCikar(){
        System.out.println("Miyav!!");
    }
}
