import ExcelReader.ExcelLibrary;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    @Test
    public  void loginWithUserName() throws InterruptedException {



        ExcelLibrary excel = new ExcelLibrary("src/main/resources/data.xls");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/");

        LoginPage login = new LoginPage(driver);

        login.enterText(excel.GetCellValue(0, 1));

        login.clickButton();




        Thread.sleep(5000);

        driver.close();
    }
}