package com.blank.products.service;


import com.blank.products.entitiy.Product;
import com.blank.products.models.ProductRequest;
import com.blank.products.models.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {


    Long addProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse getProduct(Long id) throws Exception;
}
