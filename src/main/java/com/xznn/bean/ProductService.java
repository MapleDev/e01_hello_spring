package com.xznn.bean;

import org.springframework.stereotype.Component;

@Component("productService")
public class ProductService {

    public void doSomeService() {
        System.out.println("=== 业务类 doSomeService() ===");
    }

}
