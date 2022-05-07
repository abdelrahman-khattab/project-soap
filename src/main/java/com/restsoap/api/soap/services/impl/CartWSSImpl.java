package com.restsoap.api.soap.services.impl;

import java.util.List;

import com.restsoap.api.entities.Cart;
import com.restsoap.api.exceptions.types.WSNotFoundEx;
import com.restsoap.api.services.impl.CartServicesImpl;
import com.restsoap.api.soap.services.CartWSSInt;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.restsoap.api.soap.services.CartWSSInt")
public class CartWSSImpl implements CartWSSInt {

    @Override
    public List<Cart> getAllCart() {
        List<Cart> carts = new CartServicesImpl().getAllCarts();
        if (carts == null) {
            try {
                throw new WSNotFoundEx("There is no Carts yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }

        return carts;
    }

    @Override
    public String updateCart(Cart cart) {
        Cart cart1 = new CartServicesImpl().getCart(cart.getId());
        if (cart1 == null) {
            try {
                throw new WSNotFoundEx("There is no Cart with this id");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new CartServicesImpl().updateCart(cart);
        return "Cart Updated";
    }

    @Override
    public String addCart(Cart cart) {
        new CartServicesImpl().addCart(cart);
        return "Cart is added";
    }

    @Override
    public Cart getCart(int id) {
        Cart cart1 = new CartServicesImpl().getCart(id);
        if (cart1 == null) {
            try {
                throw new WSNotFoundEx("There is no Cart with this id");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }

        return cart1;
    }

    @Override
    public String deleteCart(int id) {
        Cart cart1 = new CartServicesImpl().getCart(id);
        if (cart1 == null) {
            try {
                throw new WSNotFoundEx("There is no Cart with this id");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new CartServicesImpl().deleteCart(cart1);
        return "Cart Delete";
    }

}
