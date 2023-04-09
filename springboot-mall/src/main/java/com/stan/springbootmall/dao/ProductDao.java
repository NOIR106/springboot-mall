package com.stan.springbootmall.dao;

import com.stan.springbootmall.dto.ProductRequest;
import com.stan.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
