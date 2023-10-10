package zzDump;

public class PAflowDUMP
{
	//	M.driver.findElement(By.xpath("xxxBLOCKERxxx")).click();////////////BLOCKER////////////////////
	public static void p2_selectProg()
	{
//		M.driver.findElement(By.xpath("//label[@for='snapReq']")).click();
//		M.driver.findElement(By.id("submitAction")).click();
		
		// 'Welcome' skip
//		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		
		// 'Application overview' skip
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
	}
	
	public static void p3_helpPayingForFood() throws InterruptedException
	{
		// heating / cooling - No
//		M.driver.findElement(By.xpath("//label[@for='heatUtilityExpenses_N']")).click();
		
		// Seasonal worker - No
//		M.driver.findElement(By.xpath("//label[@for='seasonalFarmWorker_N']")).click();
		
		// ! Next
//		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
		
		// pop up - close (didn't answer all questions)
//		Thread.sleep(1000);
//		M.driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		
		// Pressing same Next again
//		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
		
		// 'House Hold profile' page - Next
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
			
	}
	
	public static void p4_yourInfo() throws InterruptedException
	{
		// !! Page -- Household Profile / Personal and Financial information
//		if(M.env.equals("sitmt"))
//			M.driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div/div/a")).click();
			
		// Total no. of people
//		M.driver.findElement(By.id("householdSize")).sendKeys("1");
		// Next
//		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		
		
		// Gender
//		M.driver.findElement(By.xpath("//label[@for='gender1MALE']")).click();
		// Radio buttons (all YES) (human services, SNAP)
//		M.driver.findElements(By.xpath("//label[contains(text(),'Yes')]")).get(0).click();
//		M.driver.findElements(By.xpath("//label[contains(text(),'Yes')]")).get(1).click();
		// Next
//		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		
		
		// Drop down - Method of contact
//		dropDown = M.driver.findElement(By.id("preferredMethodContact"));
//		dropDown.click();
//		s = new Select(dropDown);
//		s.selectByIndex(1);     // index 1 - email
		// Text field - Entering email
//		M.driver.findElement(By.id("email")).sendKeys(M.randString(7) + "@gmail.com");
		// Radio button - Mailing address is same
//		M.driver.findElement(By.xpath("//label[@for='isMailingAndHomeAddressSameYES']")).click();
		// Currently reincarnated - No
//		M.driver.findElement(By.xpath("//label[@for='isIncarceratedNO']")).click();
		// US citizen - Yes
//		M.driver.findElement(By.xpath("//label[@for='isUSCitizenYES']")).click();
		// Veteran - No
//		M.driver.findElement(By.xpath("//label[@for='honourablyDischargedNO']")).click();
		// disabilities  not on this page in SITMT
		// also SITMT has to fill addresses too on this page
		
//		if(M.env.equals("sitmt"))
//		{
//			// address
//			M.driver.findElement(By.id("mailingAddressLineOne")).sendKeys(M.randString(5));
//			// city
//			WebElement city = M.driver.findElement(By.id("mailingCity"));
//			city.sendKeys("Providence");
//			Thread.sleep(2000);
//			M.driver.findElement(By.xpath("//ul/li/a[text()='PROVIDENCE - 02901']")).click();
//			
//		}
		// Next
//		M.driver.findElement(By.id("saveContactAndPersonalInfo")).click();
		
		
		
//		DISABILITIES - No no
//		if(!M.env.equals("sitmt"))
//		{
//			M.driver.findElement(By.xpath("//label[@for='isHelpNeededForPayingMedicarePremiumsNO']")).click();
//			M.driver.findElement(By.xpath("//label[@for='isDisabilityRestrictedGoingToWorkOrSchoolNO']")).click();
//		}
//		// Next
//		if(M.env.equals("sitmt"))
//			M.driver.findElement(By.id("saveContactAndPersonalInfo")).click();
//		else
//			M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	}
	
	public static void p5_yourInfoJobAndIncome() throws InterruptedException
	{
//		Current Job and Income
		// 1st Radio - Employment income - Yes
//		M.driver.findElement(By.xpath("//label[@for='isEmployedquestionYES']")).click();
//		// 1.1 Radio - Works as employee? - Yes
//		M.driver.findElement(By.xpath("//label[@for='empSectionIdYES']")).click();
//		// Button - Search Employer
//		M.driver.findElement(By.xpath("//div[@id='employer-information']//button[contains(text(),'Search')]")).click();
//		Thread.sleep(1000);
//		
//		// POP UP - Select employer :
//		// Fields - Employer name, zip
//		M.driver.findElement(By.id("employerNameSearch")).sendKeys("tyu");
//		M.driver.findElement(By.id("zip")).sendKeys("02901");
//		// Button - Search
//		M.driver.findElement(By.id("searchPopupBtn")).click();
//		Thread.sleep(5000);  // waiting for the list to generate
//		// Radio - Selecting 1st employer
//		M.driver.findElements(By.xpath("//table//input")).get(0).click();
//		// Button - Select employer
//		M.driver.findElement(By.xpath("//a[contains(text(),'Select Employer')]")).click();
//		Thread.sleep(2500);
		
		// Calendar - Pay receive date - Selecting 1st date of month
//		M.driver.findElements(By.xpath("//*[@id='employer-information']//img")).get(0).click();
//		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
//		// ! Field - Wage
//		M.driver.findElement(By.xpath("//div[contains(@class,'empWagesCalc')]//input[contains(@id,'wagesTips')]")).sendKeys("300");
//		// ! Drop down - Wage Frequency
//		dropDown = M.driver.findElement(By.xpath("//select[contains(@id,'wagesFrequency')]"));
//		dropDown.click();
//		s = new Select(dropDown);
//		s.selectByVisibleText("Monthly");
//		// ! Field - Hours worked
//		M.driver.findElement(By.xpath("//input[contains(@id,'averageHoursNew')]")).sendKeys("21");
//		
//		// SELF EMPLOYMENT INCOME ::
//		// Radio - Yes
//		M.driver.findElement(By.xpath("//label[@for='isSelfEmployedYES']")).click();
//		// Field - Type of work
//		M.driver.findElement(By.xpath("//input[contains(@id,'typeOfWork')]")).sendKeys("Others");
//		// Field - Self employment Net income
//		M.driver.findElement(By.xpath("//input[contains(@id,'netIncome')]")).sendKeys("200");
//		// Calendar - Pay receive start date - 1st
//		M.driver.findElements(By.xpath("//*[@id='selfEmpSec']//img")).get(0).click();
//		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
//		// Next
//		M.driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	}
	
	public static void p6_nextPerjuryNext()
	{
		// Next (No additional questions)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Application review)
//		M.driver.findElement(By.id("applicationReviewForm_Redirect")).click();
		// Next (Authorized representative)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
		// Penalties for Perjury :
		// Check box
//		M.driver.findElement(By.xpath("//label[@for='fraudAffidavitAcceptance']")).click();
//		// ! Next
//		M.driver.findElements(By.xpath("//*[@id='mainContent']//a[contains(text(),'Next')]")).get(0).click();
//		
		// Next (Identifying Your authorized representative)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
//		// Next (Applicant Information)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// ! Next (Applicant Household Information)
//		M.driver.findElements(By.xpath("//*[@id='mainContent']//a[contains(text(),'Next')]")).get(0).click();
	}
	
	public static void p7_householdMember()
	{
//		// Household member :
//		// Radios - Veteran info - No no
//		M.driver.findElement(By.xpath("//label[@for='spouseOfDeceasedVeteran_N']")).click();
//		M.driver.findElement(By.xpath("//label[@for='childOfDeceasedVeteran_N']")).click();
//		// Drop down - Marital status
//		dropDown = M.driver.findElement(By.id("maritalStatus"));
//		dropDown.click();
//		s = new Select(dropDown);
//		s.selectByVisibleText("Single-Never Married");
//		// Radio - Migrant, Seasonal worker - No no
//		M.driver.findElement(By.xpath("//label[@for='migrantWorker_N']")).click();
//		M.driver.findElement(By.xpath("//label[@for='migrantFarmWorker_N']")).click();
//		// Next
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
		// Next (Household member summary)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
	public static void p8_school()
	{
		// School enrollment Details :
//		// Radio - In school ? - Unknown
//		M.driver.findElement(By.xpath("//label[@for='schoolTime_UK']")).click();
//		// Drop down - Highest grade complete in school
//		dropDown = M.driver.findElement(By.id("highestGradeInSchool"));
//		dropDown.click();
//		s = new Select(dropDown);
//		s.selectByVisibleText("Unknown");
//		// Next
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
		// Next (Household membership summary)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Job & income information)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Employment details)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
	public static void p9_selfEmpAgain_etc()
	{
		// Self employment details :
		// Drop down - type - others
//		dropDown = M.driver.findElement(By.id("selfEmploymentType_typeCd"));
//		dropDown.click();
//		s = new Select(dropDown);
//		s.selectByVisibleText("Other Self Employment");
//		// Calendar - Pay date - 1st
//		M.driver.findElement(By.xpath("//*[@id='pay-detailsSection']//img")).click();
//		M.driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
//		// Field - Gross pay period amount
//		M.driver.findElement(By.xpath("//input[contains(@id,'payDetails_GrossAmount')]")).sendKeys("200");
//		// Drop down - Payment method
//		dropDown = M.driver.findElement(By.xpath("//select[contains(@id,'payDetails_PayMethod')]"));
//		dropDown.click();
//		s = new Select(dropDown);
//		s.selectByVisibleText("Cash/Check");
//		// Next
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
		// Next (Job income summary)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		
//		// Income from other sources :
//		// Check boxes - No one - x2
//		M.driver.findElement(By.xpath("//label[@for='NoOne_SS']")).click();
//		M.driver.findElement(By.xpath("//label[@for='NoOne_RB']")).click();
//		// Next
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	}
	
	public static void p10_summaries()
	{
		// Next (Other income summary)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Housing and Utility expenses)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Housing expense summary)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Your Other Expenses)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Other Expense Summary)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Submit Human services application)
//		M.driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		// Next (Household member final Questions)
//		M.driver.findElements(By.xpath("//*[@id='mainContent']//a[contains(text(),'Next')]")).get(0).click();
		// ! Next (Additional Information)
//		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
		// ! Next (Pre-Application submission)
//		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
	}
	
	public static void p11_eSignAndCaseNo() throws InterruptedException
	{
//		// Final Application Submission (E-sign) :
//		// Check box
//		M.driver.findElement(By.xpath("//label[@for='primaryApplicantElectronicSignature_Response']")).click();
//		// Fields - f name, l name
//		M.driver.findElement(By.id("primaryApplicantElectronicSignature_firstName")).sendKeys(M.randString(6));
//		M.driver.findElement(By.id("primaryApplicantElectronicSignature_lastName")).sendKeys(M.randString(6));
//		// Submit
//		M.driver.findElement(By.xpath("//*[@id='maindiv']//a[contains(text(),'SUBMIT')]")).click();
		
		// Next (Thank You)
//		M.driver.findElements(By.xpath("//a[contains(text(),'Next')]")).get(0).click();
		
		// DASHBOARD - Getting case no. :
//		Thread.sleep(9000);
//		String caseNo = M.driver.findElement(By.xpath("//div[contains(text(),'#')]")).getText();
//		caseNo = caseNo.substring(1, caseNo.length());
//		M.dataMap.put("caseNo", caseNo);
//		System.out.println(caseNo);
	}
}
