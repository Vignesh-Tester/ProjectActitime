package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateTasksPage {

	public WebDriver driver;
	
	By searChtaskName = By.xpath("(//input[@placeholder='Start typing name ...'])[2]");
	
	By taskNameCheckbox = By.xpath("//label[@class='components_checkboxContainer checkboxContainer']//span[@class='checkmark ']");
	
	By countOfSelectedtasks = By.xpath("//div[@class='bulkOperationsPanel']//div[@class='title']");
	
	By deletetask = By.xpath("//div[@class='delete button']");
	
	By deletePermanently = By.xpath("//span[normalize-space()='Delete permanently']");
	
	By selectAll = By.xpath("//div[@class='selectAllButtonLabel']");
	
	By changeStatusButton = By.xpath("//div[@class='changeStatus button']");
	
	By statusdropdown = By.xpath("//div[@class='workflowStatus statusType_open statusColor_yellow statusTypeIcon_yellow withPrefix showArrow']");
	
	By completedStatus = By.xpath("(//div[contains(@class,'workflowStatusNode')])[19]");
	
	By applyButton = By.xpath("//div[contains(@class,'dialogWithPointerWrapper changeTasksStatusDialog tasksChangeDialog')]//div[contains(@class,'content')]//div//div[contains(@class,'buttonIcon')]");
	
	public CreateTasksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	
	public WebElement getApplybutton() {
		
		return driver.findElement(applyButton);
	}
	
	public WebElement getCompletedStatus() {
		
		return driver.findElement(completedStatus);
	}
	public WebElement clickChangeStatusDropdown() {
		
		return driver.findElement(statusdropdown);
		
	}
	public WebElement clickChangeStatus() {
		
		return driver.findElement(changeStatusButton);
	}
	
	
	public WebElement clickSelectAlltasks() {
		return driver.findElement(selectAll);
	}
	
	
	public WebElement clickDeletePermanently() {
		
		return driver.findElement(deletePermanently);
	}
	
	public WebElement getCountofSelectedtasks() {
		
		return driver.findElement(countOfSelectedtasks);
	}
	
	public WebElement clickDeleteTask() {
		return driver.findElement(deletetask);
	}

	public WebElement clicktaskNameCheckbox() {
		
		return driver.findElement(taskNameCheckbox);
	}
	
	public WebElement enterTaskName() {
		
		return driver.findElement(searChtaskName);
	}
	
	
	
	
	
}
