package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.entity.Review;
import edu.miu.springdatademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Integer> {



}
