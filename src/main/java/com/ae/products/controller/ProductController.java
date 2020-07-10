package com.ae.products.controller;

import com.ae.products.model.Product;
import com.ae.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/product")
    public Product createProduct(@RequestBody final Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody final Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") final Long id) {
        productService.deleteProduct(id);
    }

}
