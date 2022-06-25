package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskListPage {
	
	public WebDriver driver;
	
	By AddNew = By.xpath("//div[@class='title ellipsis']");
	
	By newCustomer = By.xpath("//div[@class='item createNewCustomer']");
	
	By newTasks = By.xpath("//div[@class='item createNewTasks']");
	
	By newProject = By.xpath("//div[@class='item createNewProject']");
	
	By customerName = By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']");
	
	By customerDescription = By.xpath("//textarea[@placeholder='Enter Customer Description']");
	
	By selectCustomerDropdown = By.xpath("//div[@class='emptySelection']");
	
	By selectcustomervalue = By.xpath("//div[@class='itemRow cpItemRow ']");
	
	By createCustomer = By.xpath("//div[@class='components_button withPlusIcon']");
	
	By enterCustomerName = By.xpath("//input[@placeholder='Start typing name ...']");
	
	By specificCustomer =By.xpath("//span[@class='highlightToken']");
	
	By editCustomer = By.xpath("//div[@class='titleEditButtonContainer']//div[@class='editButton']");
	
	By actionDropDowns = By.xpath("//div[@class='editCustomerPanelHeader']//div[@class='action'][normalize-space()='ACTIONS']");
	
	By removeHints = By.xpath("(//div[@class='popup_menu_icon'])[5]");
	
	By deleteButton = By.xpath("//div[@class='taskManagement_customerPanel']//div[@class='title'][normalize-space()='Delete']");
	
	By deletePermanentlyButton = By.xpath("//div[@class='content_customerPanel']//div[@class='buttonIcon']");
	
	By SuccessAlert = By.xpath("//span[@class='innerHtml']");
	
	By cerateProjectCustomerDropdown = By.xpath("//div[@class='itemRow ']");
	
	By createProject = By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']");
	
	By projectDescription = By.xpath("//textarea[@placeholder='Add Project Description']");
	
	By enterTaskName = By.xpath("(//input[@placeholder='Enter task name'])[1]");
	
	By newCustomerName = By.xpath("//input[@class='newCustomerNameField newCustomer']");
	
	By openProjectcollapse = By.xpath("//div[@class='node customerNode editable selected collapsed']//div[@class='collapseButton']");
	
	By clickProject = By.xpath("//div[@class='node projectNode editable notSelected']//div[@class='title']");
	
	By addNewTask = By.xpath("//div[@class='components_button addNewTaskButton withPlusIcon']");
	
	By taskName = By.xpath("//div[@class='nameInfo editable invalid']//input[@placeholder='Enter Task Name']");
	
	By calendarDd = By.cssSelector("div[class='classicBridge-taskPanel-DeadlineSelector-date--2CIg3dTt classicBridge-taskPanel-DeadlineSelector-withoutDate--2JJzt8f4']");
	
	By datevalue = By.cssSelector("td[class='rc-calendar-cell']");
	
	By viewCustomerProjects = By.xpath("//div[contains(text(),'view customer projects')]");
	
	
	//x-Path based on visible text and it might be changed based on project Name 
	By createdProjectbyuser = By.xpath("//div[@class='itemRow cpItemRow '][normalize-space()='E-commerce']");
	
	By existingtasks = By.xpath("//div[@class='importTasksSelectorButton']");
	
	By exitingTaskDropdown = By.xpath("//td[@class='dropdownButton']");
	
	By listedTasks = By.xpath("//td[@class='name']");
	
	By listedtasksDropdown = By.xpath("//button[@class='expandCollapse']");
	
	By selectAllTasks = By.xpath("//span[@class='selectAllLabel']");
	
	By copyTaskDescriptions = By.xpath("//div[@class='bottomPanel']//label");
	
	By copyProperties = By.xpath("//div[@class='greyButton withIcon importSelectedButton']");
	
	By createTasks = By.xpath("//div[contains(text(),'Create Tasks')]");
	
	public WebElement clickCreatetasks() {
		
		return driver.findElement(createTasks);
	}
	
	
	public WebElement clickCopyProperties() {
		return driver.findElement(copyProperties);
	}
	
	public WebElement clickCopytaskdescCheckBox() {
		
		return driver.findElement(copyTaskDescriptions);
	}
	
	public WebElement clickSelectalltasksCheckbox() {
		
		return driver.findElement(selectAllTasks);
	}
	
	public WebElement getlistedTasksDd() {
		return driver.findElement(listedtasksDropdown);
	}
	
	public List<WebElement> getlistedtasks() {
		return driver.findElements(listedTasks);
	}
	public WebElement clickExistingTaskDropdown() {
		
		return driver.findElement(exitingTaskDropdown);
	}
	
	public WebElement clickExistingTaskslink() {
		
		return driver.findElement(existingtasks);
	}
	
	public WebElement clickCreatedProject() {
		
		return driver.findElement(createdProjectbyuser);
	}
	
	public WebElement clickViewCustomerProjects() {
		return driver.findElement(viewCustomerProjects);
	}
	public WebElement getcollapseIcon() {
		
		return driver.findElement(openProjectcollapse);
	}
	
	public WebElement getProjectClick() {
		
		return driver.findElement(clickProject);
	}
	
	public WebElement clickAddNewtask() {
		return driver.findElement(addNewTask);
	}
	
	public List<WebElement> getDate(){
		return driver.findElements(datevalue);
	}
	
	public WebElement setTaskName() {
		
		return driver.findElement(taskName);
	}
	
	public WebElement OpenCalendarDropdown() {
		
		return driver.findElement(calendarDd);
	}
	
	
	
	public TaskListPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getAddNew() {
		
		return driver.findElement(AddNew);
	}
	
	public WebElement getNewCustomer() {
		return driver.findElement(newCustomer);
	}
	
	public WebElement getNewProject() {
		return driver.findElement(newProject);
	}
	
	public WebElement getNewTasks() {
		return driver.findElement(newTasks);
	}

	public WebElement getCustomerName() {
		return driver.findElement(customerName);
	}
	
	public WebElement getCustomerDescription() {
		return driver.findElement(customerDescription);
	}
	
	public WebElement getCustomerDropdown() {
		return driver.findElement(selectCustomerDropdown);
	}
	public List<WebElement> getCustomerValue() {
		return driver.findElements(selectcustomervalue);
	}
	
	public WebElement getCreateCustomer() {
		return driver.findElement(createCustomer);
	}
	
	public WebElement getEditCustomer() {
		return driver.findElement(editCustomer);
	}
	
	public WebElement getActionDropdowns() {
		return driver.findElement(actionDropDowns);
	}
	
	public WebElement getDeleteButton() {
		return driver.findElement(deleteButton);
	}
	
	public WebElement getDeletePermanentButton() {
		return driver.findElement(deletePermanentlyButton);
	}
	
	
	public WebElement getSuccessAlert() {
		return driver.findElement(SuccessAlert);
	}
	
	public WebElement enterValueofCustomer() {
		return driver.findElement(enterCustomerName);
	}
	
	public WebElement getSpecificCustomer() {
		return driver.findElement(specificCustomer);
	}
	
	public WebElement getRemoveHints() {
		return driver.findElement(removeHints);
	}
	
	public WebElement getCreateProject() {
		
		return driver.findElement(createProject);
	}
	
	public WebElement getProjectDescription() {
		
		return driver.findElement(projectDescription);
	}
	
	public WebElement getenterTaskName()
	{
		return driver.findElement(enterTaskName);
	}
	
	public WebElement getNewCustomername() {
		return driver.findElement(newCustomerName);
	}
	
	public WebElement getProjectCustomerDd() {
		return driver.findElement(cerateProjectCustomerDropdown);
	}
	
	
	
}
