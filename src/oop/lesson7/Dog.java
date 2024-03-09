package oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name;
    private String owner;
    private int weight;

    public Dog(String name, String owner, int weight) {
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void feed(String ...product){
        System.out.printf("Собака по имени %s поела %s",this.name, Arrays.toString(product));
    }
}
