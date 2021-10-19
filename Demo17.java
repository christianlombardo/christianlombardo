package com.company;

class Book2 {
    private String title;
    private String author;
    private int price;
    private String publisher;
    private String category;

    public Book2 (String title, String author, int price, String publisher, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.category = category;
    }

    public void display(){
        System.out.println("Book: Title = " + title +", Author = " + author + ", Price = " + price +
                ", Publisher = " + publisher + ", Category = " + category);
    }

}

public class Demo17 {
    public static void main(String[] args) {
        Book2 book1 = new Book2("Title 1", "author 1", 1000, "Publisher1", "Category1");
        book1.display();

        Book2 book2 = new Book2("Title 2", "Author 2", 2000, "Publisher2", "Category2");
        book2.display();
    }

}
