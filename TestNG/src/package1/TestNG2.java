// Multiple test methods (with priority)

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG2 {
	
	@Test(priority = 1)
	public void email()
	{
		System.out.println("himanshu@gmail.com");
	}
	
	@Test(priority = 2)
	public void passwd()
	{
		System.out.println("paSSwOrD");
	}
}

// if no priority is given then the sequence will be decided dictionary sequence
//(based on ascii value of method name)
// The priority is for sequence of @Test only, all these @Test annotations will hold their priority as compared to other annotations
