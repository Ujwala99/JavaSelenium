import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ujwala.daggula\\Documents\\Selenium Automation\\chromedriver\\chromedriver.exe");

        // Initialize a new WebDriver instance
        WebDriver driver = new ChromeDriver();

            // Open a website
            driver.get("https://www.google.com");

            // Perform actions on the website
            System.out.println("Title:Hellooooo " + driver.getTitle());
        try {
            // Pause execution for 1000 milliseconds
            Thread.sleep(5000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        } 
        
            // Ensure the browser is closed
            driver.quit();
        
    }
}
