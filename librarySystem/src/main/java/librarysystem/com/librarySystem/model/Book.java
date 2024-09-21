package librarysystem.com.librarySystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @Column(name="book_id")

    private String bookId;

    @Column(name="book_name")

    private String bookName;

    @Column(name="book_author")

    private String bookAuthor;

    @Column(name="book_category")

    private String bookCategory;

    public Book() {
    }

    public Book(String bookLd, String bookName, String bookAuthor, String bookCategory) {
        this.bookId = bookLd;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
    }
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }


}
