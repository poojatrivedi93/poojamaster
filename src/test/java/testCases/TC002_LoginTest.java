package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC002_LoginTest extends BaseClass 
{
	WebDriver driver;
	@Test
	public void verify_login()
	{
		try 
		{
			
		// home page
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		//login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			//My account page
			MyAccountPage macc=new MyAccountPage(driver);
			 boolean targetpage=macc.isMyAccountPageExists();
			Assert.assertTrue(targetpage);//Assert.assertEquals(target page,true,"login failed") both are same}
		}
		catch(Exception e)
		{
			Assert.fail();	
			}
				}
		}
	



