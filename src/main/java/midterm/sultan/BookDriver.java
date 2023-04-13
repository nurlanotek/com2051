package midterm.sultan;

import midterm.Author;
import midterm.Book;

import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
    // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", new Author[] {ahTeck}, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + Arrays.toString(dummyBook.getAuthors()));  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthors()[0].getName());
        System.out.println("Author's email is: " + dummyBook.getAuthors()[0].getEmail());

    }
}
