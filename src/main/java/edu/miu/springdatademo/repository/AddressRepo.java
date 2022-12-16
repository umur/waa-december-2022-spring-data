package edu.miu.springdatademo.repository;

import edu.miu.springdatademo.entity.Address;
import edu.miu.springdatademo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {



}
