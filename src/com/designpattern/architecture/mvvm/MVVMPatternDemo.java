package com.designpattern.architecture.mvvm;

public class MVVMPatternDemo {
    public static void run() {
        LoginViewModel viewModel = new LoginViewModel();
        LoginView view = new LoginView(viewModel);

        view.display();
    }
}