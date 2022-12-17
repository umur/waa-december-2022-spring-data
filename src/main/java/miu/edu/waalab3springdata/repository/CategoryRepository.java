package miu.edu.waalab3springdata.repository;

import miu.edu.waalab3springdata.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
