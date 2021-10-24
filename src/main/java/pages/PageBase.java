package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	public Select select;

	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
protected static void clickBtn(WebElement button) {
	button.click();
}
protected static void SetText(WebElement TextBox,String text) {
	TextBox.sendKeys(text);
}
}
