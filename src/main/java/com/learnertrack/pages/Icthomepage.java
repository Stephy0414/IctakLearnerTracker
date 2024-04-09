package com.learnertrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Icthomepage {

	
		WebDriver driver;
		@FindBy(xpath="//p[@class='fw-light fs-3']")
		private WebElement landingpage;
		@FindBy(xpath="//label[@class='form-label d-flex text-right']")
		private WebElement username;
		@FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div[2]/div[2]/label")
		private WebElement password;
		@FindBy(xpath="//button[@class='btn btn-success w-100']")
		private WebElement logbutton;
		
		
		public Icthomepage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);		
		}
		public boolean heading()
		{
			return landingpage.getText().toString().contains("ICTAK - Learner Tracker");
		}
		
		public boolean Uname()
		{
			return username.getText().toString().contains("Username");
		}
		public boolean Password()
		{
			return password.getText().toString().contains("Password");
		}
		public boolean LoginButton()
		{
			return logbutton.getText().toString().contains("Login");
		}
}

	
	
	
