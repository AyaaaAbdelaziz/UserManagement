package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
public LoginPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id="txtUsername")
WebElement UsernameTxt;
@FindBy(id="txtPassword")
WebElement PasswordTxt;
@FindBy(id="btnLogin")
WebElement LoginBtn;
public void UserLogin(String username ,String password) {
	SetText(UsernameTxt, username);
	SetText(PasswordTxt, password);
	clickBtn(LoginBtn);
}
}
