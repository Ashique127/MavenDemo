import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class User {
	public static WebDriver driver;

	@Test(priority = 1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 2)
	public void launchApplication() {
		driver.get("https://www.edureka.co/");
		Assert.assertEquals("Instructor-Led Online Training with 24X7 Lifetime Support | Edureka", driver.getTitle());

	}

	@Test(priority = 3)
	public void closeBrowsr() {
		driver.close();

	}
}