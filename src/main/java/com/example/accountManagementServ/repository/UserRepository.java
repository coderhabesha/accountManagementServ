package com.example.accountManagementServ.repository;

import com.example.accountManagementServ.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
}
