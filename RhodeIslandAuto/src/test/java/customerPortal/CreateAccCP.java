package customerPortal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonScripts.*;
import customerPortal.cpPages.CreateAccount;
import customerPortal.cpPages.Homepage;
import customerPortal.cpPages.LoginOrCreateAcc;

@Test
public class CreateAccCP
{
	public static boolean codeReuse = false;
	
	public CreateAccCP() throws InterruptedException, IOException
	{
		Homepage.gotoLoginPage();
		LoginOrCreateAcc.clickCreateAcc();
		
		LoginOrCreateAcc.dontCheckExisting();
		
		CreateAccount.fillNameAdd();
		CreateAccount.fillCity();
		CreateAccount.fillSSN();
//		CreateAccount.fillSSNwithSS();////////
		CreateAccount.fillDOB();
		
		CreateAccount.clickSubmit();
		Thread.sleep(1800);
		CreateAccount.clickSubmit();
		
		CreateAccount.fillSecQue();
		CreateAccount.fillSecAns();
		CreateAccount.fillUserPass();
		CreateAccount.tickTnC();
		
		CreateAccount.clickNext();
	}
}
