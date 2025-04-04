package com.designpattern.architecture.mvvm;

public class LoginViewModel {
    private UserModel userModel;

    public void setUser(String username, String password) {
        this.userModel = new UserModel(username, password);
    }

    public String validateUser() {
        if (userModel == null) {
            return "User data is missing.";
        }
        if (userModel.isValid()) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";
        }
    }
}