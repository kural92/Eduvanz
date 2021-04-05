package com.pom;

import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;
import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Pom_Class extends BaseTest{
	
	
	
	public Pom_Class(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Women')])[1]")
	private WebElement Women;
	public WebElement getWomen() {
		return Women;
	}
	
	
	@FindBy(id="uniform-layered_id_attribute_group_1")
	private WebElement Small;
	public WebElement getSmall() {
		return Small;
	}
	
	

	@FindBy(id="uniform-layered_id_attribute_group_2")
	private WebElement Medium;
	public WebElement getMedium() {
		return Medium;
	}
	
	
	@FindBy(id="layered_id_attribute_group_14")
	private WebElement Blue;
	public WebElement getBlue() {
		return Blue;
	}
	
	
	@FindBy(id="layered_id_attribute_group_13")
	private WebElement Orange;
	public WebElement getOrange() {
		return Orange;
	}
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]")
	private WebElement Check;
	public WebElement getCheck() {
		return Check;
	}
	
	@FindBy(id= "our_price_display")
	private WebElement Price;
	public WebElement getPrice() {
		return Price;
	}
	
	@FindBy(id="group_1")
	private WebElement Size_drop;
	public WebElement getSize_drop() {
		return Size_drop;
	}
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div/section[1]/table/tbody/tr[1]/td[2]")
	private WebElement Composition;
	public WebElement getComposition() {
		return Composition;
	}
	
	@FindBy(id="add_to_cart")
	private WebElement Add_Cart;
	public WebElement getAdd_Cart() {
		return Add_Cart;
	}
	
	@FindBy(xpath = "//strong[contains(text(),'Total products')]//following::span[1]")
	private WebElement Total_Products;
	public WebElement getTotal_Products() {
		return Total_Products;
	}
	
	@FindBy(xpath = "//strong[contains(text(),'Total shipping')]//following::span[1]")
	private WebElement Total_Shopping;
	public WebElement getTotal_Shopping() {
		return Total_Shopping;
	}
	
	@FindBy(xpath = "//strong[contains(text(),'Total shipping')]//following::span[2]" )
	private WebElement Total;
	public WebElement getTotal() {
		return Total;
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	private WebElement Proced;
	public WebElement getProced() {
		return Proced;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
	private WebElement Proced2;
	public WebElement getProced2() {
		return Proced2;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
	private WebElement Proced3;
	public WebElement getProced3() {
		return Proced3;
	}
	
	
	@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
	private WebElement Proced4;
	public WebElement getProced4() {
		return Proced4;
	}
	
	
	@FindBy(id="email")
	private WebElement Email;
	public WebElement getEmail() {
		return Email;
	}
	
	
	@FindBy(id="passwd")
	private WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	
	
	@FindBy(id="SubmitLogin")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	
	
	@FindBy(id="uniform-cgv")
	private WebElement Agree;
	public WebElement getAgree() {
		return Agree;
	}
	
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement Pay_By_Bank;
	public WebElement getPay_By_Bank() {
		return Pay_By_Bank;
	}
	
	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement Confirm_Order;
	public WebElement getConfirm_Order() {
		return Confirm_Order;
	}
	
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div")
	private WebElement Order_details;
	public WebElement getOrder_details() {
		return Order_details;
	}
	
	
}
