package Day2;

import net.bytebuddy.asm.*;
import org.junit.*;
import org.openqa.selenium.*;
import utilities.Driver;

public class Methods {

    @Test
    public void clickMethod(){
        Driver.get().get("http://practice.cybertekschool.com/");
        WebElement fistClick = Driver.get().findElement(By.xpath("//a[@href=\"/abtest\"]"));
        fistClick.click();
        System.out.println(Driver.get().getCurrentUrl());
    }

    @Test
    public void clickCheckBox(){
        Driver.get().get("http://practice.cybertekschool.com/checkboxes");
        Driver.get().findElement(By.xpath("//span[text()=\"Checkbox 1\"]")).click();

    }

    @Test
    public void sendKeys(){
        Driver.get().get("https://www.google.com");
        WebElement searchBar = Driver.get().findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
        searchBar.sendKeys("bike");
        searchBar.sendKeys(Keys.ENTER);
    }
}
