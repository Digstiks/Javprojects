package oop.lesson9.practic.profession;

public abstract class profession {
    public profession(String sex) {
        this.sex = sex;
    }

    protected int payCost;
    protected String sex;
    public abstract String getPayCost();


}
