package com.revature.project1.services;

import com.revature.project1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServices {
    public void register(User user);
    public Optional<User> login(User user);
    public List<User> getUsers();
}
