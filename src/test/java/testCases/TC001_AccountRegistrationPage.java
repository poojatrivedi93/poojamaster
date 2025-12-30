package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC001_AccountRegistrationPage extends BaseClass
{

@Test
public void verify_account_registration() throws InterruptedException
{
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	hp.clickRegister();
	AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
	regpage.setFirstName(randomString().toUpperCase());
	regpage.setLastName(randomString().toUpperCase());
	regpage.setEmail(randomString()+"@gmail.com");
	regpage.setTelephone(randomNumber());
	//Save password and conform password to a single variable 
	String password =randomAlphaNumeric();
	regpage.setPassword(password);
	regpage.setConformPassworf(password);
	regpage.setPrivacyPolicy();
	regpage.clickContinue();
	Thread.sleep(2000);
	 String confmsg=regpage.getConformationMsg();
	 Assert.assertEquals(confmsg,"Your Account Has Been Created!");
}












}
