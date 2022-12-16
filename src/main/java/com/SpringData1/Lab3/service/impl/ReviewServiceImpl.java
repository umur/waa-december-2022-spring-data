package com.SpringData1.Lab3.service.impl;

import com.SpringData1.Lab3.Repo.ReviewRepo;
import com.SpringData1.Lab3.entity.UniDirectional.Review;
import com.SpringData1.Lab3.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;

    public void save (Review review){
        reviewRepo.save(review);
    }

    @Override
    public Review get(Long id) {
        return null;
    }

    @Override
    public List<Review> getAll() {
        return null;
    }

    @Override
    public void saveorUpdate(Review review) {

    }

    @Override
    public void delete(Long id) {

    }
}
