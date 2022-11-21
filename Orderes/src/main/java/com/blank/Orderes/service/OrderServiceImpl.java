package com.blank.Orderes.service;

import com.blank.Orderes.entity.Orders;
import com.blank.Orderes.model.OrderRequest;
import com.blank.Orderes.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Override
    public Long placeOrder(OrderRequest orderResponse) {
        Orders order = Orders.builder()
                .amount(orderResponse.getAmount())
                .date(orderResponse.getDate())
                .Quantity(orderResponse.getQuantity())
                .productId(orderResponse.getProductId())
                .status(orderResponse.getStatus())
                .build();
        order = orderRepository.save(order);
        return order.getId();
    }
}
