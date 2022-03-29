package com.example.sellphone.Repository;

import com.example.sellphone.Model.Category;
import com.example.sellphone.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findById(int id);
    List<Product> findProductByNameLike(String name);
    List<Product> findProductByCategory_Id(int id);
}
