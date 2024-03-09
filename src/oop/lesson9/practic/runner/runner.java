package oop.lesson9.practic.runner;

import oop.lesson9.practic.profession.buhgalter;
import oop.lesson9.practic.profession.secretar;
import oop.lesson9.practic.profession.security;

public class runner {
    public static void main(String[] args) {
        buhgalter Vova = new buhgalter("Male");
        security Ivanich = new security("Male");
        security Nikitich = new security("Male");
        secretar Milana = new secretar("Female");

        System.out.printf(Milana.drinkCoffee());
        System.out.printf(Milana.getPayCost());
        System.out.printf(Milana.printDocs());


        System.out.printf(Vova.drinkCoffee());
        System.out.printf(Vova.getPayCost());
        System.out.printf(Vova.countMoney());

        System.out.printf(security.secure());
        System.out.printf(Ivanich.getPayCost());
        System.out.printf(Nikitich.getPayCost());


    }
}
