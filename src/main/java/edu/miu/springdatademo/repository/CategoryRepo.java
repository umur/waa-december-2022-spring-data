package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.entity.Category;
import edu.miu.springdatademo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {



}
