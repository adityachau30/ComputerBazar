package com.example.computer_estore.repo;

import com.example.computer_estore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository <Category, Integer> {
}
