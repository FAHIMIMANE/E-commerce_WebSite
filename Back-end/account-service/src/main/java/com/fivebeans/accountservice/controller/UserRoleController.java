package com.fivebeans.accountservice.controller;

import com.fivebeans.accountservice.service.UserRoleService;
import com.fivebeans.accountservice.dto.MapRoleToUsersRequest;
import com.fivebeans.accountservice.dto.MapUserToRolesRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRoleController {

  @Autowired
  UserRoleService userRoleService;

  @PostMapping("/user/{userNameOrEmail}/roles")
  public void mapUserToRoles(@PathVariable("userNameOrEmail") String userNameOrEmail,
      @RequestBody @Valid MapUserToRolesRequest mapUserToRolesRequest) {

    userRoleService.mapUserToRoles(userNameOrEmail, mapUserToRolesRequest);

  }

  @PostMapping("/role/{roleName}/users")
  public void mapRoleToUsers(@PathVariable("roleName") String roleName,
      @RequestBody @Valid MapRoleToUsersRequest mapRoleToUsersRequest) {

    userRoleService.mapRoleToUsers(roleName, mapRoleToUsersRequest);

  }
}
