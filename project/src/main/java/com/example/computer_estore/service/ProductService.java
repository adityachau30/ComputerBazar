package com.example.computer_estore.service;

import com.example.computer_estore.entity.Product;
import com.example.computer_estore.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }
    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void removeProductById(Long id){
        productRepo.deleteById(id);
    }
    public Optional<Product> getProductById(Long id){
        return productRepo.findById(id);

    }

    public List<Product> getAllProductsByCategoryId(int id){
        return ProductRepo.findAllByCategory_Id(id);
    }


}
