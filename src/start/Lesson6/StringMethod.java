package start.Lesson6;

public class StringMethod {
    public static void main(String[] args) {
        String text="Hello world!";

        String textupper=text.toUpperCase();
        System.out.println(textupper);

        String textLower=text.toLowerCase();
        System.out.println(textLower);

        int textcounter=text.length();
        System.out.println(textcounter);

        boolean contain=text.contains("Hello");
        System.out.println(contain);

        String textReplace=text.replaceAll("r","a");
        System.out.println(textReplace);

        String textRepeat=text.repeat(3);
        System.out.println(textRepeat);

        String names="Anton;Vasya;Nekit;Vitalya;Timurbek";
        String[] namesArray=names.split(";");
        for(String name:namesArray){
            System.out.println(name);
        }
    }
}
