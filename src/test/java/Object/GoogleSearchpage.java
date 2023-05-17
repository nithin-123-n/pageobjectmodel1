package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	
	WebDriver driver;
	
	public GoogleSearchpage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbox = By.id("APjFqb");
	
	public void searchgoogle(String Searchinput)
	{
		driver.findElement(searchbox).sendKeys(Searchinput);
	}
}
	