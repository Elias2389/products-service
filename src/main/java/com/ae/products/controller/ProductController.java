package com.ae.products.controller;

import com.ae.products.model.Product;
import com.ae.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public List<Product> getProductsList() {
        return productService.findAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product productDetail(@PathVariable final Long id) {
        return productService.findProductById(id);
    }

}
