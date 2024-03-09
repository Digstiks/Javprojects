package oop.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        car audi = new car("audi");
        System.out.println(audi.getCountCars());
        car bmw = new car("bmw");
        System.out.println(bmw.getCountCars());
        System.out.println(car.getCountCars());
        System.out.println(Arrays.toString(car.ALL_CAR_INFO));
    }
}
