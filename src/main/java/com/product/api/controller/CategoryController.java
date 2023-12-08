package com.product.api.controller;

import com.product.api.entity.Category;
import com.product.api.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService service;

    @GetMapping()
    public ResponseEntity<List<Category>> getAll() {
        log.info("REST - To get all");
        return ResponseEntity.ok(service.getAll());
    }
}
