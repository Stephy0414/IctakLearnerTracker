package com.learnertrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Learnerformpage {

	WebDriver driver;
	@FindBy(xpath="//div[@id=\"root\"]/div/div/div[2]/main/div/a[1]/button/ion-icon")
	private WebElement form;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/div/div/div/div/div[1]/div/div[2]/p")
	private WebElement invalid;
	@FindBy(xpath="//input[@id='learnerid']")
	private WebElement id;
	@FindBy(xpath="//input[@id='name']")
	private WebElement username;
	@FindBy(xpath="//select[@class='form-select required']")
	private WebElement course;
	@FindBy(xpath="//select[@class='form-select required' and @name='project']")
	private WebElement project;
	@FindBy(xpath="//select[@class='form-select required' and @name='batch']")
	private WebElement batch;
	@FindBy(xpath="//select[@class='form-select required' and @name='cstatus']")
	private WebElement status;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement submit;
	@FindBy(xpath="//div[@id='swal2-html-container']")
	private WebElement submited;
	@FindBy(xpath="//button[@type='button' and @class='swal2-confirm swal2-styled']")
	private WebElement successful;
	@FindBy(xpath="//div[@id=\"root\"]/div/div/div[2]/main/div/a[2]/button")
	private WebElement upload;
	@FindBy(xpath="//input[@type='file' and @name='file']")
	private WebElement csvfile;
	@FindBy(xpath="//button[@class='ui grey mini button' and @type='submit']")
	private WebElement submitcsv;
	@FindBy(xpath="//h2[@id='swal2-title']")
	private WebElement addsuccessful;
	@FindBy(xpath="//button[@type='button' and @class='swal2-confirm swal2-styled']")
	private WebElement dashboard;
	@FindBy(xpath="//button[@type='button' and @class='swal2-confirm swal2-styled']")
	private WebElement accept;
	@FindBy(xpath="//a[@class='dropdown-toggle nav-link']")
	private WebElement trainerlogout;
	@FindBy(xpath="//div[@id=\"basic-navbar-nav\"]/div/div/div/a[2]")
	private WebElement logouttraining;
	@FindBy(xpath="//input[@placeholder='Enter your username']")
	private WebElement pusername;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pswrd;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement loginbutton;
	@FindBy(xpath="//button[@type='button' and @class='btn btn-success btn btn-primary']")
	private WebElement statuschange;
	@FindBy(xpath="//select[@class='form-select' and @name='pstatus']")
	private WebElement change;
	@FindBy(xpath="//option[@value='Placed']")
	private WebElement selected;
	@FindBy(xpath="//a[@id='basic-nav-dropdown']")
	private WebElement pofficer;
	@FindBy(xpath="//*[@id=\"basic-navbar-nav\"]/div/div/div/a[2]")
	private WebElement logout;
	
	
	
	
	public Learnerformpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void learneraddbutton()
	{
		form.click();
	}
	public void invalidsubmition()
	{
		submit.click();
	}
	public boolean invalidname ()
	{
		return invalid.getText().toString().contains("Must contain letters,numbers and - only");

	}
	public void enterid(String userid,String name)
	{
		id.sendKeys(userid);
		username.sendKeys(name);
			
	}
	public void lrnrcourse()
	{
	Select dropdown = new Select(course);  
	dropdown.selectByVisibleText("ST");
	}
	public void lrnrproject()
	{
	Select dropdown = new Select(project);  
	dropdown.selectByVisibleText("ICTAK");
	}
	public void lrnrbatch ()
	{
	Select dropdown = new Select(batch);  
	dropdown.selectByVisibleText("Aug_22");
	}
	public void lrnrstatus ()
	{
	Select dropdown = new Select(status);  
	dropdown.selectByVisibleText("Qualified");
	}
	public void formsubmit()
	{
		submit.click();
	}
	public boolean formsubmition()
	{
		return submited.getText().toString().contains("Posted successfully");

	}
	public void formsuccess()
	{
		successful.click();
	}
	public void uploadfile()
	{
		upload.click();
	}
	public void csvupload(String path)
	{
		csvfile.sendKeys(path);
	    

	}
	public void csvfilesubmit()
	{
		submitcsv.click();
	}
	public boolean cvsadd()
	{
		return addsuccessful.getText().toString().contains("Data added successfully..!");

	}
	public void returndashboard()
	{
		dashboard.click();
	}
	public void submit()
	{
		accept.click();
	}
	public void logouttrainer()
	{
		trainerlogout.click();
		logouttraining.click();
	}
	public void placementuname(String username,String password)
	{
		pusername.sendKeys(username);
		pswrd.sendKeys(password);
		
	}
	public void pofficerlogin()
	{
		loginbutton.click();
		statuschange.click();
		change.click();
		selected.click();
		pofficer.click();
		logout.click();
		
		

	}
	
	


}		

