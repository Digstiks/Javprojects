package oop.lesson7.practic;

public class Practic {
    public static void main(String[] args) {
        Car Taz = new Car("Toyota","Mark2");
        Car Ferrari=new Car("Ferrari","F40",400);
        Garage garageFirst = new Garage(Taz,Ferrari);
        Ferrari.getSpeedTo100();
        Taz.getSpeedTo100();
        garageFirst.getAllInfo();
    }
}
