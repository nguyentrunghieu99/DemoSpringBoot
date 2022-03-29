package com.example.sellphone.Service;

import com.example.sellphone.Model.Category;
import com.example.sellphone.Model.Product;

import java.util.List;

public interface ProductService {
    boolean AddProduct(Product product);
    boolean UpdateProduct(Product product, int id);
    boolean DeleteProduct(int id);
    List<Product> FindProducts();
    List<Product> FindProductsByName(String name);
    List<Product> FindProductByCate(int idCate);
}
