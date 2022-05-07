package com.restsoap.api.soap.services.impl;

import java.util.List;

import com.restsoap.api.entities.Product;
import com.restsoap.api.exceptions.types.WSNotFoundEx;
import com.restsoap.api.services.impl.ProductServicesImpl;
import com.restsoap.api.soap.services.ProductWSSInt;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.restsoap.api.soap.services.ProductWSSInt")
public class ProductWSSImpl implements ProductWSSInt {

    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ProductServicesImpl().getAllProducts();
        if (products == null) {
            try {
                throw new WSNotFoundEx("There is no Products yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        return products;
    }

    @Override
    public String addProduct(Product product) {
        // TODO Auto-generated method stub
        new ProductServicesImpl().addProduct(product);
        return "Product is added";
    }

    @Override
    public String updateProduct(Product product) {
        Product product2 = new ProductServicesImpl().getProduct(product.getId());
        if (product2 == null) {
            try {
                throw new WSNotFoundEx("There is no Product  with this id");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new ProductServicesImpl().updateProduct(product);
        return "Products is updated";

    }

    @Override
    public String deleteProduct(int id) {
        Product product2 = new ProductServicesImpl().getProduct(id);
        if (product2 == null) {
            try {
                throw new WSNotFoundEx("There is no Product  with this id");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new ProductServicesImpl().deleteProduct(product2);
        return null;
    }

    @Override
    public Product getProduct(int id) {
        Product product2 = new ProductServicesImpl().getProduct(id);
        if (product2 == null) {
            try {
                throw new WSNotFoundEx("There is no Product  with this id");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        return product2;
    }

}
