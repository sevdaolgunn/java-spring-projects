package org.example;

public class Köpek extends Hayvan {
    public Köpek(String ad, int yas){
        super(ad, yas);
    }

    @Override
    public void sesCikar(){
        System.out.println("Hav Hav!!");
    }
}
