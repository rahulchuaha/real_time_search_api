package com.search.restapi.service;

import java.util.List;

import com.search.restapi.entity.Product;

public interface ProdectService {

    List<Product> searchProducts(String query);

    Product createProdect(Product product);
    
}
