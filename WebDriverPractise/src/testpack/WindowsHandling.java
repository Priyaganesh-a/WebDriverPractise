package testpack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		
		// class name is same for 2 different elements hence used onclick attribute
		
		driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		Iterator<String> wIds = winIds.iterator();
		String pWin=wIds.next();
		String cWin1=wIds.next();
		String cWin2=wIds.next();
		
		System.out.println("Parent Window: "+pWin);
		System.out.println("Child Window1: "+cWin1);
		System.out.println("Child Window2: "+cWin2);
		
		//driver.switchTo().window(cWin1);
		
		driver.switchTo().window(cWin2);
		
		System.out.println(driver.getTitle());
		

		
		
		
			driver.quit();
		
		
		

	}

}
