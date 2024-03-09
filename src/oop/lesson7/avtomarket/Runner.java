package oop.lesson7.avtomarket;

import oop.lesson7.avtomobile.avto;

public class Runner {
    public static void main(String[] args) {
        avtomarket first=new avtomarket("Honda","Civic",20000,147);
        System.out.println(first.getCost());
        System.out.println(first.getHorsePower());
        first.setCost(-1000);
        System.out.println(first.getCost());
    }


}
