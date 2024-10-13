package com.fivebeans.accountservice.service;

import com.fivebeans.accountservice.dto.MapRoleToUsersRequest;
import com.fivebeans.accountservice.dto.MapUserToRolesRequest;


public interface UserRoleService {

  void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void removeRolesFromUser(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);
}
