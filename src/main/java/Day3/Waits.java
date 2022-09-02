package Day3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits extends BasePage{
    @Before
    public void init(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
    }
    @After
    public void quit(){

        driver.quit();

    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(6000);
        WebElement title = driver.findElement(By.xpath("//div[@id=\"finish\"]/ h4"));
        System.out.println(title.getText());
    }

    @Test
    public void test2(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement title = driver.findElement(By.xpath("//div[@id=\"finish\"]/ h4"));
        System.out.println(title.getText());
    }

    @Test
    public void test3(){
        WebDriverWait wait = new WebDriverWait(driver,15);
//        WebElement title = driver.findElement(By.xpath("//div[@id=\"finish\"]/ h4"));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id=\"finish\"]/ h4")));
//        System.out.println(title.getText());

    }

}
