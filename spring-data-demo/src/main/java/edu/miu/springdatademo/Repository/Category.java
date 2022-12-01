package edu.miu.springdatademo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Category extends CrudRepository<Category,Integer> {
}
