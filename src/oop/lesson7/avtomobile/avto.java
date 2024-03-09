package oop.lesson7.avtomobile;

import java.lang.ref.SoftReference;
import java.util.Arrays;

public class avto {
    String mark;
    String model;
    int price;
    boolean isAutomaticaly;

    public avto(String mark, String model, int price, boolean isAutomaticaly){
        this.isAutomaticaly=isAutomaticaly;
        this.mark=mark;
        this.model=model;
        this.price=price;

    }

    public void ride(){
        System.out.printf("wroom wroom");
    }

    public int getcost(){
        return this.price;

    }
    public String getcost(String valuta){
        return this.price+" "+valuta;
    }

    public void drugrace(String... cars){
        System.out.printf("Наш автомобиль %s %s обогнал %s ", this.mark,this.model, Arrays.toString(cars));
    }
    @Override
    public String toString() {
        return "avto{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isAutomaticaly=" + isAutomaticaly +
                '}';
    }
}
