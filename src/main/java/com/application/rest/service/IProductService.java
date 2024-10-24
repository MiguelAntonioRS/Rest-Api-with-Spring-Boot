package com.application.rest.service;

import com.application.rest.entities.Product;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public interface IProductService {

    List<Product> findAll();
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    Optional<Product> findById(Long id);
    void save(Product product);
    void deleteById(Long id);
}
