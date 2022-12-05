package edu.miu.springdatalab.repository;

import edu.miu.springdatalab.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ankhbayar Azzaya
 */
public interface UserRepo extends CrudRepository<User, Integer> {

}
