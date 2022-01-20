package com.morozov.spring.repositories;

import com.morozov.spring.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
