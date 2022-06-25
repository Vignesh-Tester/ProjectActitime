package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
 public WebDriver driver;
 
 By userName = By.id("username");
 
 By passWord = By.name("pwd");
 
 By loginButton = By.id("loginButton");
 
 By keepMeLoggedIn = By.id("keepLoggedInLabel");
 
 By forgotPassword = By.id("toPasswordRecoveryPageLink");
 
 public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	 
	 this.driver = driver;
}
public WebElement getUserName() {
	return driver.findElement(userName);
 }
 public WebElement getpassword() {
	return driver.findElement(passWord);
 }
 public WebElement getLoginButton() {
	return driver.findElement(loginButton);
 }
 public WebElement getKeepMeLoggedIn() {
	return driver.findElement(keepMeLoggedIn);
 }
 public WebElement getForgotPassword() {
	return driver.findElement(forgotPassword);
 }
 
 

}
