package com.example.service.user;

import com.example.entity.user.User;

import java.util.List;

/**
 * Created by zhl on 2020/11/12.
 */
public interface UserService {
    List<User> findByAll();

    User findUserById(Integer id);

    int saveUser(User user);

    int deleteUser(Integer id);

    int updateUser(User user);
}
