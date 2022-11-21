package com.blank.Orderes.controllers;

import com.blank.Orderes.model.OrderRequest;
import com.blank.Orderes.service.OrderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest orderResponse) {

        Long orderId = orderService.placeOrder(orderResponse);
        return new ResponseEntity<>(orderId, HttpStatus.CREATED);

    }
}
