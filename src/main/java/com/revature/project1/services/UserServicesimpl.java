package com.revature.project1.services;

import com.revature.project1.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesimpl implements UserServices{


    @Override
    public void register(User user) {

    }

    @Override
    public Optional<User> login(User user) {
        return Optional.empty();
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
