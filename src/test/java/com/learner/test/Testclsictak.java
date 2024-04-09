package com.learner.test;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.Assert;

import com.learnertrack.pages.Icthomepage;
import com.learnertrack.pages.Learnerformpage;
import com.learnertrack.pages.Learnerpage;
import com.learnertrack.pages.Loginpage;

public class Testclsictak extends Baseclsictak {
	Icthomepage hobj;
	Loginpage loginobj;
	Learnerpage lobj;
	Learnerformpage formobj;
	
	@Test
	public void TC1()
	{
		hobj=new Icthomepage(driver);
		Assert.assertTrue(hobj.heading());
		Assert.assertTrue(hobj.Uname());
		Assert.assertTrue(hobj.Password());
		Assert.assertTrue(hobj.LoginButton());



	}
	@Test
	public void TC2()
	{
		loginobj=new Loginpage(driver);
		loginobj.setusername("trainer");
		loginobj.setpassword("trainer@123");
		loginobj.login();
		Assert.assertTrue(loginobj.Dashboard());
		loginobj.dropdown();
		loginobj.logout();
		loginobj.invalidusername("trainer");
		loginobj.invalidpassword("trainer@1234");
		loginobj.Tlogin();
		Assert.assertTrue(loginobj.errormsg());
		loginobj.traineruname(" ");
		loginobj.trainerpassword(" ");
		loginobj.invalidlogin();
		loginobj.placementofficerlogin("pofficer","pofficer@123");
		loginobj.loginofficer();
		loginobj.pofficerlogout();
		loginobj.invalidofficerlogin("pofficer","pofficer@1234");
		Assert.assertTrue(loginobj.errorlogin());
		loginobj.admin("admin","admin@123");
		Assert.assertFalse(loginobj.adminloginfail());
		loginobj.admininvalid("admin123","admin@123");
		Assert.assertTrue(loginobj.invalidlog());
		//loginobj.trainer("trainer","trainer@123");

		
	}
	@Test
	public void TC3()
	{
		lobj=new Learnerpage(driver);
		lobj.setlearner("trainer","trainer@123");
		lobj.learneradd();
		Assert.assertTrue(lobj.learnerform());
		Assert.assertTrue(lobj.learnerid());
		Assert.assertTrue(lobj.learnername());
		Assert.assertTrue(lobj.learnercourse());
		Assert.assertTrue(lobj.learnerproject());
		Assert.assertTrue(lobj.learnerbatch());
		Assert.assertTrue(lobj.learnercoursestatus());
		lobj.coursedropdown();
		Assert.assertTrue(lobj.learnercourse1());
		Assert.assertTrue(lobj.learnercourse2());
		Assert.assertTrue(lobj.learnercourse3());
		Assert.assertTrue(lobj.learnercourse4());
		Assert.assertTrue(lobj.learnercourse5());
		Assert.assertTrue(lobj.learnercourse6());
		lobj.coursedropdown();
		Assert.assertTrue(lobj.learnerproject1());
		Assert.assertTrue(lobj.learnerproject2());
		Assert.assertTrue(lobj.learnerproject3());
		Assert.assertTrue(lobj.learnerproject4());		
		Assert.assertTrue(lobj.learnerproject5());
		lobj.batchselection();
		Assert.assertTrue(lobj.learnerbatch1());
		Assert.assertTrue(lobj.learnerbatch2());
		Assert.assertTrue(lobj.learnerbatch3());
		Assert.assertTrue(lobj.learnerbatch4());
		Assert.assertTrue(lobj.learnerbatch5());
		Assert.assertTrue(lobj.learnerbatch6());
		lobj.learnerstatus();
		Assert.assertTrue(lobj.status());
		Assert.assertTrue(lobj.statuscheck());
		lobj.dashboard();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	}
	@Test
	public void TC4()
	{
		formobj=new Learnerformpage(driver);
		formobj.learneraddbutton();
		formobj.invalidsubmition();
		Assert.assertTrue(formobj.invalidname());	
		formobj.enterid("340","stephy");
		formobj.lrnrcourse();
		formobj.lrnrproject();
		formobj.lrnrbatch();
		formobj.lrnrstatus();
		formobj.formsubmit();
		Assert.assertTrue(formobj.formsubmition());
		formobj.formsuccess();
		formobj.uploadfile();
		formobj.csvupload("C:\\Users\\steph\\Downloads\\SampleCSV - Sheet1.csv");
		formobj.csvfilesubmit();
		Assert.assertTrue(formobj.cvsadd());
		formobj.returndashboard();
		formobj.submit();
    	formobj.logouttrainer();
		formobj.placementuname("pofficer","pofficer@123");
		formobj.pofficerlogin();

















		
		

		
	}
		

		
	































		




	
	















		
	}


	

