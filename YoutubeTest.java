import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ujwala.daggula\\Documents\\Selenium Automation\\chromedriver\\chromedriver.exe");

        // Initialize a new WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Open YouTube
            driver.get("https://www.youtube.com");

            // Find the search box and enter a query
            WebElement searchBox = driver.findElement(By.name("search_query"));
            searchBox.sendKeys("Selenium WebDriver tutorial");

            // Submit the search form
            searchBox.submit();

            // Wait for the results to load and display the title of the first video
            Thread.sleep(2000); // This is a simple wait. In real tests, use WebDriverWait.

            // Find the first video title
            WebElement firstVideoTitle = driver.findElement(By.xpath("//a[@id='video-title']"));
            System.out.println("First video title: " + firstVideoTitle.getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Ensure the browser is closed
            driver.quit();
        }
    }
}
