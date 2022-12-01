package edu.miu.springdatademo.Repository;

import edu.miu.springdatademo.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
    List<Product> findAllByPriceGreaterThan(double price);
    List<Product> findAllByCategory_NameAndPriceLessThan(String cat, double price);

    List<Product> findAllByNameContainingIgnoreCase(String keyword);


}
