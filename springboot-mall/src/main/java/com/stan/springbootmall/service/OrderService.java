package com.stan.springbootmall.service;

import com.stan.springbootmall.dto.CreateOrderRequest;
import com.stan.springbootmall.dto.OrderQueryParams;
import com.stan.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
