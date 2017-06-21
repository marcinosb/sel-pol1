package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LitecartLogin {

  WebDriver chromeDriver;
  WebDriver edgeDriver;
  WebDriver firefoxDriver;
  private WebDriverWait waitChrome;
  private WebDriverWait waitEdge;
  private WebDriverWait waitFirefox;

  @Before
  public void start() {
  }

  @Test
  public void loginChrome()  {
    chromeDriver = new ChromeDriver();
    chromeDriver.get(" http://localhost:8081/litecart/admin/");
    chromeDriver.findElement(By.name("username")).sendKeys("admin");
    chromeDriver.findElement(By.name("password")).sendKeys("admin");
    chromeDriver.findElement(By.name("login")).click();
  }

  @Test
  public void loginFirefox()  {
    firefoxDriver = new FirefoxDriver();
    firefoxDriver.get(" http://localhost:8081/litecart/admin/");
    firefoxDriver.findElement(By.name("username")).sendKeys("admin");
    firefoxDriver.findElement(By.name("password")).sendKeys("admin");
    firefoxDriver.findElement(By.name("login")).click();
  }

  @Test
  public void loginEdge()  {
        edgeDriver = new EdgeDriver();
        edgeDriver.get(" http://localhost:8081/litecart/admin/");
        edgeDriver.findElement(By.name("username")).sendKeys("admin");
        edgeDriver.findElement(By.name("password")).sendKeys("admin");
        edgeDriver.findElement(By.name("login")).click();
        }

  @After
  public void stop() {
    if (chromeDriver != null) {
      chromeDriver.quit();
      chromeDriver = null;
    }
    if (edgeDriver != null) {
      edgeDriver.quit();
      edgeDriver = null;
    }
    if (firefoxDriver != null) {
      firefoxDriver.quit();
      firefoxDriver = null;
    }
  }
}