package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHandlingusingActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		//Actions act = new Actions(driver);
		
		//act.moveToElement(driver.findElement(By.linkText("More"))).perform();
		
		driver.findElement(By.linkText("More")).click();
		
		
		
		
		
		
			
		
		
		List<WebElement> Options= driver.findElements(By.tagName("a"));
		

		System.out.println(Options.size());
		


		

	}

}
