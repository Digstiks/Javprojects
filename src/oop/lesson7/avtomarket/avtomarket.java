package oop.lesson7.avtomarket;

import java.util.Arrays;

public class avtomarket {
    private String model;//атрибуты класса
    private String mark;
    private int cost;
    private int horsePower;
    //Блок инициализации
    {
        System.out.printf("Привезли новую машину");
    }

    //Конструктор
    public avtomarket(String model, String mark, int cost, int horsePower) {
        this.model = model;
        this.mark = mark;
        this.cost = cost;
        this.horsePower = horsePower;
    }


    //сеттеры
    public void setModel(String model){
        this.model=model;
    }

    public void setMark(String mark){
        this.mark=mark;
    }

    public void setCost(int cost){
       if (cost>0){
        this.cost=cost;}
       else {this.cost=1000;}

    }

    public void setHorsePower(int horsePower){
        if (horsePower>0){
            this.horsePower=horsePower;}
        else {this.horsePower=10;}
    }


    //Геттеры
    public String getModel(){
        return this.model;
    }

    public String getMark(){
        return this.mark;
    }

    public int getCost(){
        return cost;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public void carwash(){
        System.out.printf("Машину помыли");
    }

    public void drugrace(String... cars){
        System.out.printf("Наш автомобиль %s %s обогнал %s ", this.mark,this.model, Arrays.toString(cars));
    }

    //ту Стринг
    @Override
    public String toString() {
        return "avtomarket{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", cost=" + cost +
                ", horsePower=" + horsePower +
                '}';
    }
}
