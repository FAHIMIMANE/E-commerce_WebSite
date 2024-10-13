package com.fivebeans.accountservice.service;

import com.fivebeans.accountservice.dto.CreateUserRequest;
import com.fivebeans.accountservice.dto.GetUserInfoResponse;
import com.fivebeans.accountservice.dto.GetUserResponse;
import com.fivebeans.accountservice.dto.UpdateUserRequest;
import com.fivebeans.accountservice.dto.UpdateUserRequestFromAdmin;

import java.util.List;


public interface UserService {

  String createUser(CreateUserRequest createUserRequest);

  GetUserResponse getUserByUserName(String userName);

  GetUserResponse getUserByUserId(String userId);

  GetUserInfoResponse getUserInfo();

  void updateUserInfo(UpdateUserRequest updateUserRequest);

  void deleteUserById(String userId);

  List<GetUserResponse> getAllUsers();

  void updateUser(String userId, UpdateUserRequestFromAdmin updateUserRequestFromAdmin);
}
