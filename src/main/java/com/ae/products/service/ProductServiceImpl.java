package com.ae.products.service;

import com.ae.products.model.Product;
import com.ae.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findProductById(final Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Product createProduct(final Product product) {
        Product productSaved = findProductById(product.getId());
        if (productSaved != null) {
            return productSaved;
        }
        ;
        return productRepository.save(product);
    }

    @Override
    @Transactional
    public Product updateProduct(final Product product) {
        Product productSaved = findProductById(product.getId());
        if (productSaved != null) {
            productRepository.save(product);
            return findProductById(product.getId());
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteProduct(final Long id) {
        productRepository.deleteById(id);
    }
}
