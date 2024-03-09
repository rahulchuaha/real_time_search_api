package com.search.restapi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.search.restapi.entity.Product;
import com.search.restapi.repository.ProductRepository;
import com.search.restapi.service.ProdectService;

@Service
public class ProductServiceImpl implements ProdectService{

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {

        List<Product> products = productRepository.searchProduct(query);
        return products;
       
    }

    @Override
    public Product createProdect(Product product) {
        return productRepository.save(product);
    }

    
}
