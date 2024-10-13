package com.fivebeans.accountservice.repository;

import com.fivebeans.accountservice.entity.OAuthClient;
import org.springframework.data.repository.CrudRepository;


public interface OAuthClientRepository extends CrudRepository<OAuthClient, Long> {

}
