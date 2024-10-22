package com.thetestingacademy.Ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Selenium005 {
    public static void main(String[] args) {
        ChromeOptions chromeoptions=new ChromeOptions();
        chromeoptions.addExtensions(new File("src/test/java/com/thetestingacademy/Ex_selenium/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_6_9_3_0.crx"));
        WebDriver driver=new ChromeDriver(chromeoptions);
        driver.manage().window().maximize();
        driver.get("https://google.com");


    }
}
