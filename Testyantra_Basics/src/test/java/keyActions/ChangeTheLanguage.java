package keyActions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangeTheLanguage
{
	public static void main(String[] args) 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--lang=tel"); //for telugu
		opt.addArguments("lang=kn"); //for kannada
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.com/");
		
		//using globalization testing here we are changing the language
		
	}

}

