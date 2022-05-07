package com.restsoap.api.soap.services.impl;

import java.util.List;

import com.restsoap.api.entities.Category;
import com.restsoap.api.exceptions.types.WSNotFoundEx;
import com.restsoap.api.services.impl.CategoryServicesImpl;
import com.restsoap.api.soap.services.CategoryWSSInt;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.restsoap.api.soap.services.CategoryWSSInt")
public class CategoryWSSImpl implements CategoryWSSInt {

    @Override
    public String deleteCategory(int id) {

        Category category = new CategoryServicesImpl().getCategory(id);
        if (category == null) {
            try {
                throw new WSNotFoundEx("There is no category like this");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new CategoryServicesImpl().deleteCategory(category);
        return "category deleted";
    }

    @Override
    public Category getCategory(int id) {
        Category category = new CategoryServicesImpl().getCategory(id);
        if (category == null) {
            try {
                throw new WSNotFoundEx("There is no category like this");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }        
        return category;
    }

    @Override
    public String updateCategory(Category category) {
        Category category2 = new CategoryServicesImpl().getCategory(category.getId());
        if (category2 == null) {
            try {
                throw new WSNotFoundEx("There is no category like this");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        new CategoryServicesImpl().updateCategory(category);
        return null;
    }

    @Override
    public String addCategory(Category category) {
        // TODO Auto-generated method stub
        new CategoryServicesImpl().addCategory(category);
        return "Category added";
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> categories = new CategoryServicesImpl().getAllCategories();
        if (categories == null) {
            try {
                throw new WSNotFoundEx("There is no categories Yet");
            } catch (WSNotFoundEx e) {
                // TODO Auto-generated catch block
                e.getMessage();
            }
        }
        return categories;
    }

}
