package oop.lesson7.book;

public class bookMain {
    public static void main(String[] args) {
        bookClass book1 = new bookClass();
        bookClass book2=new bookClass("Onegin","Pushkin",228,false);
        System.out.println(book1.getColums());
        System.out.println(book2.getColums(38));
        System.out.println(book1);
        System.out.println(book2);
        book1.bookInfo();
        book2.bookInfo();
    }
}
