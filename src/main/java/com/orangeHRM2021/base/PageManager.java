package com.orangeHRM2021.base;

import com.orangeHRM2021.pages.LoginPage;

public class PageManager {
    public static LoginPage loginPage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();

    }
}
