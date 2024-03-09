package start.Lesson5;

public class whileexample {
    public static void main(String[] args) {
        int count=1;
        while (count<10){
            System.out.println(count);
            count ++;
            if(count ==7){
                break;
            }
        }
    }
}
