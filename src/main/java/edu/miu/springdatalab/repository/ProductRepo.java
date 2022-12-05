package edu.miu.springdatalab.repository;

import edu.miu.springdatalab.entity.Category;
import edu.miu.springdatalab.entity.Product;
import edu.miu.springdatalab.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(int price);
    List<Product> findAllByCategory_IdAndPriceIsLessThan(int categoryId, int price);
    List<Product> findAllByNameContaining(String keyword);
}
