package com.thetestingacademy.Ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium003 {
    @Test
    public void Test1()

    {
        EdgeOptions edgeoptions=new EdgeOptions();
       // edgeoptions.addArguments("--start-maximized");
       //edgeoptions.addArguments("--incognito");

        edgeoptions.addArguments("window-size=500,500");
        EdgeDriver driver =new EdgeDriver(edgeoptions);
        driver.get("https://google.com");
        driver.quit();
    }

    @Test
    public void Test2()

    {
       ChromeOptions chromeoptions=new ChromeOptions();
        chromeoptions.addArguments("----start-maximized");
        chromeoptions.addArguments("--incognito");
        ChromeDriver driver =new ChromeDriver(chromeoptions);
        driver.get("https://google.com");
        driver.quit();
    }

    @Test
    public void Test3()
    {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://google.com");
    }

}
