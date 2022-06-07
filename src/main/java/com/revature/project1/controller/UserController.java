package com.revature.project1.controller;


import com.revature.project1.annotation.Authorized;
import com.revature.project1.model.Role;
import com.revature.project1.model.User;
import com.revature.project1.services.AuthorizationService;
import com.revature.project1.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private AuthorizationService authorizationService;

    @Authorized(allowedRoles = {Role.ADMIN})
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userServices.findAll());
    }

    @GetMapping("/{id}")
    @Authorized(allowedRoles = {Role.ADMIN})
    public ResponseEntity<User> findById(@PathVariable("id") int id) {
        authorizationService.guardByUserId(id);

        return ResponseEntity.ok(userServices.findById(id));
    }

    @PostMapping("/register")
    public ResponseEntity<User> insert(@RequestBody User user) {

        return ResponseEntity.accepted().body(userServices.insert(user));
    }


    @PutMapping
    @Authorized(allowedRoles = {Role.ADMIN, Role.CUSTOMER})
    public ResponseEntity<User> update(@RequestBody User user) {
        authorizationService.guardByUserId(user.getId());
        // We will also check if this resource belongs to the User, even if they pass the @Authorized annotation

        return ResponseEntity.accepted().body(userServices.update(user));
    }

    @Authorized(allowedRoles = {Role.ADMIN})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        if(userServices.delete(id)) {
            return ResponseEntity.accepted().build();
        }

        return ResponseEntity.noContent().build();
    }
}
