package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User searchByIdUser(int id);
    void deleteById(int id);
    List<User> getAllUsers();
}
