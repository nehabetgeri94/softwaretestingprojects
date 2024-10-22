package com.thetestingacademy.Ex_selenium.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium007 {

    @Test
    public void TestVWOTitle(){
        //open the app VWO.com
        //we want to verify the Title by using testng assertion.
        EdgeOptions edgeoptions=new EdgeOptions();
        edgeoptions.addArguments("Start-Maximized");
        //driver.manage().window().Maximize();
        WebDriver driver=new EdgeDriver(edgeoptions);
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        driver.quit();

    }
}
