package xyz.fengqing11.datasourcesmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fengqing11.datasourcesmybatis.mapper1.BookMapper1;
import xyz.fengqing11.datasourcesmybatis.mapper2.BookMapper2;
import xyz.fengqing11.datasourcesmybatis.pojo.Book;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookMapper1 bookMapper1;
    @Autowired
    BookMapper2 bookMapper2;

    @GetMapping("/test")
    public void test() {
        List<Book> bs1 = bookMapper1.getAllBooks();
        List<Book> bs2 = bookMapper2.getAllBooks();
        System.out.println("bs1:" + bs1);
        System.out.println("bs2:" + bs2);
    }

}
