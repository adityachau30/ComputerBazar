package com.example.computer_estore.repo;

import com.example.computer_estore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    static List<Product> findAllByCategory_Id(int id) {
        return null;
    }
}
