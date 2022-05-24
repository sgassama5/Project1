package com.revature.project1.dao;

import com.revature.project1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer> {
    public  User findByEmailAndPassword(String email, String password);
    public void insertToUsers(String email,String password);
    @Query("SELECT u FROM User u")
    public List<User> getAllUsers();
}
