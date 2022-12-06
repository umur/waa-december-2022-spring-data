package edu.miu.lab3.repository;

import edu.miu.lab3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
    List<Category> findAllByNameContaining(String name);
}
