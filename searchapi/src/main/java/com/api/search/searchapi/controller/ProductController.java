package com.api.search.searchapi.controller;

import com.api.search.searchapi.entity.Product;
import com.api.search.searchapi.service.ProdService;
import com.api.search.searchapi.service.ProdServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProdServiceImpl ps;

    public ProductController(ProdServiceImpl ps) {
        this.ps = ps;
    }

    public ProductController() {
    }

    @PostMapping
    public Product storeprod(@RequestBody Product p){
        return ps.createprod(p);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> getprod(@RequestParam("str") String str){
  return ResponseEntity.ok(ps.getAllProd(str));
    }


}
