package com.blank.products.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Table(name = "PRODUCT")
public class Product {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="ID")
    private Long id;
//    @Column(name = "NAME")
    private String name;
//    @Column(name = "PRICE")
    private Long price;
//    @Column(name = "QUANTITY")
    private Long quantity;

}
