package org.example;
import java.util.Scanner;

public class KullaniciService implements KullaniciBilgileri {


    @Override
    public UserEntity kullaniciDocuments(String name, String surname, int boy) {
        UserEntity userEntity = new UserEntity();

        userEntity.setName(name);
        userEntity.setSurname(surname);
        userEntity.setBoy(boy);

        return userEntity;
    }

    @Override
    public void kullaniciGetir(UserEntity userEntity) {
        System.out.println(userEntity.getName());
        System.out.println(userEntity.getSurname());
        System.out.println(userEntity.getBoy());

    }
}

