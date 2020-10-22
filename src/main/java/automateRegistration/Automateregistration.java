package automateRegistration;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automateregistration {

    public void automateWithValidData()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebElement logo= driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/ul/li[1]/a"));

        driver.get("https://scratch.mit.edu/");
        //Assert.assertTrue();

        driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/ul/li[7]/a/span")).click();
        driver.findElement(By.id("username")).sendKeys("varunan16");
        driver.findElement(By.id("password")).sendKeys("code123");
        driver.findElement(By.id("passwordConfirm")).sendKeys("code123");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[2]/button/div")).click();
        //new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[2]/div/div[2]"))).selectByVisibleText("8");
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United Kingdom");
        country.selectByIndex(2);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[3]/button")).click();
        new Select(driver.findElement(By.id("birth_month"))).selectByValue("10");
        new Select(driver.findElement(By.id("birth_year"))).selectByValue("2016");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[3]/button")).click();
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[1]/div/div[4]"));
        radio1.click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[2]/button")).click();
        driver.findElement(By.id("email")).sendKeys("ramadas.jothi@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[3]/button/div")).click();
        //String expectedMessage="Registered Successfully";
        //String actualMessage="Registered Failed";

    }
    public static void main(String[] args) {
        Automateregistration autoobj=new Automateregistration();
        autoobj.automateWithValidData();

    }
}
