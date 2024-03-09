package oop.lesson8;

public class HotdogsRunner {
    public static void main(String[] args) {
        Hotgogs hotgogsFirst = new Hotgogs();
        Hotgogs hotgogsSecond = new Hotgogs();
        hotgogsSecond.doHotDog();
        System.out.printf(Hotgogs.getIngredients());
        hotgogsFirst.doHotDog();
        System.out.printf(Hotgogs.getIngredients());

    }
}
