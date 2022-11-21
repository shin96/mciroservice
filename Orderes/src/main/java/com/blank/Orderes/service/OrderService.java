package com.blank.Orderes.service;

import com.blank.Orderes.model.OrderRequest;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    Long placeOrder(OrderRequest orderResponse);
}
