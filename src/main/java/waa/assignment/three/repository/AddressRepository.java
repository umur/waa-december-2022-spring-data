package waa.assignment.three.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import waa.assignment.three.entity.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
