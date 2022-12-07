package waa.assignment.three.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.assignment.three.entity.Address;
import waa.assignment.three.entity.Review;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    Iterable<Review> findAllByProductId(Long id);

}
