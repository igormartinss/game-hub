package com.ms.gamehub.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String username;
    private LocalDate birthdate;
    private String password;
    private LocalDateTime createdAt;

    public User(String name, String email, String username, LocalDate birthdate, String password, LocalDateTime createdAt) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.birthdate = birthdate;
        this.password = password;
        this.createdAt = createdAt;
    }

    @Deprecated
    public User() { }
}
