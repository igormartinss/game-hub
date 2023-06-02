package com.ms.gamehub.user;

import java.time.LocalDate;

public class UserRequest {
    private String name;
    private String email;
    private String username;
    private LocalDate birthdate;
    private String password;

    public UserRequest(String name, String email, String username, LocalDate birthdate, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.birthdate = birthdate;
        this.password = password;
    }
}
