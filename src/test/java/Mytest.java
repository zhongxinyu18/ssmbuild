import com.jone.po.Books;
import com.jone.service.BookService;
import com.jone.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {

    @Test
    public void test(){
        //1.需要获取spring整合的全部配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取spring容器中的service
        BookService bookService = context.getBean("BookServiceImpl",BookService.class);

        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
