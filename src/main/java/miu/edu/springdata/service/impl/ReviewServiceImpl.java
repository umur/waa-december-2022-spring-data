package miu.edu.springdata.service.impl;

import lombok.RequiredArgsConstructor;
import miu.edu.springdata.entity.Review;
import miu.edu.springdata.repository.ReviewRepo;
import miu.edu.springdata.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;

    public void save(Review address){
        reviewRepo.save(address);
    }

    @Override
    public List<Review> findAll() {
        return (List<Review>) reviewRepo.findAll();
    }

    @Override
    public Review findById(int id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        reviewRepo.deleteById(id);
    }
}
