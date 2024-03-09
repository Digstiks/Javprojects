package oop.lesson7.practic;

public class Garage {
    private Car carFirst;
    private Car carSecond;

    public Garage(Car carFirst,Car carSecond){
        this.carFirst=carFirst;
        this.carSecond=carSecond;
    }

    public void setCarFirst(Car carFirst) {
        this.carFirst = carFirst;
    }

    public void setCarSecond(Car carSecond) {
        this.carSecond = carSecond;
    }


    public void getAllInfo(){
    this.carFirst.getInfo();
    this.carSecond.getInfo();
    }
}
