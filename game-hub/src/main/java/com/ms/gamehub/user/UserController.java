package com.ms.gamehub.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

    @PersistenceContext
    private EntityManager entityManager;

    public UserController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    public void createUser(@Valid @RequestBody final UserRequest userRequest) {
        entityManager.persist(User.fromRequest(userRequest));
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> findUsers() {
        Query query = entityManager.createQuery("select u from User u");
        List<User> users = query.getResultList();

        List<UserResponse> usersResponse = new ArrayList<>();

        for (User user : users) {
            usersResponse.add(UserResponse.fromEntity(user));
        }

        return new ResponseEntity<>(usersResponse, HttpStatus.OK);


    }
}
