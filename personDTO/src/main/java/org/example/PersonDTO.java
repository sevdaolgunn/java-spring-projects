package org.example;

public class PersonDTO {
    private String name;
    private int age;
    private String address;

    public PersonDTO(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    //GET METODLARI
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    //SET METODLARI


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
