package w1d3.app01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.app01.entity.User;
@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
}
