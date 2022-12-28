package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomfb {
@FindBy(id="email");
private WebElement unTbox;

@FindBy(name="pwd");
private WebElement pwdTbox;
@FindBy(name="login");
private WebElement loginTbox;

	public pomfb(WebDriver driver);

	{
		PageFactory.initElements(driver, this);
	}

	public void undate(strin un) {

	}

}
