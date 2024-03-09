package oop.lesson9.dog;

public class Ovcharka extends Dog {

    public Ovcharka() {
        super(28);
    }

    @Override
    public void run() {
        System.out.printf("Evcharka bezhit bistro\n");
    }

    @Override
    public void bark() {
        System.out.printf("Ovcharka laet\n");
    }

    @Override
    public void beAngry() {

        System.out.printf("Овчарка видит чела");
        super.beAngry();
        System.out.printf("Овчарка съела чела");
    }

    @Override
    public void breath() {
        System.out.printf("Ovcharka dishit");
    }
}
