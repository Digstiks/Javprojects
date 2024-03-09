package oop.lesson7.avtomobile;

public class avtoMain {
    public static void main(String[] args) {
        avto example=new avto("BMW","X3",15000, true);
        System.out.println(example);
        example.ride();
        System.out.println(example.getcost());
        System.out.println(example.getcost("euro"));
        example.drugrace("AUDI","Mercedes");
    }
}
