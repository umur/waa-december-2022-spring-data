package waa.assignment.three.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.assignment.three.entity.Category;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {


}
