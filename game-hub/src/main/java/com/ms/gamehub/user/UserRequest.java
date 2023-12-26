package com.ms.gamehub.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class UserRequest {
    @NotBlank
    private final String name;
    @NotBlank
    private final String email;
    @NotBlank
    private final String username;
    @NotNull
    private final LocalDate birthdate;
    @NotBlank
    private final String password;

    public UserRequest(String name, String email, String username, LocalDate birthdate, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.birthdate = birthdate;
        this.password = password;
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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getPassword() {
        return password;
    }
}
