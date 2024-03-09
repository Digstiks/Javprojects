package start.Lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x=5;
        int y=10;
//        int[] Array= new int[2];
//        Array[0]=x;
//        Array[1]=y;
        int [] Array=new int[] {x,y};
        System.out.println(Arrays.toString(Array));
        int[] arr2= new int[2];
        arr2[0]=Array[0];
        arr2[1]=Array[1];
        System.out.println(Arrays.toString(arr2));
    }
}
