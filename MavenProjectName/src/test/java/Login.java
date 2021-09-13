import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;// null

	@Test
	public void launchBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
//		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		Thread.sleep(2000);

	}

}
