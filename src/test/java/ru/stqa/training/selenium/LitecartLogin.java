package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LitecartLogin {

  private WebDriver wd;
  private WebDriverWait wait;

  @Before
  public void start() {
    wd = new ChromeDriver();
    wait = new WebDriverWait(wd, 10);
  }

  @Test
  public void login()  {
    WebDriver wd = new ChromeDriver();
    wd.get(" http://localhost:8081/litecart/admin/");
    wd.findElement(By.name("username")).sendKeys("admin");
    wd.findElement(By.name("password")).sendKeys("admin");
    wd.findElement(By.name("login")).click();
  }

  @After
  public void stop(){
    wd.quit();
    wd = null;
  }
}