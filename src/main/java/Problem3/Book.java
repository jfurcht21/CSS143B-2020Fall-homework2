package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Book))
        {
            return false;
        }
        Book book = (Book) obj;
        if(this.id == book.id)
        {
            return true;
        }
        return false;
    }
}
