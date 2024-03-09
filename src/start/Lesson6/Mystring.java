package start.Lesson6;

public class Mystring {
    public static void main(String[] args) {
        String first="hey";
        String second="hey";
            System.out.println(first==second);
        String firstheap=new String("hey");
        String secondheap=new String("hey");
        System.out.println(firstheap==secondheap);
        System.out.println(firstheap.equals(secondheap));
    }
}
