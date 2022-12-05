package edu.miu.springdatalab.repository;

import edu.miu.springdatalab.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Ankhbayar Azzaya
 */
@Service
public interface AddressRepo extends CrudRepository<Address, Integer> {

}
