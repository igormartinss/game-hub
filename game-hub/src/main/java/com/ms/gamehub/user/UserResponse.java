package com.ms.gamehub.user;

public class UserResponse {

    private final Long id;
    private final String name;
    private final String username;
    private final String email;

    public UserResponse(Long id, String name, String username, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
    }

    public static UserResponse fromEntity(User user) {
        return  new UserResponse(user.getId(), user.getName(), user.getUsername(), user.getEmail());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
