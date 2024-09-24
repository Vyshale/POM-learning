package testCaseFactory;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learning.LoginPageFunctionalities;

public class DWS_Login_001 extends LoginPageFunctionalities{


	@Test
	public void loginTest()
	{
		

		boolean EmailVal = getEmailLabel();
		Assert.assertEquals(EmailVal, true);

		boolean PassVal = getPasswordLabel();
		Assert.assertTrue(PassVal);

		new LoginPageFunctionalities()
		.usernameInput("ajay1927@gmail.com")
		.passwordInput("Pass@1927")
		.loginButton();


	}

}
