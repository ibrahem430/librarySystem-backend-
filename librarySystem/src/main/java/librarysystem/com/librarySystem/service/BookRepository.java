package librarysystem.com.librarySystem.service;

import librarysystem.com.librarySystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository <Book,String> {
    List<Book> findByBookName(String bookName);
}