package edu.miu.springdatalab.service;


import edu.miu.springdatalab.dto.ReviewDto;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
public interface ReviewService {

    void save(ReviewDto reviewDto);
    ReviewDto findById(int id);
    List<ReviewDto> findAll();
    void delete(int id);
    void update(int id, ReviewDto reviewDto);

    List<ReviewDto> findReviewsByProductId(int productId);
}
