package start.Lesson5;

public class multaiarray {
    public static void main(String[] args) {
        int[] group1={188,1488,156};
        int [] group2={178,163,152};
        int[][] allgroup={group1,group2};
        upperFor:
        for (int[]array:allgroup){
            for (int values: array){
                if (values ==178){
                    System.out.println(values);
                    System.out.println("Вор найден!!!!");
                    break upperFor;
                }
            }
        }
    }
}
