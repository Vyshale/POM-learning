package testCaseFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actualPomPackage.LoginPage;
import com.basePackage.Base;


@Test
public class performLogin extends Base {


	public void login()
	{
	     LoginPage	lp = new LoginPage(driver);
	     
	     lp.performLogin("vyshale.s@gmail.com", "Pass123@");
	}
}
