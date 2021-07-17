package com.AdactinMiniProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPom4 extends AdactinBase{
	
	@FindBy(xpath="//select[@id=\"location\"]")
	   private WebElement country;
	   
		public WebElement getCountry() {
		return country;
	     }
		
		@FindBy(xpath="//select[@id=\'hotels\']")
		private WebElement hotel;
		
		public WebElement getHotel() {
			return hotel;
		}
		
	    @FindBy(xpath="//select[@id=\'room_type\']")
	    private WebElement room;

		public WebElement getRoom() {
			return room;
		}
		
		@FindBy(xpath="//select[@id=\'room_nos\']")
		private WebElement roomtype1;
		
		public WebElement getRoomtype1() {
			return roomtype1;
		}

		@FindBy(xpath="//select[@id=\'child_room\']")
		private WebElement childroom;

		public WebElement getChildroom() {
			return childroom;
		}
		
		@FindBy(xpath="//input[@id=\'Submit\']")
		private WebElement search;
		
		public WebElement getSearch() {
			return search;
		}

		@FindBy(xpath="//input[@id=\'radiobutton_0\']")
		private WebElement radiobutton;

		public WebElement getRadiobutton() {
			return radiobutton;
		}

		@FindBy(xpath="//input[@id=\'continue\']")
		private WebElement continue1;

		public WebElement getContinue1() {
			return continue1;
		}


		public SelectPom4(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver2, this);
			
		}

}
