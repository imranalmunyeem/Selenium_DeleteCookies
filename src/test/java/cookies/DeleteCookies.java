package cookies;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import base_class.DriverSetup;




public class DeleteCookies extends DriverSetup {
	@Test
	public void DeleteCookiesInSelenium() throws IOException {
		// TODO Auto-generated method stub

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
			//Delete Specific
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
			//login page- verify login url
			
			
			driver.get("http://celtabroad.com");
			
	}
	}
