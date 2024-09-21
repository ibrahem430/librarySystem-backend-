package librarysystem.com.librarySystem.service;

import librarysystem.com.librarySystem.model.Book;

import java.util.List;

public interface BookService {

String createbook(Book book);
    String updatebook (Book book);
    Book getBookById(String bookId);

   String deleteExestedbookbyID(String bookId);

   List<Book> getallbooks();
  List <Book> getbookbyname(String bookName);

}
