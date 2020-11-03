package com.jone.controller;

import com.jone.po.Books;
import com.jone.service.BookService;
import com.jone.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController {
    /**
     * controller 调用 service层,注入service接口
     */
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    /**
     * 查询全部数据，将结果返回页面！
     *   使用Model封装数据，使用视图解析器返回页面
     * @return
     */
    @RequestMapping("/all")
    public String getAllBooks(Model model){
        model.addAttribute("allbooks",bookService.queryAllBook());
        return "allbooks";
    }

    /**
     * 增加书籍，跳转增加书籍页面！
     *
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
       return "addbook";
    }

    /**
     * 增加书籍处理方法，添加完成后跳转查询全部书籍
     */
    @PostMapping("addbook")
    public String addbook(Books books){
        bookService.addBook(books);
        /**
         * 添加完成后：
         * 使用重定向"redirect:/book/all"到显示所有书籍的请求
         * 这种方式实现请求复用；
         */

        return "redirect:/book/all";
    }

    /**
     * 删除数据
     */
    @RequestMapping("del/{bookId}")
    public String delbook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/all";
    }

    /**
     * 修改书籍，跳转修改书籍页面！
     *
     * @return
     */
    @RequestMapping("/toUpdateBook/{id}")
    public String toUpdatePaper(@PathVariable int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updatebook";
    }

    /**
     * 修改书籍！
     *
     * @return
     */
    @RequestMapping("/upBook")
    public String updateBook(Books books){
        System.out.println(books);
        bookService.updateBook(books);
        return "redirect:/book/all";
    }

    /**
     * 根据书名搜索书籍
     */
    @RequestMapping("/queryBookByName")
    public String findBookByName(String bookName,Model model){
        System.out.println("bookName----->"+bookName);
        List<Books> list = bookService.queryBookByName(bookName);
        System.out.println(list);
        if (list.size() == 0){
            list = bookService.queryAllBook();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("allbooks",list);
        return "allbooks";
    }
}
