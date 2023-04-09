package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_SauceDemo {

    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();

        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser name");
        }
        //Maximise the browser
        driver.manage().window().maximize();

        //Open the URl into the Browser
        driver.get("https://www.saucedemo.com/");

        //Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println("Title of page :" + driver.getTitle());

        //Print the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source :" +driver.getPageSource());

        //Find Username filed and Type Username into username field
        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //Find Password field element and Type the password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //Close Browser
         driver.close();



    }
}
