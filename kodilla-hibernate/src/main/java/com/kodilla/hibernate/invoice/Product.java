package com.kodilla.hibernate.invoice;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @Column(name="PRODUCTNAME")
    private String name;


    public Product(String name) {
        this.name = name;
    }
}
