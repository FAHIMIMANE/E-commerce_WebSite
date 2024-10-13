package com.fivebeans.billingservice.repository;

import com.fivebeans.billingservice.entity.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface AddressRepository extends CrudRepository<Address, String> {

    Optional<List<Address>> findByUserId(String userId);

    Optional<Address> findByAddressId(String addressId);

    Boolean existsByUserId(String userId);
    
}
