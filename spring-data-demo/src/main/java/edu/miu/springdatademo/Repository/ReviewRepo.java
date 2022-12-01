package edu.miu.springdatademo.Repository;

import edu.miu.springdatademo.entity.Product;
import edu.miu.springdatademo.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer>  {

    List<Review> findAllByProduct_Id(int id);
}
