package oop.lesson7;

import java.util.Arrays;

public class Cat {
    private String name;
    private String owner;
    private int weight;

    public Cat(String name, String owner, int weight) {
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void feed(String ...product){
        System.out.printf("Кошка по имени %s поела %s",this.name, Arrays.toString(product));
    }
}
