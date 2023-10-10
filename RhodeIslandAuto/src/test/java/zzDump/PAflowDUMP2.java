//package flows.test;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import commonScripts.M;
//import customerPortal.CreateAccCP;
//import customerPortal.LoginCP;
//import customerPortal.cpPages.Dashboard;
//import customerPortal.cpPages.Esign;
//import customerPortal.cpPages.HelpPayingForFood;
//import customerPortal.cpPages.HouseholdMember;
//import customerPortal.cpPages.HouseholdProfile;
//import customerPortal.cpPages.HowCanWeHelpYou;
//import customerPortal.cpPages.IncFromOtherSrcs;
//import customerPortal.cpPages.NoEditsScreen;
//import customerPortal.cpPages.Perjury;
//import customerPortal.cpPages.School;
//import customerPortal.cpPages.SelectPrograms;
//import customerPortal.cpPages.SelfEmpDetails;
//import customerPortal.cpPages.SpecialCircumstances;
//import customerPortal.cpPages.YourInfo;
//import customerPortal.cpPages.YourJobInfo;
//import wpPages.LoginPage;
//
//@Listeners(MyListener.class)
//public class PAflowTEST
//{
//	public static boolean codeReuse = false;
//	public static WebElement dropDown;
//	public static Select s;
//	
//	@Test
//	public static void completeFlow() throws InterruptedException, IOException, ClassNotFoundException
//	{
//		cpPart();
////		wpPart();
//	}
//	
//	public static void cpPart() throws InterruptedException, IOException, ClassNotFoundException
//	{
//		M.allInit();
//		
//		new CreateAccCP();
//		
//		LoginCP.login();
//		
//		HowCanWeHelpYou.iKnowNEXT();
//		
//		SelectPrograms.selectSNAP();
//		SelectPrograms.clickNEXT();
//		
//		NoEditsScreen.clickNext1();   // Welcome
//		NoEditsScreen.clickNext();    // Application overview
//		
//		HelpPayingForFood.noHeatingCooling();
//		HelpPayingForFood.notMigrant();
//		HelpPayingForFood.clickNext();
//		HelpPayingForFood.closePopUp();
//		HelpPayingForFood.clickNext();
//		HelpPayingForFood.clickNext();   // ESAP
//		
//		HouseholdProfile.clickNext2();
//		
//		YourInfo.howManyPeople(1);
//		YourInfo.clickNext();
//		YourInfo.genderMale();
//		YourInfo.humanServProgYES();
//		YourInfo.snapYES();
//		YourInfo.clickNext();
//		
//		YourInfo.selectMtdOfCont();
//		YourInfo.enterEmail();
//		YourInfo.enterMailingAdd();
//		YourInfo.enterCity();
//		YourInfo.sameMailingAddNO();
//		YourInfo.enterResAdd();
//		YourInfo.enterResCity();
//		YourInfo.incarceratedNo();
//		YourInfo.UScitizenYES();
//		YourInfo.veteranNO();
//		YourInfo.clickNext2();
//		
//		SpecialCircumstances.help4preminumNO();
//		SpecialCircumstances.help4schoolNO();
//		SpecialCircumstances.clickNext();
//		
//		YourJobInfo.empIncomeYES();
//		YourJobInfo.workAsEmployeeYES();
//		YourJobInfo.clickSearch();
//		YourJobInfo.enterEmployerName();
//		YourJobInfo.enterZipCode();
//		YourJobInfo.searchEmployers();
//		YourJobInfo.selectFirstEmp();
//		YourJobInfo.selectEmpBtn();
//		YourJobInfo.selectPayReciDate();
//		YourJobInfo.fillWage(300);
//		YourJobInfo.selectWageFreq();
//		YourJobInfo.fillHrsWorked(21);
//		YourJobInfo.selfEmpYES();
//		YourJobInfo.typeOfWork();
//		YourJobInfo.selfEmpInc(200);
//		YourJobInfo.selfEmpReciDate();
//		YourJobInfo.clickNext();
//		
//		NoEditsScreen.clickNext5();    // No additional questions
//		NoEditsScreen.clickNext1();   // Application review
//		NoEditsScreen.clickNext4();    // Authorized representative
//		
//		Perjury.acceptTerms();
//		Perjury.clickNext();
//		
//		NoEditsScreen.clickNext();    // Identifying Your authorized representative
//		NoEditsScreen.clickNext();    // Applicant Information
//		NoEditsScreen.clickNext3();    // Application Household Information
//		
//		HouseholdMember.veteranNO();
//		HouseholdMember.selectMaritalStatus();
//		HouseholdMember.migrantNO();
//		HouseholdMember.clickNext();
//		
//		NoEditsScreen.clickNext();    // Household Member Summary
//		
//		School.unknownSchool();
//		School.highestUnknown();
//		School.clickNext();
//		
//		NoEditsScreen.clickNext();    // Household Membership Summary
//		NoEditsScreen.clickNext();    // Job & Income Information
//		NoEditsScreen.clickNext();    // Employment Details
//		
//		SelfEmpDetails.empTypeOTHERS();
//		SelfEmpDetails.selectPayDate();
//		SelfEmpDetails.enterGrossPay(200);
//		SelfEmpDetails.payMtdCASH();
//		SelfEmpDetails.clickNext();
//		
//		NoEditsScreen.clickNext();    // Job income summary
//		
//		IncFromOtherSrcs.SSInoOne();
//		IncFromOtherSrcs.RBnoOne();
//		IncFromOtherSrcs.clickNext();
//		
//		NoEditsScreen.clickNext();    // Other income summary
//		NoEditsScreen.clickNext();    // Housing and Utility expenses
//		NoEditsScreen.clickNext();    // Housing expense summary
//		NoEditsScreen.clickNext();    // Your Other Expenses
//		NoEditsScreen.clickNext();    // Other Expense Summary
//		NoEditsScreen.clickNext();    // Submit Human services application
//		NoEditsScreen.clickNext3();    // Household member final Questions
//		NoEditsScreen.clickNext4();    // Additional Information
//		NoEditsScreen.clickNext4();    // Pre-Application submission
//		
//		Esign.acceptTerms();
//		Esign.fillName();
//		Esign.submit();
//		
//		NoEditsScreen.clickNext4();    // Thank You!
//		
//		Dashboard.getCaseNo();
//		
//		M.endOfFlow();
//	}
//	
//	
//	public static void wpPart() throws IOException
//	{
//		M.allInit();
//		
//		LoginPage.enterCreds("su");
//		LoginPage.clickLogin();
//		
//	}
// 	
//}
