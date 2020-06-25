package com.bl.springboot.service;

import com.bl.springboot.model.Product;
import com.bl.springboot.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }

    public Product get(Integer id){
        return repo.findById(id).get();
    }

    public void save(Product product){ repo.save(product); }

    public void delete(Integer id){ repo.deleteById(id); }

}
