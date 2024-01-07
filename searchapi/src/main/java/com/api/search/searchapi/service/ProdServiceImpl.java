package com.api.search.searchapi.service;

import com.api.search.searchapi.entity.Product;
import com.api.search.searchapi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdServiceImpl implements ProdService{

   // @Autowired
    private ProductRepo pr;

    public ProdServiceImpl() {

    }

    @Override
    public List<Product> getAllProd(String str) {
       return pr.searchProd(str);
    }

    public ProdServiceImpl(ProductRepo pr) {
        this.pr = pr;
    }

    @Override
    public Product createprod(Product p) {
        return pr.save(p);
    }
}
