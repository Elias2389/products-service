package com.ae.products.service;

import com.ae.products.model.Product;

import java.util.List;

public interface ProductService {

    /**
     * Method to get all products with out filters
     * @return List of products
     */
    public List<Product> findAllProducts();

    /**
     * Method to find any product by id
     * @param id of product to find
     * @return product
     */
    public Product findProductById(final Long id);

    /**
     * Method to save product in data base
     * @param product to save in data base
     * @return product created
     */
    public Product createProduct(final Product product);

    /**
     * Method to update product in data
     * @param product to update
     * @return product updated
     */
    public Product updateProduct(final Product product);

    /**
     * Method to delete any product by id
     * @param id of product to delete
     */
    public void deleteProduct(final Long id);
}
