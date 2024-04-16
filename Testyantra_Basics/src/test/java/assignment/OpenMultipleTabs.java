package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipleTabs {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open Google in the first tab
        driver.get("https://www.google.com");

        // Open a new tab (by sending the keyboard shortcut CTRL + t)
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        
      //switch with the help of actions class 
      //  Actions action = new Actions(driver); action.sendKeys(Keys.CONTROL+"T",Keys.ENTER).perform(); //opening the URL saved. 
       // driver.get(urlToClick);

        // Open Facebook in the second tab
        driver.get("https://www.facebook.com");

        // Optionally, you can navigate between tabs using window handles:
        // String firstTabHandle = driver.getWindowHandles().toArray()[0].toString();
        // String secondTabHandle = driver.getWindowHandles().toArray()[1].toString();
        // driver.switchTo().window(firstTabHandle); // Switch to the first tab
        // driver.switchTo().window(secondTabHandle); // Switch to the second tab

        // Close the browser
      //  driver.quit();
    }
}
