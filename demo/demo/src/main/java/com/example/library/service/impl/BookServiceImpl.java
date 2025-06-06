package com.example.library.service.impl;

import com.example.library.entity.Book;
import com.example.library.mapper.BookMapper;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book getBookById(String bookId) {
        return bookMapper.getBookById(bookId);
    }

    @Override
    public Book getBookByName(String bookName) {
        return bookMapper.getBookByName(bookName);
    }
}