package oop.lesson7.practic;

public class Car {
    private String label;
    private String model;
    private int maxSpeed=220;

    public Car(){
        this.label = "Non label";
        this.model = "Non model";
    }
    public Car(String label, String model) {
        this.label = label;
        this.model = model;
    }

    public Car(String label, String model, int maxSpeed) {
        this.label = label;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getSpeedTo100(){
        return (float) 110/(this.maxSpeed/20);
    }
    public void getInfo(){
        System.out.printf("В нашем гараже находится машина %s %s с максимальной скоростью %d и разгоном до 100 за %f секунд.",this.getLabel(),this.getModel(),this.getMaxSpeed(),this.getSpeedTo100());
    }
}
