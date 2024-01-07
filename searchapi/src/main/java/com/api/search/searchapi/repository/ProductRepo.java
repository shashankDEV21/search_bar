package com.api.search.searchapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.search.searchapi.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
//    @Query("select p from product p where p.name like concat('%', :str, '%')"+
//            " or p.description like concat('%', :str, '%') " )
    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProd(String query);
}
