package oop.lesson9.practic.profession;

public final class buhgalter extends oficeMan {
    public buhgalter(String sex) {
        super(sex);
        super.payCost=50_000;

    }
    public String countMoney(){
        return "Считаю говно\n";

    }
    @Override
    public String drinkCoffee() {
        return "Бухгалтер пьет кофе\n";

    }


    @Override
    public String getPayCost() {
        return String.format("Бухгалтер получил зп %d рублей\n", this.payCost);
    }
}
