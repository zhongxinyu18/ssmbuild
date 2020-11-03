package com.jone.service;

import com.jone.dao.BookMapper;
import com.jone.po.Books;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    /**
     * service业务层调研dao层
     * 将dao注入
     */
    private BookMapper bookMapper;
    //set注入dao
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {

        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
