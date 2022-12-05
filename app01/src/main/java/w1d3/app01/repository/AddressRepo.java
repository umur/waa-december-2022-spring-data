package w1d3.app01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import w1d3.app01.entity.Address;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {
}
