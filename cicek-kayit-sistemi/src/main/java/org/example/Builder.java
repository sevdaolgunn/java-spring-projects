package org.example;

public class Builder {

    private String name;
    private String color;
    private int amount;
    private int price;

    public Builder(){}

    public Builder name(String name){
        this.name = name;
        return this;
    }
    public Builder color(String color){
        this.color = color;
        return this;
    }

    public Builder amount(int amount){
        this.amount = amount;
        return this;
    }

    public Builder price(int price){
        this.price = price;
        return this;
    }

    public Flower build() {
        return new Flower(name, color, amount,price);
    }


}
