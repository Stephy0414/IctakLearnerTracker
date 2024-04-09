package com.learnertrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Enter your username']")
	private WebElement trainerUname;
	@FindBy(xpath="//input[@id='password']")
	private WebElement trainerpswrd;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement loginbutton;
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement dashboard;
	//@FindBy(xpath="//span[@class='navbar-toggler-icon']")
	//private WebElement icon;
	@FindBy(xpath="//a[@class='dropdown-toggle nav-link']")
	private WebElement trainerdropdown;
	@FindBy(xpath="//div[@id='basic-navbar-nav']/div/div/div/a[2]")
	private WebElement trainerlogout;
	@FindBy(xpath="//div[@role='alert']")
	private WebElement alert;
	@FindBy(xpath="//a[@id='basic-nav-dropdown']")
	private WebElement pofficer;
	@FindBy(xpath="//div[@id=\"basic-navbar-nav\"]/div/div/div/a[2]")
	private WebElement officerlogout;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setusername(String username)
	{
		trainerUname.sendKeys(username);
	}
	public void setpassword(String password)
	{
		trainerpswrd.sendKeys(password);
	}
	public void login()
	{
		loginbutton.click();
	}
	public boolean Dashboard()
	{
		return dashboard.getText().toString().contains("LearnerTracker");

	}
	public void dropdown()
	{
		trainerdropdown.click();
	}
	public void logout()
	{
		trainerlogout.click();
	}
	public void invalidusername(String username)
	{
		trainerUname.sendKeys(username);
	}
	public void invalidpassword(String password)
	{
		trainerpswrd.sendKeys(password);
	}
	public void Tlogin()
	{
		loginbutton.click();
	}
	public boolean errormsg()
	{
		return alert.getText().toString().contains("Login Failed!!");

	}
	public void traineruname(String username)
	{  
		trainerUname.clear();
		trainerUname.sendKeys(username);
	}
	public void trainerpassword(String password)
	{
		trainerpswrd.clear();
		trainerpswrd.sendKeys(password);
	}
	public void invalidlogin()
	{
		loginbutton.click();
	}
	public void placementofficerlogin(String username, String password)
	{
		trainerUname.clear();
		trainerUname.sendKeys(username);
		trainerpswrd.clear();
		trainerpswrd.sendKeys(password);
	}
	
	public void loginofficer()
	{
		loginbutton.click();
	}
	public void pofficerlogout()
	{
		pofficer.click();
		officerlogout.click();
		
	}

	public void invalidofficerlogin(String username,String password)
	{
		trainerUname.sendKeys(username);
		trainerpswrd.sendKeys(password);
		loginbutton.click();

	}
	public boolean errorlogin()
	{
		return alert.getText().toString().contains("Login Failed!!");

	}
	public void admin(String username,String password)
	{
		trainerUname.clear();
		trainerUname.sendKeys(username);
		trainerpswrd.clear();
		trainerpswrd.sendKeys(password);
		loginbutton.click();

	}
	public boolean adminloginfail()
	{
		return alert.getText().toString().contains("Login Failed!!");

	}
	public void admininvalid(String username,String password)
	{
		trainerUname.clear();
		trainerUname.sendKeys(username);
		trainerpswrd.clear();
		trainerpswrd.sendKeys(password);
		loginbutton.click();


	}
	public boolean invalidlog()
	{
		return alert.getText().toString().contains("Login Failed!!");

	}
	/*public void trainer(String username,String password)
	{
		trainerUname.click();
		trainerUname.clear();
		trainerUname.sendKeys(username);
		trainerpswrd.click();
		trainerpswrd.clear();
		trainerpswrd.sendKeys(password);
		loginbutton.click();

	}*/
	
	
	
}
