package com.actualPomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePackage.Base;

public class LoginPage  {



	//WebElement Locators

	@FindBy(id="Email")
	private WebElement EmailIDTF;

	@FindBy(id="Password")
	private WebElement PasswordTF;

	@FindBy(id="RememberMe")
	private WebElement RememberMeCheckBox;

	@FindBy(linkText = "Forgot password?")
	private WebElement ForgotPasswordLink;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}


	//Getters Method
	public WebElement getEmailIDTF() {
		return EmailIDTF;
	}
	public WebElement getPasswordTF() {
		return PasswordTF;
	}


	public WebElement getRememberMeCheckBox() {
		return RememberMeCheckBox;
	}

	public WebElement getForgotPasswordLink() {
		return ForgotPasswordLink;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void performLogin(String email,String pass) {
		
		getEmailIDTF().sendKeys(email);
		getPasswordTF().sendKeys(pass);
		getLoginButton().click();
		
	}



}
