package Day3;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class BasePage {

    protected WebDriver driver;

    public BasePage(){
        driver = Driver.get();
        driver.manage().window().maximize();
    }
}
