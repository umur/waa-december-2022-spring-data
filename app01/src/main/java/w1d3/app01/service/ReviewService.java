package w1d3.app01.service;

import w1d3.app01.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    ReviewDto save(ReviewDto r);
    List<ReviewDto> getAllReview();
    ReviewDto getById(int id);
    void delete(int id);
    ReviewDto update(ReviewDto r);
    List<ReviewDto> getReviewByProduct(int prodId);

}
