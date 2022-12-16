package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query("SELECT p from Product p ")
    public List<Product> findProductByPriceGreaterThan();

    @Override
    List<Product>findAll();

    List<Product> findAllByPriceLessThan(int price);

    @Query("SELECT p from Product p where p.category.name = ?1 and p.price< ?2")
    List<Product> findAllByCategoryNameAndPriceLess(String catName, int price);

    List<Product> findAllByNameContaining(String subname);





}
