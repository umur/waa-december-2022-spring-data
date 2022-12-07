package waa.assignment.three.service;



import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import waa.assignment.three.dto.ReviewDto;

import java.util.List;


public interface ReviewService {


    void saveReview(ReviewDto review);

    List<ReviewDto> getReviews();

    ReviewDto getReview(long id);

    void deleteReview(long id);

    void updateReview(long id, ReviewDto review);

    List<ReviewDto> getReviewsByProductId(long productId);

}
