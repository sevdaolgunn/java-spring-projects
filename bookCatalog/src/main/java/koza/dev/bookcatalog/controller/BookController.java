package koza.dev.bookcatalog.controller;


import koza.dev.bookcatalog.entity.Book;
import koza.dev.bookcatalog.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books/")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("create")
    private void createBook(@RequestParam String title, String author){
        bookService.createBook(title,author);
    }




}
