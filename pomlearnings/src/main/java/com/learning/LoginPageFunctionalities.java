package com.learning;

import org.openqa.selenium.By;

import com.basePackage.Base;

public class LoginPageFunctionalities extends Base {

	
	
	// Validation Counter

	public boolean getEmailLabel() {
		return driver.findElement(By.partialLinkText(("Email"))).isDisplayed();

	}

	public boolean getPasswordLabel() {
		return driver.findElement(By.partialLinkText(("Password"))).isDisplayed();

	}

	public boolean getLoginLabel() {
		return driver.findElement(By.xpath(("//input[@class='button-1 login-button']"))).isDisplayed();

	}

	// Action performing

	public LoginPageFunctionalities usernameInput(String username) {
		driver.findElement(By.id("Email")).sendKeys(username);
		return this;
	}

	public LoginPageFunctionalities passwordInput(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
		return this;
	}

	public DashBoard loginButton() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		return new DashBoard();
	}

	public LoginPageFunctionalities rememberMeCheckBox() {
		driver.findElement(By.id("RememberMe")).click();
		return this;
	}

	public ForgotPassword forgotPasswordLink() {
		driver.findElement(By.linkText("Forgot password?")).click();
		return new ForgotPassword();
	}

	public void login(String username, String Password) {
		usernameInput(username);
		passwordInput(Password);
		loginButton();
	}

}
