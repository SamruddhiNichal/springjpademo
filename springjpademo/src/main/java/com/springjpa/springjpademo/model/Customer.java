package com.springjpa.springjpademo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private String city;


    @ManyToMany
    @JoinTable(name = "cust_prod",
            joinColumns = @JoinColumn(name = "cust_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name ="prod_id",referencedColumnName = "id"))
    private Set<Product> productSet;

}
