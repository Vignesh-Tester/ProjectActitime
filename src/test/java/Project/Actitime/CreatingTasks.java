package Project.Actitime;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
//import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.CreateTasksPage;
import pageObjects.EnterPage;
import pageObjects.LoginPage;
import pageObjects.TaskListPage;
import resources.Basic;

public class CreatingTasks extends Basic {

	@BeforeMethod
	public void initializeBrowser() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Parameters({ "customerName", "customerDescription", "username", "password" })
	@Test()
	public void customerCreate(String customerName, String customerDescription, String username, String password)
			throws IOException, InterruptedException {

		
		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);

		// login to the Website
		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		// Click on tasks
		ep.getTasks().click();

		//
		tlp.getAddNew().click();
		tlp.getNewCustomer().click();
		tlp.getCustomerName().sendKeys(customerName);
		tlp.getCustomerDescription().sendKeys(customerDescription);
		tlp.getCustomerDropdown().click();
		int dropdownValueCount = tlp.getCustomerValue().size();

		for (int i = 0; i < dropdownValueCount; i++) {

			if (tlp.getCustomerValue().get(i).getText().contains("Our company")) {

				tlp.getCustomerValue().get(i).click();
			}

		}

		tlp.getCreateCustomer().click();
		Thread.sleep(2000);
		String aftrecreate = tlp.getSuccessAlert().getText();
		Assert.assertEquals(aftrecreate, "Customer" + " " + "'" + customerName + "'" + " " + "has been created");

	}

	@Parameters({ "customerName", "username", "password" })
	@Test( dependsOnMethods = {"customerCreate"})
	public void customerDelete(String customerName, String username, String password)
			throws IOException, InterruptedException {

		
		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);

		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		ep.getTasks().click();

		tlp.enterValueofCustomer().sendKeys(customerName);
		tlp.getSpecificCustomer().click();
		tlp.getEditCustomer().click();
		tlp.getRemoveHints().click();

		Thread.sleep(3000);
		tlp.getActionDropdowns().click();
		tlp.getDeleteButton().click();
		tlp.getDeletePermanentButton().click();
		String afterDelete = tlp.getSuccessAlert().getText();
		Thread.sleep(2000);
		Assert.assertEquals(afterDelete, "Customer" + " " + "'" + customerName + "'" + " " + "has been deleted");

	}

	@Parameters({ "projectName", "projectDescription", "username", "password", "newcustomerName" })
	@Test()
	public void projectCreate(String projectName, String projectDescription, String username, String password,
			String newcustomerName) throws IOException {

		
		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);

		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		ep.getTasks().click();
		tlp.getAddNew().click();
		tlp.getNewProject().click();

		tlp.getCreateProject().sendKeys(projectName);
		tlp.getCustomerDropdown().click();

		tlp.getProjectCustomerDd().click();

		tlp.getNewCustomername().sendKeys(newcustomerName);
		tlp.getProjectDescription().sendKeys(projectDescription);
		tlp.getCreateCustomer().click();
		String afterDelete = tlp.getSuccessAlert().getText();
		Assert.assertEquals(afterDelete, "Project" + " " + "'" + projectName + "'" + " " + "has been created");
	}

	@Parameters({ "projectName", "projectDescription", "username", "password", "newcustomerName" })
	@Test(dependsOnMethods = {"projectCreate"})
	public void projecttaskCreate(String projectName, String projectDescription, String username, String password,
			String newcustomerName) throws IOException, InterruptedException {

		

		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);

		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		ep.getTasks().click();
		tlp.enterValueofCustomer().sendKeys(newcustomerName);
		tlp.getSpecificCustomer().click();

		tlp.getAddNew().click();
		tlp.getNewTasks().click();
		Thread.sleep(2000);
		tlp.getCustomerDropdown().click();
	
		tlp.clickCreatedProject().click();
		tlp.clickExistingTaskslink().click();

		tlp.clickExistingTaskDropdown().click();

		int count = tlp.getlistedtasks().size();

		for (int i = 0; i < count; i++) {

			if (tlp.getlistedtasks().get(i).getText().equalsIgnoreCase("Big Bang Company"))
			{
				tlp.getlistedtasks().get(i).click();
			}
		}

		tlp.clickSelectalltasksCheckbox().click();
		tlp.clickCopytaskdescCheckBox().click();
		tlp.clickCopyProperties().click();
		Thread.sleep(2000);
		tlp.clickCreatetasks().click();
	}
	
	@Parameters({"username", "password", "newcustomerName","clickcheckBox"})
	@Test(dependsOnMethods = {"projectCreate","projecttaskCreate"})
	public void projecttaskDelete(String username, String password,String newcustomerName, String clickcheckBox) throws IOException, InterruptedException {
		
		

		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);
		CreateTasksPage ctp = new CreateTasksPage(driver);
		
		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		ep.getTasks().click();
		tlp.enterValueofCustomer().sendKeys(newcustomerName);
		tlp.getSpecificCustomer().click();
		ctp.enterTaskName().sendKeys(clickcheckBox);
		Thread.sleep(3000);
		ctp.clicktaskNameCheckbox().click();
		Thread.sleep(3000);
		ctp.clickDeleteTask().click();
		ctp.clickDeletePermanently().click();
	
		String afterDelete = tlp.getSuccessAlert().getText();
		//System.out.println(afterDelete);
		Assert.assertEquals(afterDelete, "Task" + " " + "'" + clickcheckBox + "'" + " " + "has been deleted");
		
	}

	@Parameters({"username", "password", "newcustomerName"})
	@Test(dependsOnMethods = {"projectCreate","projecttaskCreate", "projecttaskDelete"})
	public void projecttaskComplete(String username, String password,String newcustomerName) throws IOException, InterruptedException {
		

		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);
		CreateTasksPage ctp = new CreateTasksPage(driver);
		
		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		ep.getTasks().click();
		tlp.enterValueofCustomer().sendKeys(newcustomerName);
		tlp.getSpecificCustomer().click();
		
		ctp.clickSelectAlltasks().click();
		Thread.sleep(3000);
		
		ctp.clickChangeStatus().click();
		ctp.clickChangeStatusDropdown().click();
		ctp.getCompletedStatus().click();
		
		ctp.getApplybutton().click();
		//String afterDelete = tlp.getSuccessAlert().getText();
		//System.out.println(afterDelete);
	}
	
	@Parameters({"username", "password", "newcustomerName"})
	@Test(dependsOnMethods = {"projectCreate","projecttaskCreate", "projecttaskDelete","projecttaskComplete"})
	public void projectDelete(String username, String password,String newcustomerName) throws InterruptedException, IOException {
		
		

		LoginPage lp = new LoginPage(driver);
		TaskListPage tlp = new TaskListPage(driver);
		EnterPage ep = new EnterPage(driver);
		
		
		lp.getUserName().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getLoginButton().click();

		ep.getTasks().click();
		tlp.enterValueofCustomer().sendKeys(newcustomerName);
		tlp.getSpecificCustomer().click();
		tlp.getEditCustomer().click();
		Thread.sleep(3000);
		tlp.getActionDropdowns().click();
		tlp.getDeleteButton().click();
		tlp.getDeletePermanentButton().click();
		String afterDelete = tlp.getSuccessAlert().getText();
		Thread.sleep(2000);
		Assert.assertEquals(afterDelete, "Customer" + " " + "'" + newcustomerName + "'" + " " + "has been deleted");
		
	}
}
