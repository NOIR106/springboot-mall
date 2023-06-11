package com.stan.springbootmall.service;

import com.stan.springbootmall.dto.CreateOrderRequest;
import com.stan.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
