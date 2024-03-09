package oop.lesson9.dog;

public class Poodle extends Dog{
    public Poodle() {
        super(32);
    }

    @Override
    public void run() {
        System.out.printf("Pudel bezhit medlenno\n");
    }

    @Override
    public void breath() {
        System.out.printf("Pudel dishit");
    }
}
