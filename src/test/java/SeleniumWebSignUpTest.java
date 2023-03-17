import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SeleniumWebSignUpTest {
    private WebDriver driver;

    @Test
    public void start() throws InterruptedException {
        // locate the chromeDriver
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //1. open browser
        driver = new ChromeDriver();

        //2. Input the selenium web page url
        driver.get("https://selenium-blog.herokuapp.com/");
        //to make sure the page loads, wait some secs
        sleep(5000);

        //3. maximise the page
        driver.manage().window().maximize();
        sleep(5000);

        //4. Click on the Signup button
        /* short notes on types of locator on the inspect page
            1. id : using unique id to locate
            2. name : using unique to locate element
            3. Xpath : locate a section
         */
        //locate the sigup section from the inspect page and copy the xpath

        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        sleep(5000);

        //5. get the username id from the signup page and enter username
        driver.findElement(By.id("user_username")).sendKeys("fade12345");
        sleep(5000);

        //6. get  the email id using inspect and enter the email address
        driver.findElement(By.id("user_email")).sendKeys("fadegboye59@gmail.com");
        sleep(5000);

        //7. get the password id using inspect and enter password
        driver.findElement(By.id("user_password")).sendKeys("admin");
        sleep(5000);

        //8. Click on the signup button
        driver.findElement(By.id("submit")).click();
        sleep(5000);

        //9. click on the user 1 item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        sleep(5000);

        //10. Search for the item( python with selenium) if it is present
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/a")).click();
        sleep(5000);

        //11. log out
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();


    }
    @AfterTest
    public void closeBrowser()
    {
        //quit browser
        driver.quit();
    }
}
