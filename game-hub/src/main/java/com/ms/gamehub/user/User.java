package com.ms.gamehub.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = {"username", "email"} )})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "username")
    private String username;

    @NotNull
    private LocalDate birthdate;

    @NotBlank
    private String password;

    @NotNull
    private LocalDateTime createdAt;

    public User(String name, String email, String username, LocalDate birthdate, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.birthdate = birthdate;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }

    @Deprecated
    public User() { }

    public static User fromRequest(UserRequest userRequest) {
        return new User(
            userRequest.getName(),
            userRequest.getEmail(),
            userRequest.getUsername(),
            userRequest.getBirthdate(),
            userRequest.getPassword()
        );
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
