package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Kullanıcı soyadını giriniz: ");
        String surname = scanner.nextLine();

        System.out.println("Kullanıcı boyunu giriniz: ");
        int boy = scanner.nextInt();

        KullaniciService kullaniciService = new KullaniciService();

        UserEntity userEntity = kullaniciService.kullaniciDocuments(name,surname,boy);

        kullaniciService.kullaniciGetir(userEntity);


    }
}