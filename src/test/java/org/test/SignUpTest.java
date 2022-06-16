package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpTest {
    //first test

    @Test
    public void zipCodeTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[value='Register']")).isDisplayed());

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        driver.findElement(By.name("zip_code")).sendKeys("1234567891011112");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".error_message")).isDisplayed());
    }

    @Test
    public void zipCodeTest2() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        driver.findElement(By.name("zip_code")).sendKeys("");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".error_message")).isDisplayed());
    }

    @Test
    public void zipCodeTest3() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        driver.findElement(By.name("zip_code")).sendKeys("dfgfdg1231dfg");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".error_message")).isDisplayed());
    }

    @Test
    public void zipCodeTest4() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Kubarev");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Dmitry");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Kuabrev@gmai.com");
        driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("qwerty123");
        driver.findElement(By.xpath("//input[@name='password2']")).sendKeys("qwerty123");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='confirmation_message']")).isDisplayed());

    }


}