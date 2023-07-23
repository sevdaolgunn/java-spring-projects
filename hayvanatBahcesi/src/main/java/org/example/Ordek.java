package org.example;

public class Ordek extends Hayvan{

    private String cins;

    public Ordek(String ad, int yas){
        super(ad, yas);
    }

    public Ordek(String ad, String cins, int yas){
        this(ad, yas);
        this.cins = cins;
    }

    @Override
    public void sesCikar(){
        System.out.println("Vak Vak!!");
    }
}
