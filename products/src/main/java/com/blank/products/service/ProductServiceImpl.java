package com.blank.products.service;

import com.blank.products.entitiy.Product;
import com.blank.products.exceptions.ProductCustomException;
import com.blank.products.models.ProductRequest;
import com.blank.products.models.ProductResponse;
import com.blank.products.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Long addProduct(ProductRequest productRequest) {
        log.info("adding product to the DB...");
        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();
        product = productRepository.save(product);

        log.info("product created...");

        return product.getId();
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream()
                .map(
                        product -> ProductResponse.builder()
                                .name(product.getName())
                                .quantity(product.getQuantity())
                                .price(product.getPrice())
                                .build()
                )
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponse getProduct(Long id) throws RuntimeException {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductCustomException("product not found", "PRODUCT_NOT_FOUND"));

        return ProductResponse.builder()
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();
    }
}
