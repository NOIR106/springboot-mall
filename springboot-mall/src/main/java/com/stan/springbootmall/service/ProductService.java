package com.stan.springbootmall.service;

import com.stan.springbootmall.dto.ProductRequest;
import com.stan.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
