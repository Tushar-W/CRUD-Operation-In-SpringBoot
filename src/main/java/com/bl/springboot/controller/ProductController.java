package com.bl.springboot.controller;

import com.bl.springboot.model.Product;
import com.bl.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> list(){
        return service.listAll();
    }

    @GetMapping("/products/{id}")
    public Product get(@PathVariable Integer id){
        return service.get(id);
    }

    @PostMapping("/products")
    public void add(@RequestBody Product product){
        service.save(product);
    }

    @PutMapping("/products/{id}")
    public void update(@RequestBody Product product, @PathVariable Integer id){
        Product existProduct = service.get(id);
        service.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
