package koza.dev.bookcatalog.service;

import koza.dev.bookcatalog.entity.Book;
import koza.dev.bookcatalog.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public void createBook(String title, String author){
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        repository.save(book);
    }
}
