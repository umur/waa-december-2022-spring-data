package edu.miu.springdatalab.repository;

import edu.miu.springdatalab.entity.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
//    List<Category> findAllByNameContaining(String name); //query by naming convention

}
