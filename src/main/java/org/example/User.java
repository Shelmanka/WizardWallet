package org.example;

public class User {
    private Long userId;
    private String email;
    private String password;
    private String name;

    public User(Long userId, String email, String password, String name) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public boolean verifyLogin(String enteredEmail, String enteredPassword) {
        return email.equals(enteredEmail) && password.equals(enteredPassword);
    }
}
