package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	Robot robot=new Robot();
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalluchi Tejaswini\\Downloads\\QA\\chromedriver.exe");        
    WebDriver driver = new ChromeDriver(); 


driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

driver.manage().window().maximize();

driver.findElement(By.id("identifierId")).sendKeys(" tejaswiniqa1@gmail.com");
driver.findElement(By.id("identifierNext")).click();

driver.findElement(By.name("password")).sendKeys("tejaswini123");
driver.findElement(By.id("passwordNext")).click();

driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


driver.findElement(By.xpath("//*[contains(text(),'COMPOSE')]")).click();

driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
//*[contains(text(),'COMPOSE')

StringSelection ss=new StringSelection("C:\\Users\\Kalluchi Tejaswini\\Downloads\\Winnie-the-pooh-wikipedia.jpg");

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
/*robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);*/
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
Thread.sleep(5000);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyRelease(KeyEvent.VK_V);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
boolean check =driver.findElement(By.xpath("//*[@id='goog_1993039093']/div[2]/div[2]/div[1]")).isSelected();
System.out.println(check);


}
}