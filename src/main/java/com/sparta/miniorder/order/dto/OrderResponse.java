package com.sparta.miniorder.order.dto;

import com.sparta.miniorder.order.entity.Order;
import com.sparta.miniorder.product.entity.Product;
import lombok.Getter;

@Getter
public class OrderResponse {
    private Long orderId;
    private Long productId;
    private String productName;
    private Integer price;

    public OrderResponse(Order order) {
        this.orderId = order.getId();
        this.productId = order.getProduct().getId();
        this.productName = order.getProduct().getName();
        this.price = order.getProduct().getPrice();
    }
}
