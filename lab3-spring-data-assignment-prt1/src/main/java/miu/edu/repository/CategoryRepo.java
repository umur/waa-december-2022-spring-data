package miu.edu.repository;

import miu.edu.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
