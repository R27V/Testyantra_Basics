package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Close7thWindow {
    public static void main(String[] args) {
        
//        // Create a new instance of the Chrome driver
//        WebDriver driver = new ChromeDriver();
//
//        // Set implicit wait time to handle any synchronization issues
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // Open 10 windows
//        for (int i = 0; i < 10; i++) {
//        	driver.navigate().to("https://www.aveda.de");
//          //  driver.get("https://www.aveda.de");
//            driver.manage().window().maximize();
//        }
//
//        // Get the handles of all the windows
//        ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
//
//        // Close the 7th window
//        if (windowHandles.size() >= 7) {
//            String seventhWindowHandle = windowHandles.get(6); // Index is 6 for the 7th window
//            driver.switchTo().window(seventhWindowHandle);
//            driver.close();
//        } else {
//            System.out.println("There are less than 7 windows open.");
//        }
//
//        // Close the remaining windows
//        for (String handle : windowHandles) {
//            driver.switchTo().window(handle);
//            driver.close();
//        }
//
//        // Quit the driver
//        driver.quit();
    	
    	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for(int i = 1 ; i <= 9 ; i++) {
			driver.switchTo().newWindow(WindowType.WINDOW);
			if(i==6) {
				driver.get("https://www.facebook.com/signup");
			}
		}
		Set<String> allWids = driver.getWindowHandles();
		for(String wid : allWids) {
			String title = driver.switchTo().window(wid).getTitle();
			if(title.contains("Sign up for Facebook"))
				break;
		}
		driver.close();
	
    }
}

