package start.Lesson6;

public class stringPractic {
    public static void main(String[] args) {
        String text = "my name is Zinchenko Boris";
        String[] subtext=text.substring(11).toLowerCase().split(" ");
        for(String elements:subtext){
            System.out.println(elements);
            System.out.println(elements.length());
        }
    }
}
