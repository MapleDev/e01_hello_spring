package com.xznn;

import com.xznn.bean.Category;
import com.xznn.bean.Product;
import com.xznn.bean.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AnnotationSpringTest {

    @Autowired
    Category mCategory;

    @Test
    public void testAOPByAnnotation() {
        System.out.println("mCategory = " + mCategory);
    }
}
