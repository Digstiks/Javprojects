package start.Lesson6;

public class stringzadacha {
    public static void main(String[] args) {
        String mark="BMW";
        String model="M3";
        int price=150_000;
        boolean isAutomaticaly=true;
        System.out.printf("Привет, меня зовут некит и я продаю %s %s стоимостью %d у нее автомат? %s", mark,model,price,isAutomaticaly ? "да":"нет");
    }
}
