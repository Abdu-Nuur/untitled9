package com.company;

import com.company.dao.UserDao;
import com.company.gender.Gender;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        UserDao userDao = new UserDao();

        userService.addUser(new User(1, "Asan", 25, Gender.BALA));
        userService.addUser(new User(2, "Uson", 22, Gender.BALA));
        userService.addUser(new User(3, "Gula", 24, Gender.KYZ));

        try {
            System.out.println(userService.searchByIdUser(1));
            System.out.println();
            userService.getAllUsers();
            System.out.println();
            userService.deleteById(2);
            System.out.println();
            userService.getAllUsers();
        }catch (IndexOutOfBoundsException e){

        }
    }
}
