package com.softwareMetrics.bookEvidence.controller;


import com.softwareMetrics.bookEvidence.model.BookModel;
import com.softwareMetrics.bookEvidence.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {


    @Autowired
    private BookService bookService;


    @GetMapping("/getBooks")
    public List<BookModel> getAllBook(){
       return bookService.getAll();
    }

    @GetMapping("/getBooksByAuthor/{name}")
    public List<BookModel> getByAuthorName(@PathVariable(name = "name")  String name){
       return bookService.getbyAuthor(name);
    }

    @GetMapping("/getBooksByKeywords/{keyword}")
    public List<BookModel> getByDescription(@PathVariable(name = "keyword")  String keyword){
       return bookService.getbyDescription(keyword);
    }

    @GetMapping("/getBooksByFieldOfActivity/{field}")
    public List<BookModel> getByField(@PathVariable(name = "field")  String field){
       return bookService.getByField(field);
    }

    @GetMapping("/getBooksByPublisher/{publisher}")
    public List<BookModel> getByPublisher(@PathVariable(name = "publisher")  String publisher){
       return bookService.getByPublisher(publisher);
    }

    // have to check
    @GetMapping("/getBooksBetweenTwoYears/{year1}/{year2}")
    public List<BookModel> getByYear(@PathVariable(name = "year1")  int year1, @PathVariable(name = "year2")  int year2){
       return bookService.getBetweenTwoYears(year1 , year2);
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody BookModel bookModel){
        bookService.addBook(bookModel);
    }

    @DeleteMapping("/deleteBook")
    public void deleteBook(@RequestBody BookModel bookModel){
        bookService.deleteBook(bookModel);
    }

    @PutMapping("/updateBook")
    public void updateBook(@RequestBody BookModel bookModel){
        bookService.updateBook(bookModel);
    }
}
