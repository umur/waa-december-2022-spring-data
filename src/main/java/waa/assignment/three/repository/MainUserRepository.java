package waa.assignment.three.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.assignment.three.entity.MainUser;


@Repository
public interface MainUserRepository extends CrudRepository<MainUser, Long> {

}
