package com.springjpa.springjpademo.repository;

import com.springjpa.springjpademo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query(value = " SELECT a.id,a.name FROM product a LEFT JOIN " +
            "cust_prod b ON b.prod_id=a.id WHERE b.prod_id IS NULL",nativeQuery = true )
    List<Product> findAllUnsoldProduct();
}
