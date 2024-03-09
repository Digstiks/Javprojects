package start.Lesson5;

public class continueex {
    public static void main(String[] args) {
        int[] results={1,4,6,3,5,6};
        for (int result:results){
            if(result==6){
               continue;
            }
            System.out.println("otzhim");
        }
    }
}
