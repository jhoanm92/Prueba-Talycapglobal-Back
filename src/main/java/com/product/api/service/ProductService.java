package com.product.api.service;

import com.product.api.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    Product getById(Integer id);
    Product register(Product product);
    Product update(Product product);
    void delete(Integer id);


}
