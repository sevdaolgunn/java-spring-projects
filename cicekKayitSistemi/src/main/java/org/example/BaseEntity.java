package org.example;

public abstract class BaseEntity {
    private String name, color;
    private int amount, price;

    public BaseEntity(String name, String color, int amount, int price){
        this.name = name;
        this.color = color;
        this.amount = amount;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
}
