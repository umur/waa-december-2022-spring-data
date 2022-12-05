package edu.miu.springdatalab.service;


import edu.miu.springdatalab.dto.AddressDto;

import java.util.List;

/**
 * @author Ankhbayar Azzaya
 */
public interface AddressService {
    void save(AddressDto addressDto);

    AddressDto findById(int id);

    List<AddressDto> findAll();

    void delete(int id);

    void update(int id, AddressDto addressDto);
}
