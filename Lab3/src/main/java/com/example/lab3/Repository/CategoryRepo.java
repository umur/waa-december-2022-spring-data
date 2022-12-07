package com.example.lab3.Repository;

import com.example.lab3.Entity.Category;
import com.example.lab3.Entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,String> {
}

