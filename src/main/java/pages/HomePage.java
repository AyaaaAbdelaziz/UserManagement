package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
Actions actions;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminMenu;
	@FindBy(id="menu_admin_UserManagement")
	WebElement userManagementMenu;
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement User;
	public HomePage(WebDriver driver) {
		super(driver);
		actions =new Actions(driver);
	}

	public void hoverMenu() {
		actions.moveToElement(adminMenu).moveToElement(userManagementMenu).moveToElement(User).click().perform();
		
	}
}
