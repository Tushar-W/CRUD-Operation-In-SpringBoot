package com.bl.springboot.repository;

import com.bl.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
