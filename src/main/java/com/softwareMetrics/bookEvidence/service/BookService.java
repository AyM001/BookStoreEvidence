package com.softwareMetrics.bookEvidence.service;


import com.softwareMetrics.bookEvidence.model.BookModel;
import com.softwareMetrics.bookEvidence.repository.AuthorRepository;
import com.softwareMetrics.bookEvidence.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class BookService  {

    @Autowired
    private BookRepository bookRepository;


    public List<BookModel> getAll(){
        return bookRepository.findAll();
    }

    public List<BookModel> getbyAuthor(String name) {
        List<BookModel> allBooks = bookRepository.findAll();
        List<BookModel> filteredBooks = allBooks.stream().filter(bookModel -> bookModel.getAuthorModel().getName().equals(name)).collect(Collectors.toList());
        if (filteredBooks.isEmpty() || filteredBooks.size() == 0) {
            try {
                throw new MyCustomException();
            } catch (MyCustomException e) {
                System.out.println("This is for project purposes");
            }
        } else {
            return filteredBooks;
        }
        return filteredBooks;
    }

    public List<BookModel> getbyDescription(String keyword){
        List<BookModel> allBooks = bookRepository.findAll();
        return allBooks.stream().filter(bookModel -> bookModel.getDescription().equals(keyword)).collect(Collectors.toList());
    }

    public List<BookModel> getByField(String fieldName){
        List<BookModel> allBooks = bookRepository.findAll();
        return allBooks.stream().filter(bookModel -> bookModel.getFieldModel().getName().equals(fieldName)).collect(Collectors.toList());
    }

    public List<BookModel> getByPublisher(String publisherName){
        List<BookModel> allBooks = bookRepository.findAll();
        return allBooks.stream().filter(bookModel -> bookModel.getPublisherModel().getName().equals(publisherName)).collect(Collectors.toList());
    }

    public List<BookModel> getBetweenTwoYears(int year1 , int year2){
        List<BookModel> allBooks = bookRepository.findAll();
        return allBooks.stream().filter(bookModel -> bookModel.getReleaseYear() >= year1 && bookModel.getReleaseYear() <= year2).collect(Collectors.toList());
    }

    public void addBook(BookModel bookModel){
        bookRepository.save(bookModel);
    }

    public void deleteBook(BookModel bookModel){
        bookRepository.delete(bookModel);
    }

    public void updateBook(BookModel bookModel){
       Optional<BookModel> optional = bookRepository.findById(bookModel.getId());
       if (!optional.isPresent()){
           System.out.println("Book not found!");
       }
       else {
           BookModel updatedBook = optional.get();
           updatedBook.setName(bookModel.getName());
           updatedBook.setDescription(bookModel.getDescription());
           updatedBook.setAuthorModel(bookModel.getAuthorModel());
           updatedBook.setFieldModel(bookModel.getFieldModel());
           updatedBook.setPublisherModel(bookModel.getPublisherModel());
           bookRepository.save(updatedBook);
       }
    }
}
