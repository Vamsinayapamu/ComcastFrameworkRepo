package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	WebDriver driver;
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
	@FindBy(xpath="//img[@alt='Create Product...']") private WebElement productLink;
	@FindBy(name="search") private WebElement search;
	
	public WebElement getproductLink()
	{
		return productLink;
	}
	public WebElement getsearch()
	{
		return search;
	}
	
	
	
	
	
	

}
