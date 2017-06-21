package ru.stqa.training.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTests extends TestBase{

  @Test
  public void myFirstTest(){
    driver.navigate().to("http://www.google.pl");
    driver.findElement(By.name("q")).sendKeys("webdriver");
    driver.findElement(By.name("btnG")).click();
    wait.until(titleIs("webdriver - Szukaj w Google"));
  }

  @Test
  public void myFirstTest3(){
    driver.navigate().to("http://www.google.pl");
    driver.findElement(By.name("q")).sendKeys("webdriver");
    driver.findElement(By.name("btnG")).click();
    wait.until(titleIs("webdriver - Szukaj w Google"));
  }

}
