package workerPortal.wpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonScripts.M;

public class Homepage 
{
	public static void enterCaseOrAppNum(String caseOrAppNum)
	{
		M.driver.findElement(By.id("caseOrApplicationNumber")).sendKeys(caseOrAppNum);
	}
	
	public static void selectAction(String mode)
	{
		// intake, casechange, addmember, redetermination, reinstatecase...
		
		WebElement dropDown = M.driver.findElement(By.id("homePageCaseAction"));
		dropDown.click();
		Select s = new Select(dropDown);
		mode = mode.replace(" ", "").toLowerCase();
		
		switch(mode)
		{
		case "intake":
			s.selectByVisibleText("Intake");
			break;
		case "casechange":
			s.selectByVisibleText("Case change");
			break;
		case "redetermination":
			s.selectByVisibleText("Redetermination");
			break;
		case "reinstatecase":
			s.selectByVisibleText("Reinstate case");
			break;
		default:
			System.out.println("|~|Case mode keyword should be an exact match|~|");
		}
	}
	
	public static void clickGo()
	{
		M.driver.findElement(By.id("go2")).click();
	}
}
