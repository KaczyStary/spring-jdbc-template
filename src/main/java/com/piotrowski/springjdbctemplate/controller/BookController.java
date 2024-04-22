package com.piotrowski.springjdbctemplate.controller;

import com.piotrowski.springjdbctemplate.model.Book;
import com.piotrowski.springjdbctemplate.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> books(){
        return bookService.findAllBooks();
    }

    @PostMapping("")
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable int id){
        final int i = bookService.deleteBookById(id);
        if (i == 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> findBook(@PathVariable int id){
        return ResponseEntity.of(bookService.findBookById(id));
    }
}
