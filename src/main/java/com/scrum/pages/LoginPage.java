package com.scrum.pages;

import java.io.IOException;

import org.openqa.selenium.By;

/**
 * @author Andrii.Dzynia
 */
public class LoginPage extends BasePage {

  public static final By SIGN_IN = By.name("signIn");

  public void open() throws IOException {
       getDriver().get("http://cells.org.ua/scrum-selenium/index.php?signIn=1");
  }

  public void fillForm(String username, String password) throws IOException {
    getDriver().findElement(By.name("username")).sendKeys(username);
    getDriver().findElement(By.name("password")).sendKeys(password);
  }

  public void clickSignInButton() throws IOException {
    getDriver().findElement(SIGN_IN).click();
  }
}
