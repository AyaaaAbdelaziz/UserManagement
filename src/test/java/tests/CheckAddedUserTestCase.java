package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserManagementPage;

public class CheckAddedUserTestCase extends TestBase{

	LoginPage loginPageObj;
	HomePage homepageObj;
	UserManagementPage UserManagementPageObj;
	String Username="Admin", Password = "admin123",EmployeeName="Alice Duval",U_Username="Tester04",UPassowrd="12345678"; 
	String tableData[];
	@Test(priority=1)
	public void Login() {
		loginPageObj = new LoginPage(driver);
		loginPageObj.UserLogin(Username, Password);
	}
	@Test(priority=2)
	public void NavigateToUserManagement() {
		homepageObj=new HomePage(driver);
		homepageObj.hoverMenu();
	}
	@Test(priority=3)

	public void AddUser() throws InterruptedException {
		UserManagementPageObj =new UserManagementPage(driver);
		UserManagementPageObj.openAddUserForm();
		UserManagementPageObj.AddUser(EmployeeName, U_Username, UPassowrd, UPassowrd);
		Thread.sleep(3000);

	}
	@Test(priority=4)
	public void searchForUSer() {
		UserManagementPageObj.SearchUser(U_Username);
	}
	@Test(priority=5)
	public void OpenUserDetails() {
		UserManagementPageObj.OpenUserDetails();

	}
	@Test(priority=6)

	public void checkUser() {

		Assert.assertEquals( UserManagementPageObj.UsernameTxt.getAttribute("value"),U_Username);
		Assert.assertEquals(UserManagementPageObj.EmployeeNameTxt.getAttribute("value"),EmployeeName);
		Assert.assertEquals(UserManagementPageObj.GetUserRole(),"ESS");
		Assert.assertEquals(UserManagementPageObj.GetStatus(),"Enabled");


	}


}
