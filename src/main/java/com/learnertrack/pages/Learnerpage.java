package com.learnertrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Learnerpage {

	WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	private WebElement traineruser;
	@FindBy(xpath="//input[@id='password']")
	private WebElement trainerpass;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement Login;
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement learnerdashboard;
	@FindBy(xpath="//button[@type='button' and @class='mb-3 btn btn-success']")
	private WebElement add;
	@FindBy(xpath="//div[@id=\"root\"]/div/div/div[2]/main/div/div/h3")
	private WebElement form;
	@FindBy(xpath="//label[@class='form-label']")
	private WebElement id;
	@FindBy(xpath="//label[@for='name']")
	private WebElement name;
	@FindBy(xpath="//label[@for='course']")
	private WebElement course;
	@FindBy(xpath="//label[@for='project']")
	private WebElement project;
	@FindBy(xpath="//label[@for='batch']")
	private WebElement batch;
	@FindBy(xpath="//div[@id='root']/div/div/div[2]/main/div/div/div/div/div/div[6]/div/div[1]/label")
	private WebElement coursestatus;
	@FindBy(xpath="//select[@class='form-select required']")
	private WebElement cselection;
	@FindBy(xpath="//option[@value='FSD']")
	private WebElement course1;
	@FindBy(xpath="//option[@value='DSA']")
	private WebElement course2;
	@FindBy(xpath="//option[@value='ML-AI']")
	private WebElement course3;
	@FindBy(xpath="//option[@value='RPA']")
	private WebElement course4;
	@FindBy(xpath="//option[@value='ST']")
	private WebElement course5;
	@FindBy(xpath="//option[@value='CSA']")
	private WebElement course6;
	@FindBy(xpath="//select[@class='form-select required' and @name='course']")
	private WebElement projectselection;
	@FindBy(xpath="//option[@value='ICTAK']")
	private WebElement project1;
	@FindBy(xpath="//option[@value='KKEM']")
	private WebElement project2;
	@FindBy(xpath="//option[@value='NORKA']")
	private WebElement project3;
	@FindBy(xpath="//option[@value='ABCD']")
	private WebElement project4;
	@FindBy(xpath="//option[@value='KDISC']")
	private WebElement project5;
	@FindBy(xpath="//select[@class='form-select required' and @name='batch']")
	private WebElement batchdropdown;
	@FindBy(xpath="//option[@value='May_22']")
	private WebElement batch1;
	@FindBy(xpath="//option[@value='Jun_22']")
	private WebElement batch2;
	@FindBy(xpath="//option[@value='Jul_22']")
	private WebElement batch3;
	@FindBy(xpath="//option[@value='Aug_22']")
	private WebElement batch4;
	@FindBy(xpath="//option[@value='Dec_22']")
	private WebElement batch5;
	@FindBy(xpath="//option[@value='Mar_23']")
	private WebElement batch6;
	@FindBy(xpath="//select[@class='form-select required' and @name='cstatus']")
	private WebElement statusselection;
	@FindBy(xpath="//option[@value='Qualified']")
	private WebElement status1;
	@FindBy(xpath="//option[@value='Incompetent']")
	private WebElement status2;
	@FindBy(xpath="//button[@class='btn btn-warning']")
	private WebElement backbutton;
	
	
	
	
	public Learnerpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void setlearner(String username,String password)
	{
		traineruser.clear();
		traineruser.sendKeys(username);
		trainerpass.clear();
		trainerpass.sendKeys(password);
		Login.click();
			
		
	}
	public void learneradd()
	{
		add.click();
	}
	public boolean learnerform()
	{
		return form.getText().toString().contains("Learner's form");
	}
	public boolean learnerid()
	{
		return id.getText().toString().contains("Learner Id :");
	}
	public boolean learnername()
	{
		return name.getText().toString().contains("Name :");
	}
	public boolean learnercourse()
	{
		return course.getText().toString().contains("Course :");
	}
	public boolean learnerproject()
	{
		return project.getText().toString().contains("Project :");
	}
	public boolean learnerbatch()
	{
		return batch.getText().toString().contains("Batch :");
	}
	public boolean learnercoursestatus()
	{
		return coursestatus.getText().toString().contains("Course Status :");
	}
	public void coursedropdown()
	{
		cselection.click();
	}
	public boolean learnercourse1()
	{
		return course1.getText().toString().contains("FSD");
	}
	public boolean learnercourse2()
	{
		return course2.getText().toString().contains("DSA");
	}
	public boolean learnercourse3()
	{
		return course3.getText().toString().contains("ML-AI");
	}
	public boolean learnercourse4()
	{
		return course4.getText().toString().contains("RPA");
	}
	public boolean learnercourse5()
	{
		return course5.getText().toString().contains("ST");
	}
	public boolean learnercourse6()
	{
		return course6.getText().toString().contains("CSA");
	}
	public void projectselect()
	{
		projectselection.click();
	}
	public boolean learnerproject1()
	{
		return project1.getText().toString().contains("ICTAK");
	}
	public boolean learnerproject2()
	{
		return project2.getText().toString().contains("KKEM");
	}
	public boolean learnerproject3()
	{
		return project3.getText().toString().contains("NORKA");
	}
	public boolean learnerproject4()
	{
		return project4.getText().toString().contains("ABCD");
	}
	public boolean learnerproject5()
	{
		return project5.getText().toString().contains("KDISC");
	}
	public void batchselection()
	{
		batchdropdown.click();
	}
	public boolean learnerbatch1()
	{
		return batch1.getText().toString().contains("May_22");
	}
	public boolean learnerbatch2()
	{
		return batch2.getText().toString().contains("Jun_22");
	}
	public boolean learnerbatch3()
	{
		return batch3.getText().toString().contains("Jul_22");
	}
	public boolean learnerbatch4()
	{
		return batch4.getText().toString().contains("Aug_22");
	}
	public boolean learnerbatch5()
	{
		return batch5.getText().toString().contains("Dec_22");
	}
	public boolean learnerbatch6()
	{
		return batch6.getText().toString().contains("Mar_23");
	}
	public void learnerstatus()
	{
		statusselection.click();
	}
	public boolean status()
	{
		return status1.getText().toString().contains("Qualified");
	}
	public boolean statuscheck()
	{
		return status2.getText().toString().contains("Incompetent");
	}
	public void dashboard()
	{
		backbutton.click();
	}
	
	
	
	


	


}
