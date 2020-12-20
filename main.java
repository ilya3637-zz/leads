import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        functions.auth_check(driver);
        functions.fio_check(driver);
        functions.bd_check(driver);
        functions.icq_tg_check(driver);
        functions.skype_check(driver);
        driver.close();

    }


}
