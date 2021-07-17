package com.AdactinMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 extends AdactinBase{
	
	@FindBy(id="username")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}

    @FindBy(id="login")
    private WebElement login;
   
	public WebElement getLogin() {
		return login;
	}

   




	public Pom1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

}
