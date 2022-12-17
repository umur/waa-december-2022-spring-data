package com.example.demo.repository;
import com.example.demo.Entity.Address;
import org.springframework.data.repository.CrudRepository;
public interface AddressRepo extends CrudRepository<Address,Long> {

}
