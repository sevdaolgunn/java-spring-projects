package org.example;

import java.sql.SQLOutput;

public class TemizlikPersoneli extends Personel implements CalisanArayuzu{
    public TemizlikPersoneli(String name, int age){
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Temizlik yapıyorum!!");
    }

    @Override
    public int Salary() {
        return 10*20*2+2000 ;
    }

    @Override
    public void isAdresi() {
        System.out.println("İstanbul / Büyükçekmece Belediyesi");
    }

    @Override
    public void kacSaatCalisir() {
        System.out.println("Standart çalışma saati 10 saatir.");

    }
}
