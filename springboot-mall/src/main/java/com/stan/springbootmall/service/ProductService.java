package com.stan.springbootmall.service;

import com.stan.springbootmall.dto.ProductRequest;
import com.stan.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
