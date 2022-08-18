package Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.practice.cybertek-school.com");

        WebElement flash = driver.findElement(By.id("flash-messages"));
        System.out.println("flash.getTagName() = " + flash.getTagName());


        WebElement name = driver.findElement(By.name("viewport"));
        System.out.println("name.getTagName() = " + name.getTagName());

        WebElement className = driver.findElement(By.className("hly"));
        System.out.println("className.getTagName() = " + className.getTagName());

        List<WebElement> listGroupItem = driver.findElements(By.className("list-group-item"));
        System.out.println("listGroupItem.size() = " + listGroupItem.size());

        WebElement tagName = driver.findElement(By.tagName("h1"));
        System.out.println("tagName.getTagName() = " + tagName.getTagName());

        WebElement linkText = driver.findElement(By.linkText("Home"));
        System.out.println("linkText.getTagName() = " + linkText.getTagName());
        System.out.println("linkText.getText() = " + linkText.getText());

        WebElement partialLinkText = driver.findElement(By.linkText("me"));
        System.out.println("partialLinkText.getTagName() = " + partialLinkText.getTagName());
        System.out.println("partialLinkText.getText() = " + partialLinkText.getText());

        WebElement css1 = driver.findElement(By.cssSelector("[class = 'container']"));
        //For class
        WebElement css2 = driver.findElement(By.cssSelector("div.row"));
        //For id
        WebElement css3 = driver.findElement(By.cssSelector("div#flash-messages"));
        WebElement css4 = driver.findElement(By.cssSelector("#flash-messages"));
        WebElement css5 = driver.findElement(By.cssSelector("#flash-messages"));

        //div.sc--cSHVUG.PrSjA>div>ul>li>a[target = '_blank'] --> parent to child
        //div.example>h4
        //select#$idValue>option:nth-of-type($text) or select#state>option:nth-of-type($index)

        WebElement state = driver.findElement(By.cssSelector("select#state>option:nth-of-type(Arkansas)"));
        System.out.println("state.getText() = " + state.getText());

        List<WebElement> stateList = driver.findElements(By.cssSelector("select#state>option"));

        //contains -> tagName[attribute* = 'value']
        //starts-with --> tagName[attribute^= 'value']
        //ends-with --> tagName[attribute$ = 'value']






    }
}
