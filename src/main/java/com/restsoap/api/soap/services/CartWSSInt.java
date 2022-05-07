package com.restsoap.api.soap.services;

import java.util.List;

import com.restsoap.api.entities.Cart;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface CartWSSInt {

    @WebMethod
    public List<Cart> getAllCart();

    @WebMethod
    public String updateCart(Cart cart);

    @WebMethod
    public String addCart(Cart cart);

    @WebMethod
    public Cart getCart(int id);

    @WebMethod
    public String deleteCart(int id);
}
