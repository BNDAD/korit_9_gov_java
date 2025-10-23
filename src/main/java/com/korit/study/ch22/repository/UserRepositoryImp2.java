package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UserRepositoryImp2 implements UserRepository{
    private static UserRepositoryImp2 instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepositoryImp2() {
        users = new ArrayList<>();
        autoIncrementId = 1;
    }

    public static UserRepositoryImp2 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepositoryImp2();
        }
        return instance;
    }

    public void insert(User user) {
        user.setId(autoIncrementId++);
        users.add(user);
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

//    private int generateId() {
//        return users[users.length].getId() + 1;
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 배열: [ ");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(users.get(i));
            if (i != users.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}











