package oop.lesson7.zoo;

import oop.lesson7.Cat;
import oop.lesson7.Dog;

public class zoo {
    private Cat cat;
    private Dog dog;

    public zoo(Dog dog, Cat cat){
        this.cat=cat;
        this.dog=dog;
    }

    //Dependency injection
    public void feed(){
        dog.feed("костяшки");
        cat.feed("рыба","молоко");
    }
}
