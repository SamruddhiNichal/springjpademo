package com.springjpa.springjpademo.repository;

import com.springjpa.springjpademo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "SELECT a.id,a.name,b.prod_id FROM customer a LEFT JOIN " +
            "cust_prod b ON b.cust_id=a.id;",nativeQuery = true)
    List getCustProdList();
}
