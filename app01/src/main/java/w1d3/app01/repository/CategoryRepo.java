package w1d3.app01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.app01.entity.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
    Category findByName(String name);
}
