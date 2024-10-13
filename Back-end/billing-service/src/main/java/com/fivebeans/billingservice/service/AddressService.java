package com.fivebeans.billingservice.service;

import com.fivebeans.billingservice.dto.CreateAddressRequest;
import com.fivebeans.billingservice.dto.GetAddressResponse;
import com.fivebeans.billingservice.dto.UpdateAddressRequest;

import java.util.List;


public interface AddressService {

  void createAddress(CreateAddressRequest createAddressRequest);

  List<GetAddressResponse> getAddress();

  void updateAddress(UpdateAddressRequest updateAddressRequest);

  GetAddressResponse getAddressById(String addressId);

  void deleteAddressById(String addressId);
}
