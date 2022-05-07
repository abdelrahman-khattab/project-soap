package com.restsoap.api.soap.services.impl;

import java.util.List;

import com.restsoap.api.entities.User;
import com.restsoap.api.exceptions.types.WSNotFoundEx;
import com.restsoap.api.services.impl.UserServicesImpl;
import com.restsoap.api.soap.services.UserWSSInt;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.restsoap.api.soap.services.UserWSSInt")
public class UserWSSImpl implements UserWSSInt {

    @Override
    public List<User> getAllUsers() {
        List<User> users = new UserServicesImpl().getAllUsers();
        if (users == null) {
            try {
                throw new WSNotFoundEx("There is no Users yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        return users;
    }

    @Override
    public User getUser(int id) {
        User user = new UserServicesImpl().getUser(id);
        if (user == null) {
            try {
                throw new WSNotFoundEx("There is no Users yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        return user;
    }

    @Override
    public String updateUser(User user) {
        // TODO Auto-generated method stub
        User user1 = new UserServicesImpl().getUser(user.getId());
        if (user1 == null) {
            try {
                throw new WSNotFoundEx("There is no Users yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new UserServicesImpl().updateUser(user);
        return "user updated";
    }

    @Override
    public String addUser(User user) {
        // TODO Auto-generated method stub
        new UserServicesImpl().addUser(user);
        return "user is added";
    }

    @Override
    public String deleteUser(int id) {
        User user1 = new UserServicesImpl().getUser(id);
        if (user1 == null) {
            try {
                throw new WSNotFoundEx("There is no Users yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new UserServicesImpl().updateUser(user1);
        return "user deleted";

    }

}
