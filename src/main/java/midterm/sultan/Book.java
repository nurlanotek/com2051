package midterm.sultan;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        String[] list = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            list[i] = authors[i].toString();
        }

        return "Book{" +
                "name='" + name + '\'' +
                ", authors={" + String.join(",",list) +'}'+
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String getAuthorsNames(){
        String[] names = new String[authors.length];
        for (int i = 0; i < authors.length; i++) {
            names[i] = authors[i].getName();
        }
        return String.join(",",names);
    }
}