package com.fivebeans.accountservice.service;

import com.fivebeans.accountservice.entity.Role;
import com.fivebeans.accountservice.dto.CreateRoleRequest;

import java.util.List;


public interface RoleService {

  String createRole(CreateRoleRequest createRoleRequest);

  List<Role> getAllRoles();
}
