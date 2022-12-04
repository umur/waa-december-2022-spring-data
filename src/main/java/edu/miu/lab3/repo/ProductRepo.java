package edu.miu.lab3.repo;

import edu.miu.lab3.model.Category;
import edu.miu.lab3.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    public List<Product> findAllByPriceGreaterThan(int minprice);

    public List<Product> findAllByCategoryEqualsAndPriceLessThan(Category cat, int maxprice);

    public List<Product> findAllByNameContaining(String name);


}
