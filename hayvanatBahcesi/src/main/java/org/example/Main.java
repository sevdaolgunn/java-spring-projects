package org.example;

public class Main {
    public static void main(String[] args) {
        Hayvan[] hayvanlar = new Hayvan[3];

        hayvanlar[0] = new Kedi("Minnoş",3);
        hayvanlar[1] = new Köpek("Karabaş",5);
        hayvanlar[2] = new Ordek("Pamuk",2);

        for (Hayvan hayvan : hayvanlar){
            System.out.println("Ad: " +hayvan.getAd() + "\nYaş: " +hayvan.getYas());
            hayvan.sesCikar();
            System.out.println("-----------------");
        }
    }
}