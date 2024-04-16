package keyActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com",Keys.CONTROL+"AC"); 
		//mean ctrl+A select all content then ctrl+C copy content that's why we write 'AC'
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"V");
		// ctrl+V  paste the content
		driver.findElement(By.id("confirmPassword")).sendKeys(Keys.CONTROL+"V",Keys.ENTER);
		
	
	}
}
