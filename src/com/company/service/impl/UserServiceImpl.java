package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    @Override
    public User addUser(User user) {
        userDao.getUsers().add(user);
        return user;
    }

    @Override
    public User searchByIdUser(int id) {
        id--;
        return userDao.getUsers().get(id);
    }

    @Override
    public void deleteById(int id) {
        id--;
        userDao.getUsers().remove(id);
    }

    @Override
    public List<User> getAllUsers() {
        System.out.println(searchByIdUser(1));
        System.out.println(searchByIdUser(2));
        System.out.println(searchByIdUser(3));
        return userDao.getUsers();
    }
}
