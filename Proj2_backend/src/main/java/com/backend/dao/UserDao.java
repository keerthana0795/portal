package com.backend.dao;

import com.backend.model.User;

public interface UserDao {
User registerUser(User user);
User login(User user);
void updateUser(User user);
User getUser(int id);
}
