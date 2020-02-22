package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {

	public static void main(String[] args) {
	
	int j = 1;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://junit.org/junit5/docs/current/api/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Concatenation is performed to split the string and do increment operation
		
		while(driver.findElements(By.xpath("//*[@id='i"+j+"']/th/a")).size()==1)
			
			
		{
			//get text can be used only with find element and not with find elements
		
		System.out.println(driver.findElement(By.xpath("//*[@id='i"+j+"']/th/a")).getText());
		j++;
		

	}
driver.close();
}
}