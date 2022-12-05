package w1d3.app01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.app01.entity.Review;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
    List<Review> findReviewsByProductId(int productId);
}
