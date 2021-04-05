package com.TestScript;


import org.apache.bcel.generic.BASTORE;
import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Base.BaseTest;
import com.pom.Pom_Class;
import com.utility.Utility;

public class Ecommerce extends BaseTest {
	
	
	@Test
	public void shopping() throws Throwable {
		
		Utility u = new Utility();
		Pom_Class p = new Pom_Class(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		u.urlLoader();
		
		BaseTest.waits(p.getWomen());
	//	acc.moveToElement(p.getWomen()).build().perform();
		BaseTest.click(p.getWomen());
		System.out.println("Clicked on The Women Dress categories");
		js.executeScript("window.scrollBy(0,500)");
		
		BaseTest.waits(p.getSmall());
		BaseTest.click(p.getSmall());
		System.out.println("Checking the Dress Size");
		System.out.println();
		
		BaseTest.waits(p.getMedium());
		BaseTest.click(p.getMedium());
		System.out.println("Looking For a Small and Medium Size Dress");
		
		
		BaseTest.waits(p.getOrange());
		BaseTest.click(p.getOrange());
		System.out.println("Checking Dress Color");

		

		BaseTest.waits(p.getBlue());
		BaseTest.click(p.getBlue());
		
		System.out.println("Looking for Blue and Orange Color Dress");
		js.executeScript("window.scrollBy(0,300)");
		
		BaseTest.waits(p.getCheck());
		BaseTest.waits(p.getCheck());
		BaseTest.click(p.getCheck());
		try {
			BaseTest.click(p.getCheck());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(3000);
		String Price = p.getPrice().getText();
		System.out.println("The Dress Price was "+Price);
		String dol = Price.substring(1 , 6);
		float Dolar = Float.parseFloat(dol);
		
		
		if (Dolar<=50) {	
			System.out.println("The Puchased amount was less than or equal to 50 ");	
		} else {
           	System.err.println("The Puchased amount was not less than or equal to 50 ");
		}
		
		
		Select s = new Select(p.getSize_drop());
		String ss = s.getFirstSelectedOption().getText();
		if (ss.contains("S")) {
			System.out.println("The Choosen Size Dress was S");
		} else if (ss.contains("M")) {
			System.out.println("The Choosen Size Dress was M");
		} else {
			System.out.println("The Choosen Size Dress was L");
		}


		js.executeScript("window.scrollBy(0,300)");
		String Composition = p.getComposition().getText();
		System.out.println("The Dress Chosen was 100% "+Composition);
		
		
		BaseTest.waits(p.getAdd_Cart());
		BaseTest.click(p.getAdd_Cart());
				
	
		System.out.println(p.getTotal_Products().getText());
		System.out.println(p.getTotal_Shopping().getText());	
		System.out.println(p.getTotal().getText());
		
		
		 BaseTest.waits(p.getProced());
		 BaseTest.click(p.getProced());

	
		 BaseTest.waits(p.getProced2());
		 BaseTest.click(p.getProced2());
		 js.executeScript("window.scrollBy(0,200)");
		 
		 BaseTest.waits(p.getEmail());
		 BaseTest.typeData(p.getEmail(), BaseTest.getExcelData("URL", 0, 1));
		 
		 BaseTest.waits(p.getPassword());
		 BaseTest.typeData(p.getPassword(), BaseTest.getExcelData("URL", 0, 2));
		 
		 BaseTest.waits(p.getSubmit());
		 BaseTest.click(p.getSubmit());
		 
		 js.executeScript("window.scrollBy(0,300)");
		 js.executeScript("window.scrollBy(0,300)");
		 
		 BaseTest.waits(p.getProced3());
		 BaseTest.click(p.getProced3());
		 js.executeScript("window.scrollBy(0,300)");
		
		 
		
		 BaseTest.waits(p.getAgree());
		 BaseTest.click(p.getAgree());
		 
		 
			 BaseTest.waits(p.getProced4());
			 BaseTest.click(p.getProced4());
		 
			 
		 
		 BaseTest.waits(p.getPay_By_Bank());
		 BaseTest.click(p.getPay_By_Bank());
		 
		 
		 BaseTest.waits(p.getConfirm_Order());
		 BaseTest.click(p.getConfirm_Order());
		 
		 
		 BaseTest.waits(p.getOrder_details());
		 System.out.println("The Order are "+"/n"+"/n"+ p.getOrder_details().getText());
		 
		 
		 
	}

}
