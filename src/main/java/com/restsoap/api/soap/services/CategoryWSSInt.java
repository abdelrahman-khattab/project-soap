package com.restsoap.api.soap.services;

import java.util.List;

import com.restsoap.api.entities.Category;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CategoryWSSInt {

    @WebMethod
    public String deleteCategory(int id);

    @WebMethod
    public Category getCategory(int id);

    @WebMethod
    public String updateCategory(Category category);

    @WebMethod
    public String addCategory(Category category);

    @WebMethod
    public List<Category> getAllCategory();

}
