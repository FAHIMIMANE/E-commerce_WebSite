package com.fivebeans.billingservice.service.impl;

import com.fivebeans.billingservice.repository.AddressRepository;
import com.fivebeans.billingservice.entity.Address;
import com.fivebeans.billingservice.service.AddressService;
import com.fivebeans.billingservice.dto.CreateAddressRequest;
import com.fivebeans.billingservice.dto.GetAddressResponse;
import com.fivebeans.billingservice.dto.UpdateAddressRequest;
import com.fivebeans.commons.util.CommonUtilityMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void createAddress(CreateAddressRequest createAddressRequest) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userIdFromToken = CommonUtilityMethods.getUserIdFromToken(authentication);

        Address address = Address.builder()
                .addressLine1(createAddressRequest.getAddressLine1())
                .addressLine2(createAddressRequest.getAddressLine2())
                .city(createAddressRequest.getCity())
                .country(createAddressRequest.getCountry())
                .phone(createAddressRequest.getPhone())
                .postalCode(createAddressRequest.getPostalCode())
                .state(createAddressRequest.getState())
                .userId(userIdFromToken)
                .build();

        addressRepository.save(address);

    }


    @Override
    public List<GetAddressResponse> getAddress() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userIdFromToken = CommonUtilityMethods.getUserIdFromToken(authentication);

        Optional<List<Address>> addresses = addressRepository
                .findByUserId(userIdFromToken);

        List<GetAddressResponse> responseList = new ArrayList<>();

        if (addresses.isPresent()) {
            addresses.get().forEach(address -> {
                responseList.add(GetAddressResponse.builder()
                        .addressId(address.getAddressId())
                        .addressLine1(address.getAddressLine1())
                        .addressLine2(address.getAddressLine2())
                        .city(address.getCity())
                        .country(address.getCountry())
                        .phone(address.getPhone())
                        .postalCode(address.getPostalCode())
                        .state(address.getState())
                        .userId(address.getUserId())
                        .build());
            });

            return responseList;
        }

        return new ArrayList<>();
    }

    @Override
    public void updateAddress(UpdateAddressRequest updateAddressRequest) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userIdFromToken = CommonUtilityMethods.getUserIdFromToken(authentication);

        Optional<Address> addressFromDb = addressRepository.findByAddressId(updateAddressRequest.getAddressId());

        if (addressFromDb.isPresent()) {
            if (!userIdFromToken.equals(addressFromDb.get().getUserId())) {
                throw new RuntimeException("UnAuthorized!");
            }
        } else {
            throw new RuntimeException("Address doesn't exist!");
        }

        Address address = Address.builder()
                .addressId(updateAddressRequest.getAddressId())
                .addressLine1(updateAddressRequest.getAddressLine1())
                .addressLine2(updateAddressRequest.getAddressLine2())
                .city(updateAddressRequest.getCity())
                .country(updateAddressRequest.getCountry())
                .phone(updateAddressRequest.getPhone())
                .postalCode(updateAddressRequest.getPostalCode())
                .state(updateAddressRequest.getState())
                .userId(userIdFromToken)
                .build();

        addressRepository.save(address);
    }

    @Override
    public GetAddressResponse getAddressById(String addressId) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userIdFromToken = CommonUtilityMethods.getUserIdFromToken(authentication);

        Optional<Address> addressOptional = addressRepository.findByAddressId(addressId);

        if (addressOptional.isPresent()) {
            Address address = addressOptional.get();

            if (!address.getUserId().equals(userIdFromToken)) {
                throw new RuntimeException("UnAuthorized");
            }

            return GetAddressResponse.builder()
                    .addressId(address.getAddressId())
                    .addressLine1(address.getAddressLine1())
                    .addressLine2(address.getAddressLine2())
                    .city(address.getCity())
                    .country(address.getCountry())
                    .phone(address.getPhone())
                    .postalCode(address.getPostalCode())
                    .state(address.getState())
                    .userId(address.getUserId())
                    .build();
        }

        throw new RuntimeException("Address doesn't exist");
    }

    @Override
    public void deleteAddressById(String addressId) {
        getAddressById(addressId);
        addressRepository.deleteById(addressId);
    }
}

