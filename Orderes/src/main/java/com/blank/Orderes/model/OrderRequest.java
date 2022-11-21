package com.blank.Orderes.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {

    private PaymentMode paymentMode;
    private Long productId;
    private Long Quantity;
    private Instant date;
    private String status;
    private Long amount;

}
