package edu.miu.waa.repository;

import edu.miu.waa.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {

    @Query(value = "SELECT r FROM Review r")
    List<Review> getReviews();

    @Query(value = "SELECT r FROM Review r WHERE r.product.id= ?1")
    List<Review> findReviewsByProductId(int id);
}
