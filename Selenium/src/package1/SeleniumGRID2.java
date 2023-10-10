package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGRID2
{
	@Test
	public void display2() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM_NAME, "Windows 10");
		cap.setCapability(CapabilityType.BROWSER_NAME, "MicrosoftEdge");
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://10.143.207.15:4444"), cap);
		
		driver.get("https://www.airindia.in/");
		
		Thread.sleep(4000);
		driver.quit();
	}

}
