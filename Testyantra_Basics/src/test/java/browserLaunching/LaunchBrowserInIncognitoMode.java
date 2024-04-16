package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserInIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}
}
