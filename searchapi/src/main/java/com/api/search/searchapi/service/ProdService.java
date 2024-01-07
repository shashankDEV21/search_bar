package com.api.search.searchapi.service;

import com.api.search.searchapi.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProdService {
    List<Product> getAllProd(String str);

    Product createprod(Product p);
}
