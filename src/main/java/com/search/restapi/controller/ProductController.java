package com.search.restapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.search.restapi.entity.Product;
import com.search.restapi.service.ProdectService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProdectService prodectService;

  

    public ProductController(ProdectService prodectService) {
        this.prodectService = prodectService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return ResponseEntity.ok(prodectService.searchProducts(query));
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return prodectService.createProdect(product);
    }
    
}
