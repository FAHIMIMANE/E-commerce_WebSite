package com.fivebeans.accountservice.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInRequest {

  @NotBlank
  private String usernameOrEmail;

  @NotBlank
  private String password;
}

