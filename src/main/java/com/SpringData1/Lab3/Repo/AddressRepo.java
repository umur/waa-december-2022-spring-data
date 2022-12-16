package com.SpringData1.Lab3.Repo;


import com.SpringData1.Lab3.entity.BiDirectional.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address,Integer> {
    
}