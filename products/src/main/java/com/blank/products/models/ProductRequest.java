package com.blank.products.models;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ProductRequest {
    private String name;
    private Long price;
    private Long quantity;
}
