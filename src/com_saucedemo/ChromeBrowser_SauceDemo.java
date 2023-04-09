package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser_SauceDemo {

    public static void main(String[] args) {

        //launch the Browser
        WebDriver driver = new ChromeDriver();

        //Open Url into the Browser
        driver.get("https://www.saucedemo.com/");

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the Title of the page
        System.out.println("Title of page :\t\t" + driver.getTitle());

        //Print the current URl
        System.out.println("Current URl : \t\t\t " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :\t\t\t " + driver.getPageSource());

        //Find the Username  and Type username into username field
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Enter password into password filed
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //close the Browser
        driver.close();
    }
}
