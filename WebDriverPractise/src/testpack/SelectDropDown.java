package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//label[@class='ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		
		
		Thread.sleep(3000);
		driver.close();
	
		
				


	}

}
