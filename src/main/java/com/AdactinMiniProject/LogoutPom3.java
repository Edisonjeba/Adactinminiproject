package com.AdactinMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPom3 extends AdactinBase {
	
	@FindBy(xpath="//input[@id=\'logout\']")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}




	public LogoutPom3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}

}
