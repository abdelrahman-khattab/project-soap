package com.restsoap.api.soap.services;

import java.util.List;

import com.restsoap.api.entities.Product;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductWSSInt {
    @WebMethod
    public List<Product> getAllProduct();

    @WebMethod
    public String addProduct(Product product);

    @WebMethod
    public String updateProduct(Product product);

    @WebMethod
    public String deleteProduct(int id);

    @WebMethod
    public Product getProduct(int id);
}
