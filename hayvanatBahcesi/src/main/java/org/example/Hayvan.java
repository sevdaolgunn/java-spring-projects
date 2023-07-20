package org.example;

public abstract class Hayvan {
    private String ad;
    private int yas;

    public Hayvan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public abstract void sesCikar();

    public String getAd(){
        return ad;

    }
    public int getYas(){
        return yas;
    }




}
