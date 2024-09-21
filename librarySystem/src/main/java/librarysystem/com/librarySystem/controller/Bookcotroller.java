package librarysystem.com.librarySystem.controller;

import librarysystem.com.librarySystem.model.Book;
import librarysystem.com.librarySystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class Bookcotroller {

    private final BookService bookServices;


    @Autowired


    public Bookcotroller(BookService bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping("/{book_id}")
    public Book getBookById(@PathVariable("book_id") String bookId) {
        return bookServices.getBookById(bookId);
    }

    @PostMapping
    public String addNewBook(@RequestBody Book book) {
        return bookServices.createbook(book);
    }

    @PutMapping
    public String updateBookInformation(@RequestBody Book book) {
        return bookServices.updatebook(book);
    }

    @DeleteMapping("/{book_id}")
    public String deleteBook(@PathVariable("book_id") String bookId) {
        return bookServices.deleteExestedbookbyID(bookId);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookServices.getallbooks();
    }

    @GetMapping("/search")
    public List<Book> getByBookName(@RequestParam("book_name") String bookName) {
        return bookServices.getbookbyname(bookName);
    }
}
