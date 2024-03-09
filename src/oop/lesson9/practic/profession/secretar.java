package oop.lesson9.practic.profession;

public final class secretar extends oficeMan {

    public secretar(String sex) {
        super(sex);
        super.payCost=30_000;
    }

    public String printDocs(){
        return "Печатаю доки на говно\n";
    }
    @Override
    public String getPayCost() {
        return String.format("Cекретарь получил зп %d рублей\n", this.payCost);
    }

    @Override
    public String drinkCoffee() {
        return "Секретарь пьет кофе\n";
    }
}
