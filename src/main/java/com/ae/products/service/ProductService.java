package com.ae.products.service;

import com.ae.products.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAllProducts();

    public Product findProductById(final Long id);

    public Product createProduct(final Product product);

    public Product updateProduct(final Product product);

    public void deleteProduct(final Long id);
}
