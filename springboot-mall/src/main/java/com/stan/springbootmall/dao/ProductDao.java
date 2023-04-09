package com.stan.springbootmall.dao;

import com.stan.springbootmall.constant.ProductCategory;
import com.stan.springbootmall.dto.ProductRequest;
import com.stan.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
