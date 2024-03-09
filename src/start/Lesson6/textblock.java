package start.Lesson6;

public class textblock {
    public static void main(String[] args) {
        String text1="zaza";
        String text2="aue";

        String text= """
                safasfs %s
                safsasfsafs
                asfsasfs %s""".formatted(text1,text2);
        System.out.printf(text);
    }
}
