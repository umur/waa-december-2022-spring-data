package edu.miu.springdatademo.service;

import edu.miu.springdatademo.Dto.ReviewDto;
import org.springframework.stereotype.Service;
import java.util.List;


public interface ReviewService {
//    List<ReviewDto> findAll();
    ReviewDto findById(int id);
    void save(ReviewDto reviewDto);
    void update(int id, ReviewDto reviewDto);
    void delete(int id);
}
