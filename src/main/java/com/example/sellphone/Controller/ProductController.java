package com.example.sellphone.Controller;

import com.example.sellphone.Model.Product;
import com.example.sellphone.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productService.FindProducts(),HttpStatus.OK);
    }

    @GetMapping("/products-cate")
    public List<Product> getProductsByCate(@RequestParam(value = "cate") int id){
        return productService.FindProductByCate(id);
    }

    @GetMapping("/products-name")
    public List<Product> getProductsByName(@RequestParam(value = "name") String name){
        return productService.FindProductsByName(name);
    }

    @PostMapping("/product")
    public void AddProduct(@RequestBody Product product){
        productService.AddProduct(product);
    }

    @PutMapping("/product")
    public void UpdateProduct(@RequestBody Product product, @RequestParam(value = "id") int id){
        productService.UpdateProduct(product,id);
    }

    @DeleteMapping("/product")
    public void DeleteProduct(@RequestParam(value = "id") int id){
        productService.DeleteProduct(id);
    }
}
