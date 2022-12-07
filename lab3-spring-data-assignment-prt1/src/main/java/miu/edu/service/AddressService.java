package miu.edu.service;

import miu.edu.entity.Address;

import java.util.List;

public interface AddressService {
    Address getById (int id);
   List<Address> getAll();
   void save (Address address);
   void update(int id, Address address);
   void delete(int id);

}
