package com.jone.service;

import com.jone.po.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * 业务层接口
 */
import java.util.List;

@Service
public interface BookService {

    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部的书
    List<Books> queryAllBook();
    //根据书名搜索书籍(假定书名不唯一)
    List<Books> queryBookByName(String bookName);
}
