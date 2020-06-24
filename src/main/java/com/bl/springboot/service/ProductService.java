package com.bl.springboot.service;

import com.bl.springboot.model.Product;
import com.bl.springboot.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private IProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }
}