package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private List<User> users = new ArrayList<>();

    public User setUsers(User user) {
        users.add(user);
        return user;
    }

    public List<User> getUsers() {
        return users;
    }
}
