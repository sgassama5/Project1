package com.revature.project1.dao;
import java.util.Optional;

import com.revature.project1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDAO extends JpaRepository<User, Integer> {

    public Optional<User> findByUsernameAndPassword(String username, String password);
}
