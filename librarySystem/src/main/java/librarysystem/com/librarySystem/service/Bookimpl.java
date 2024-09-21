package librarysystem.com.librarySystem.service;

import librarysystem.com.librarySystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Bookimpl implements BookService {
    private final BookRepository bookRepository;
@Autowired
    public Bookimpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
@Override
    public String createbook(Book book){
        bookRepository.save(book);
    return "book has been added";
}
@Override
    public String updatebook(Book book) {
        bookRepository.save(book);
        return "book has ben apdated";
    }

    @Override
    public Book getBookById(String bookId) {
        return bookRepository.findById(bookId).orElse(null);

    }
@Override
    public String deleteExestedbookbyID (String bookId){
        bookRepository.deleteById(bookId);
    return "book is deleted";
      }

    @Override
    public List<Book> getallbooks() {
        return  bookRepository.findAll();

    }

    @Override
    public List<Book> getbookbyname(String bookName) {
        return bookRepository.findByBookName(bookName);
    }


}
