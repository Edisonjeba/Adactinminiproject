package com.AdactinMiniProject;

import org.apache.commons.math3.distribution.EnumeratedRealDistribution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.Logs;
import org.openqa.selenium.support.ui.Select;

public class MainScript extends AdactinBase{
	
	public static void main(String[] args) throws Throwable {
		driver = getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");
		
		Pom1 lg = new Pom1(driver);
		SearchHotelPom2 sh = new SearchHotelPom2(driver);
		LogoutPom3 lp = new LogoutPom3(driver);
		SelectPom4 sp = new SelectPom4(driver);
		
		
		enterText( lg.getUsername(), "Edison1994");
		enterText(lg.getPassword(), "7806863409");
		clickBox(lg.getLogin());
		
		
		//clickBox(lg.getCountry());
		
		DropDown(sp.getCountry(), "Sydney");
		DropDown(sp.getHotel(), "Hotel Sunshine");
		DropDown(sp.getRoom(), "Double");
		DropDown(sp.getRoomtype1(), "2");
		DropDown(sp.getChildroom(), "1");
		Thread.sleep(2000);
		clickBox(sp.getSearch());
		
		clickBox(sp.getRadiobutton());
		clickBox(sp.getContinue1());
		
		enterText(sh.getFstname(), "Edison");
		enterText(sh.getLstname(), "Jeba");
		enterText(sh.getTxtarea(), "33,North street, Nellai");
		Thread.sleep(2000);
		enterText(sh.getCcnumber(), "1234987465418563");
		DropDown(sh.getCtype(),"AMEX");
		DropDown(sh.getMonth(), "3");
		DropDown(sh.getYear(), "2021");
		enterText(sh.getCvvno(), "124");
		Thread.sleep(2000);
		clickBox(sh.getBooknow());
		
		
		clickBox(lp.getLogout());
		
		
	}

	


	

}
