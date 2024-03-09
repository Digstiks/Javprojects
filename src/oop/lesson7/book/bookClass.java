package oop.lesson7.book;

public class bookClass {
    String bookname;
    String author;
    int pages;
    boolean isDocumentaly;
    public String getColums(){
       return "colums: "+this.pages*40 ;
    }

    public String getColums(int colums){
        return "colums: "+this.pages*colums;
    }

    public bookClass(){
        bookname="Voina i mir";
        author="Tosltoy";
        pages=1488;
        isDocumentaly=false;
    }
    public bookClass(String bookname, String author, int pages, boolean isDocumentaly){
        this.isDocumentaly=isDocumentaly;
        this.pages=pages;
        this.author=author;
        this.bookname=bookname;
    }

    public void bookInfo(){
        System.out.printf("this is %s from %s have %d pages this is %s",this.bookname,this.author,this.pages,this.isDocumentaly? "Documentaly":"Non documentaly.\n");
    }
    @Override
    public String toString() {
        return "bookClass{" +
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", isDocumentaly=" + isDocumentaly +
                '}';
    }
}

