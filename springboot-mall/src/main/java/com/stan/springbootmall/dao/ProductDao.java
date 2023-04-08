package com.stan.springbootmall.dao;

import com.stan.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
