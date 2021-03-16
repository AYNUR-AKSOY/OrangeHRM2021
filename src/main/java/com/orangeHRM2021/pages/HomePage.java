package com.orangeHRM2021.pages;

import com.orangeHRM2021.utils.ElementUtil;

public class HomePage {
    public static String verifyTitle(){
        return ElementUtil.doGetPageTitle();
    }
}
