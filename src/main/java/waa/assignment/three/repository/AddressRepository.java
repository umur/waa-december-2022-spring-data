package waa.assignment.three.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.assignment.three.entity.Address;
import waa.assignment.three.entity.MainUser;

import java.util.List;


@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {




}
