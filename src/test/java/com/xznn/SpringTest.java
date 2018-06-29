package com.xznn;

import com.xznn.bean.ProductService;
import com.xznn.bean.Category;
import com.xznn.bean.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class SpringTest {

    @Test
    public void shouldAnswerWithTrue() {
        Category category = new Category();
        category.setId(1);
        category.setName("TV");
        System.out.println("传统的方式： \n" +
                "通过new 关键字主动创建一个对象\n" +
                "category = " + category);
    }

    @Test
    public void testDI() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        Category category = (Category) context.getBean("category");
        Product product = (Product) context.getBean("product");
        System.out.println("IOC方式：\n" +
                "对象的生命周期由Spring来管理。\n" +
                "category = " + category + "\n" +
                "product = " + product);
    }

    @Test
    public void testAOP() {

//        new ProductService().doSomeService();

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        ProductService productService = (ProductService) context.getBean("productService");
        productService.doSomeService();
    }

}
