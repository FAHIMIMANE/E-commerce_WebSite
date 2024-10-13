package com.fivebeans.accountservice.service;

import com.fivebeans.accountservice.dto.CreateOAuthClientRequest;
import com.fivebeans.accountservice.dto.CreateOAuthClientResponse;
import com.fivebeans.accountservice.dto.CreateUserResponse;
import com.fivebeans.accountservice.dto.SignUpRequest;


public interface AuthService {

  CreateOAuthClientResponse createOAuthClient(CreateOAuthClientRequest createOAuthClientRequest);

  CreateUserResponse registerUser(SignUpRequest signUpRequest);
}
