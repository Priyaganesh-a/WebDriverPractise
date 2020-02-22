package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLearning {  

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\ChromeDriver.exe");
		WebDriver a = new ChromeDriver ();
		a.get("http://demo.guru99.com/V4/index.php");
		a.findElement(By.name("uid")).sendKeys("mgr123");
		a.findElement(By.name("password")).sendKeys("mgr!23");
		a.findElement(By.name("btnLogin")).click();
		a.findElement(By.linkText("Log out")).click();
		Thread.sleep(3000);
		a.close();		
	

	}

}
