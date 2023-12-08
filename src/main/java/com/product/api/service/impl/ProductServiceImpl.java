package com.product.api.service.impl;

import com.product.api.entity.Product;
import com.product.api.exception.ModeloNotFoundException;
import com.product.api.repository.ProductRepository;
import com.product.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModeloNotFoundException("ID NO ENCONTRADO" + id));
    }

    @Override
    public Product register(Product product) {
        return repository.save(product);
    }

    @Override
    public Product update(Product product) {
        return repository.save(product);
    }

    @Override
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
