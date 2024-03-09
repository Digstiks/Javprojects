package oop.lesson8;

public class Hotgogs {
    private static int sausageCount=100;
    private static int breadCount=100;
    public void doHotDog() {
        if (sausageCount > 0 && breadCount > 0) {
            sausageCount -= 1;
            breadCount -= 1;
            System.out.printf("Хотдог готов!");
        } else {
            System.out.printf("Хотдоги закончились");
        }
    }
        public void priemka() {
            sausageCount+=100;
            breadCount+=200;
        }

        public static String getIngredients(){
            String ingredients=String.format("Количество сосисок: %d, количество булок: %d",sausageCount,breadCount);
            return ingredients;
        }
    }

