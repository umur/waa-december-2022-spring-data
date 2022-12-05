package w1d3.app01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.app01.entity.Product;

import java.util.EventListenerProxy;
import java.util.List;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    List<Product> findAllByPriceGreaterThan(double price);
    List<Product> findAllByCategory_IdAndPriceLessThan(int categoryId, double price);
    List<Product> findAllByCategory_Id(int categoryId);
    List<Product> findAllByNameContaining(String keyword);

}
