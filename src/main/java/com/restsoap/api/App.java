package com.restsoap.api;

import com.restsoap.api.entities.Product;
import com.restsoap.api.entities.User;
import com.restsoap.api.persistance.CategoryInt;
import com.restsoap.api.persistance.ProductInt;
import com.restsoap.api.persistance.UserInt;
import com.restsoap.api.persistance.impl.CategoryImpl;
import com.restsoap.api.persistance.impl.ProductImpl;
// import com.restsoap.api.utils.mappers.ProductMapper;
import com.restsoap.api.persistance.impl.UserImpl;

public class App {
    public static void main(String[] args) {
        ProductInt productInt = new ProductImpl();
        CategoryInt categoryInt = new CategoryImpl();
        UserInt userInt = new UserImpl();
        // Product product = new Product(categoryInt.getCategory(1), "Ball", "5",
        // "in-stock", 150.0);
        // productInt.addProduct(product);
        // Product product = productInt.getProduct(1);
        // product.setName("tennis ball");
        // product = productInt.updateProduct(product);
        System.out.println(productInt.getAllProducts());
        System.out.println(productInt.getProduct(1));

        // User user = new User("email@email.com");
        System.out.println(userInt.getAllUsers());

        // ProductBean productBean =
        // ProductMapper.INSTANCE.productEntityToBean(product);

        // System.out.println("Product" + productBean.getName());

    }
}
