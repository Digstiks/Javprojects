package oop.lesson9.dog;

public class lesson9 {
    public static void main(String[] args) {
        Ovcharka ovcharka = new Ovcharka();
        Poodle poodle = new Poodle();

        System.out.printf("OVcharka info\n");
        ovcharka.run();
        ovcharka.bark();
        System.out.printf("Kolichestvo zubov:%d",ovcharka.getCountTooth());
        ovcharka.beAngry();
        System.out.printf("\n\n\n");

        System.out.printf("Pudel info\n");
        poodle.run();
        poodle.bark();
        System.out.printf("Kolichestvo zubov:%d",poodle.getCountTooth());


    }
}
