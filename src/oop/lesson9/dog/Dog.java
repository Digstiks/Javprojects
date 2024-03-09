package oop.lesson9.dog;

public abstract class Dog extends Alive {
    private int countLegs=4;
    private int countTooth;

    public Dog(int countTooth) {
        this.countTooth = countTooth;
    }
    public int getCountTooth(){
        return countTooth;
    };
    public void bark(){
        System.out.printf("Bark Bark\n");
    }
    public void beAngry(){
        System.out.printf("RRRrrr");
    }
    public abstract void run();
}
