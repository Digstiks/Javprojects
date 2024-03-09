package oop.lesson9.practic.profession;

public final class security extends profession {
    public security(String sex) {
        super(sex);
        super.payCost=15_000;

    }
    public static String secure(){
        return "Стерегу говно\n";
    }

    @Override
    public String getPayCost() {
        return String.format("Охранник получил зп %d рублей\n", this.payCost);
    }
}
