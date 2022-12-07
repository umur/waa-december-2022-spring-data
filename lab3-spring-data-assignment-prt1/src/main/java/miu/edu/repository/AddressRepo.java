package miu.edu.repository;

import miu.edu.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo  extends CrudRepository<Address, Integer> {
}
