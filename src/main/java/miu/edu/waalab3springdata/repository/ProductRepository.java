package miu.edu.waalab3springdata.repository;

import miu.edu.waalab3springdata.entity.Category;
import miu.edu.waalab3springdata.entity.Product;
import miu.edu.waalab3springdata.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findByPriceGreaterThan(Double price);
    List<Product> findByCategoryAndPriceLessThan(Category category, Double price);
    List<Product> findByNameContains(String keyword);

}
