package org.example;


public interface KullaniciBilgileri {
    UserEntity kullaniciDocuments(String name, String surname, int boy);

    void kullaniciGetir(UserEntity userEntity);

}
