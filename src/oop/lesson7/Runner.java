package oop.lesson7;

import oop.lesson7.zoo.zoo;

public class Runner {
    public static void main(String[] args) {
        Dog Jack = new Dog("Jack", "Timur", 25);
        Cat Murzik=new Cat("Murzik", "Nekit",5);
        zoo zoo1 = new zoo(Jack, Murzik);
        zoo1.feed();
    }
}
