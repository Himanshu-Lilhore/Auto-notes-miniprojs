package flows.SITN;

import java.io.IOException;
import java.lang.invoke.MethodHandles;

import org.testng.annotations.Test;

import commonScripts.M;
import customerPortal.CreateAccCP;
import customerPortal.LoginCP;
import customerPortal.cpPages.Dashboard;
import customerPortal.cpPages.Esign;
import customerPortal.cpPages.HelpPayingForFood;
import customerPortal.cpPages.HouseholdMember;
import customerPortal.cpPages.HouseholdProfile;
import customerPortal.cpPages.HowCanWeHelpYou;
import customerPortal.cpPages.IncFromOtherSrcs;
import customerPortal.cpPages.NoEditsScreen;
import customerPortal.cpPages.Perjury;
import customerPortal.cpPages.School;
import customerPortal.cpPages.SelectPrograms;
import customerPortal.cpPages.SelfEmpDetails;
import customerPortal.cpPages.SpecialCircumstances;
import customerPortal.cpPages.YourInfo;
import customerPortal.cpPages.YourJobInfo;


public class PAflowSITN
{
	@Test
	public static void completeFlow() throws InterruptedException, IOException
	{
		setEnv();
		M.allInit();
		
		cpPart();
		wpPart();
		
		M.endOfFlow();
	}
	
	public static void cpPart() throws InterruptedException, IOException
	{
		M.allInit();
		
		new CreateAccCP();
		
		LoginCP.login();
		
		HowCanWeHelpYou.iKnowNEXT();
		
		SelectPrograms.selectSNAP();
		SelectPrograms.clickNEXT();
		
		NoEditsScreen.NEXT();   // Welcome
		NoEditsScreen.NEXT();    // Application overview
		
		HelpPayingForFood.noHeatingCooling();
		HelpPayingForFood.notMigrant();
		HelpPayingForFood.clickNext();
		HelpPayingForFood.closePopUp();
		HelpPayingForFood.clickNext();
		HelpPayingForFood.clickNext();   // ESAP
		
		HouseholdProfile.clickNext2();
		
		YourInfo.howManyPeople(1);
		YourInfo.clickNext();
		YourInfo.genderMale();
		YourInfo.humanServProgYES();
		YourInfo.snapYES();
		YourInfo.clickNext();
		
		YourInfo.selectMtdOfCont();
		YourInfo.enterEmail();
		YourInfo.enterMailingAdd();
		YourInfo.enterMailCity("Providence", "02901", 4000);
		YourInfo.sameMailingAddNO();
		YourInfo.enterResAdd();
		YourInfo.enterResCity("Providence", "02902", 4000);
		YourInfo.incarceratedNo();
		YourInfo.UScitizenYES();
		YourInfo.veteranNO();
		YourInfo.clickNext2();
		
		SpecialCircumstances.help4preminumNO();
		SpecialCircumstances.help4schoolNO();
		SpecialCircumstances.clickNext();
		
		YourJobInfo.empIncomeYES();
		YourJobInfo.workAsEmployeeYES();
		YourJobInfo.clickSearch();
		YourJobInfo.enterEmployerName();
		YourJobInfo.enterZipCode();
		YourJobInfo.searchEmployers();
		YourJobInfo.selectFirstEmp();
		YourJobInfo.selectEmpBtn();
		YourJobInfo.selectPayReciDate();
		YourJobInfo.fillWage(300);
		YourJobInfo.selectWageFreq();
		YourJobInfo.fillHrsWorked(21);
		YourJobInfo.selfEmpYES();
		YourJobInfo.typeOfWork();
		YourJobInfo.selfEmpInc(200);
		YourJobInfo.selfEmpReciDate();
		YourJobInfo.clickNext();
		
		NoEditsScreen.NEXT();    // No additional questions
		NoEditsScreen.NEXT();   // Application review
		NoEditsScreen.NEXT();    // Authorized representative
		
		Perjury.acceptTerms();
		Perjury.clickNext();
		
		NoEditsScreen.NEXT();    // Identifying Your authorized representative
		NoEditsScreen.NEXT();    // Applicant Information
		NoEditsScreen.NEXT();    // Application Household Information
		
		HouseholdMember.veteranNO();
		HouseholdMember.selectMaritalStatus();
		HouseholdMember.migrantNO();
		HouseholdMember.clickNext();
		
		NoEditsScreen.NEXT();    // Household Member Summary
		
		School.unknownSchool();
		School.highestUnknown();
		School.clickNext();
		
		NoEditsScreen.NEXT();    // Household Membership Summary
		NoEditsScreen.NEXT();    // Job & Income Information
		NoEditsScreen.NEXT();    // Employment Details
		
		SelfEmpDetails.empTypeOTHERS();
		SelfEmpDetails.selectPayDate();
		SelfEmpDetails.enterGrossPay(200);
		SelfEmpDetails.payMtdCASH();
		SelfEmpDetails.clickNext();
		
		NoEditsScreen.NEXT();    // Job income summary
		
		IncFromOtherSrcs.SSInoOne();
		IncFromOtherSrcs.RBnoOne();
		IncFromOtherSrcs.clickNext();
		
		NoEditsScreen.NEXT();    // Other income summary
		NoEditsScreen.NEXT();    // Housing and Utility expenses
		NoEditsScreen.NEXT();    // Housing expense summary
		NoEditsScreen.NEXT();    // Your Other Expenses
		NoEditsScreen.NEXT();    // Other Expense Summary
		NoEditsScreen.NEXT();    // Submit Human services application
		NoEditsScreen.NEXT();    // Household member final Questions
		NoEditsScreen.NEXT();    // Additional Information
		NoEditsScreen.NEXT();    // Pre-Application submission
		
		Esign.acceptTerms();
		Esign.fillName();
		Esign.submit();
		
		NoEditsScreen.NEXT(30000);    // Thank You!
		
		Dashboard.getCaseNo(10000);
		
		M.endOfFlow();
	}
	
	public static void wpPart()
	{
		
	}
	
	public static void setEnv()
	{
		String thisClassName = MethodHandles.lookup().lookupClass().toString();
		System.out.println(thisClassName);
		M.env = thisClassName.split(" ")[1].split("\\.")[1].toLowerCase();
		System.out.println(M.env);
	}
}
