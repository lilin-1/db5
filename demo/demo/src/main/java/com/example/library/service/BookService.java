package com.example.library.service;

import com.example.library.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(String bookId);
    Book getBookByName(String bookName);
}