package com.designpattern.architecture.mvvm;

import java.util.Scanner;

public class LoginView {
    private LoginViewModel viewModel;

    public LoginView(LoginViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        viewModel.setUser(username, password);
        String result = viewModel.validateUser();
        System.out.println(result);

        scanner.close();
    }
}