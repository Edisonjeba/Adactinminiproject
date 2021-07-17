package com.AdactinMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom2 extends AdactinBase {
	
	@FindBy(xpath="//input[@id=\'first_name\']")
	private WebElement fstname;
	
	public WebElement getFstname() {
		return fstname;
	}

    @FindBy(xpath="//input[@id=\'last_name\']")
    private WebElement lstname;

	public WebElement getLstname() {
		return lstname;
	}

	@FindBy(xpath="//textarea[@id=\'address\']")
	private WebElement txtarea;

	public WebElement getTxtarea() {
		return txtarea;
	}

	@FindBy(xpath="//input[@id=\'cc_num\']")
    private WebElement ccnumber;

	public WebElement getCcnumber() {
		return ccnumber;
	}
	
	@FindBy(xpath="//select[@id=\'cc_type\']")
	private WebElement ctype;
	
	public WebElement getCtype() {
		return ctype;
	}

	@FindBy(xpath="//select[@id=\'cc_exp_month\']")
	private WebElement month;
	
	
	

	@FindBy(xpath="//select[@id=\'cc_exp_year\']")
	private WebElement year;
	
	
	@FindBy(xpath="//input[@id=\'cc_cvv\']")
	private WebElement cvvno;
	
	
	@FindBy(xpath="//input[@id=\'book_now\']")
	private WebElement booknow;
	
	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	


	public SearchHotelPom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	

}
