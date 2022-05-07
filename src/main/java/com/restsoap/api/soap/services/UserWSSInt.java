package com.restsoap.api.soap.services;

import java.util.List;

import com.restsoap.api.entities.User;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface UserWSSInt {
    @WebMethod
    public List<User> getAllUsers();

    @WebMethod
    public User getUser(int id);

    @WebMethod
    public String updateUser(User user);

    @WebMethod
    public String addUser(User user);

    @WebMethod
    public String deleteUser(int id);
}
