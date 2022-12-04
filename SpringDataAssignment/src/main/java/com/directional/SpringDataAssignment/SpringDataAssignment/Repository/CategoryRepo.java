package com.directional.SpringDataAssignment.SpringDataAssignment.Repository;

import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Category;
import com.directional.SpringDataAssignment.SpringDataAssignment.Entity.UniDirectional.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Long> {

}
