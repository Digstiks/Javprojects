package oop.lesson8;

public class car {
    private String brand;

    //static var
    private static int countCars=0;

    public car(String brand) {
        this.brand = brand;
        countCars++;
    }
    public static int getCountCars(){
        return countCars;
    }

    public final static String BMW_INFO="bmw- немецкая машина";
    public final static String KIA_INFO="kia- корейская машина";

    public final static String[] ALL_CAR_INFO= new String[2];

    static{ALL_CAR_INFO[0]=BMW_INFO;
        ALL_CAR_INFO[1]=KIA_INFO;
    }
}
