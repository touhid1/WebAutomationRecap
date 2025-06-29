package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Locators extends DriverSetup{

    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.google.com");

        WebElement searchArea;
//        searchArea = driver.findElement(By.id("APjFqb"));
//        searchArea = driver.findElement(By.name("q"));
//        searchArea = driver.findElement(By.className("gLFyf"));
//        searchArea = driver.findElement(By.tagName("textarea"));

//        searchArea.sendKeys("Bangladesh");
//        Thread.sleep(3000);
//        searchArea.clear();
//        Thread.sleep(3000);
//        driver.manage().window().maximize();
//
//        driver.findElement(By.partialLinkText("কীভাবে কাজ করে")).click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        driver.findElement(By.linkText("Gmail")).click();
//        Thread.sleep(3000);
//        searchArea = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));


        searchArea = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);

//        List<WebElement> childes = driver.findElements(By.xpath("//div[@class=\"KxwPGc AghGtd\"]/a"));
        List<WebElement> childes = driver.findElements(By.cssSelector("div[class=\"KxwPGc AghGtd\"]>a"));

        for (WebElement child: childes){
            System.out.println(child.getText());
        }
    }
}