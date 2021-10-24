package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserManagementPage extends PageBase {

	public UserManagementPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="btnAdd")
	WebElement AddUserBtn;
	@FindBy(id="systemUser_userType")
	 public WebElement UserRoleList;
	@FindBy(id="systemUser_employeeName_empName")
	public WebElement EmployeeNameTxt;
	@FindBy(id="systemUser_employeeName_empName")
	List<WebElement>EmplyeesList;
	@FindBy(id="systemUser_userName")
	public WebElement UsernameTxt;
	@FindBy(id="systemUser_status")
	public WebElement StatusList;
	@FindBy(id="systemUser_password")
	WebElement PassowrdTxt;
	@FindBy(id="systemUser_confirmPassword")
	WebElement ConfirmPassTxt;
	@FindBy(id="btnSave")
	WebElement SaveBtn;
	@FindBy(id="searchSystemUser_userName")
	WebElement SearchUserTxt;
	@FindBy(id="searchBtn")
	WebElement SearchBtn;
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")
	public WebElement ResultsTable;

	public void openAddUserForm() {
		clickBtn(AddUserBtn);
	}
	public void AddUser(String EmployeeName,String Username,String Passowrd,String confirmPassword) {
		SetText(EmployeeNameTxt, EmployeeName);
		EmplyeesList.get(0).click();
		select = new Select(UserRoleList);
		select.selectByVisibleText("ESS");
		SetText(UsernameTxt, Username);
		select = new Select(StatusList);
		select.selectByVisibleText("Enabled");
		SetText(PassowrdTxt, Passowrd);
		SetText(ConfirmPassTxt, confirmPassword);
		clickBtn(SaveBtn);
	}
	public void SearchUser(String Username) {
		SetText(SearchUserTxt, Username);
		clickBtn(SearchBtn);
	}
	public void OpenUserDetails() {
		clickBtn(ResultsTable);
	}
	public String GetUserRole() {
		select = new Select(UserRoleList);

String	Userrole=select.getFirstSelectedOption().getText();
return Userrole;

	}
	public String GetStatus() {
		select = new Select(StatusList);

String	Status=select.getFirstSelectedOption().getText();
return Status;

	}

	

}
