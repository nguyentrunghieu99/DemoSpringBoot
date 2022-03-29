package com.example.sellphone.Service.Impl;

import com.example.sellphone.Model.Category;
import com.example.sellphone.Model.Product;
import com.example.sellphone.Repository.ProductRepository;
import com.example.sellphone.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public boolean AddProduct(Product product) {
        productRepository.save(product);
        return true;
    }

    @Override
    public boolean UpdateProduct(Product product, int id) {
       Product p = productRepository.findById(id);
       p.setBattery(product.getBattery());
       p.setCpu(product.getCpu());
       p.setImage(product.getImage());
       p.setMemoryRam(product.getMemoryRam());
       p.setName(product.getName());
       p.setMemoryRoom(product.getMemoryRoom());
       p.setPrice(product.getPrice());
       p.setResolution(p.getResolution());
       p.setSpeedcpu(p.getSpeedcpu());
       p.setCategory(p.getCategory());
       productRepository.save(p);
        return true;
    }

    @Override
    public boolean DeleteProduct(int id) {
        Product p = productRepository.findById(id);
        productRepository.delete(p);
        return true;
    }

    @Override
    public List<Product> FindProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> FindProductsByName(String name) {
        return productRepository.findProductByNameLike("%"+name+"%");
    }

    @Override
    public List<Product> FindProductByCate(int idCate) {
        return productRepository.findProductByCategory_Id(idCate);
    }
}
