package com.SpringData1.Lab3.Repo;

import com.SpringData1.Lab3.entity.UniDirectional.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
}
