package com.example.Test1205.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "product")
@Table(name = "product")
public class ProductEntity {
    @Id
    private int product_num;
    private String product_name;
    private int product_price;
    private int product_stock;
}
