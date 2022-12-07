package waa.assignment.three.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.assignment.three.entity.Address;
import waa.assignment.three.entity.Category;
import waa.assignment.three.entity.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Iterable<Product> findAllByPriceGreaterThan(double price);

    Iterable<Product> findAllByCategoryIdAndPriceLessThan(long categoryId, double price);

    Iterable<Product> findAllByNameContainsIgnoreCase(String name);
}
