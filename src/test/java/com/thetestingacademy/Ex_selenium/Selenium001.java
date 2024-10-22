package com.thetestingacademy.Ex_selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium001 {
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.close();
    }
}
