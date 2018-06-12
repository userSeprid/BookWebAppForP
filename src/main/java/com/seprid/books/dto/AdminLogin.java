package com.seprid.books.dto;

public class AdminLogin {

    private String login;
    private String password;

    public AdminLogin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public AdminLogin() {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
