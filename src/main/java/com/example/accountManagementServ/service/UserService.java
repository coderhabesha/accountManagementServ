package com.example.accountManagementServ.service;

import com.example.accountManagementServ.model.UserModel;
import com.example.accountManagementServ.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createUser(UserModel userModel) {
        userRepository.save(userModel);
    }

    public UserModel getUserById(Long id) {
        Optional<UserModel> optionalUserModel = userRepository.findById(id);

        return optionalUserModel.orElseGet(UserModel::new);
    }

    public List<UserModel> getAllUsers() {
        return (List<UserModel>) userRepository.findAll();
    }
}
