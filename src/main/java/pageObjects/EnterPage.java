package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterPage {

	public WebDriver driver;

	By findTasks = By.xpath("//a[@class='content tasks']");

	By findUsers = By.xpath("//a[@class='content users']");

	By findReports = By.xpath("//a[@class='content reports']");

	By logoutLink = By.id("logoutLink");

	public EnterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getTasks() {

		return driver.findElement(findTasks);
	}

	public WebElement getUsers() {

		return driver.findElement(findUsers);
	}

	public WebElement getReports() {

		return driver.findElement(findReports);
	}

	public WebElement getLogoutLink() {

		return driver.findElement(logoutLink);
	}

}
