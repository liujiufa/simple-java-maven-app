import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleBaiduTestTest {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMain() {
		 System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.baidu.com/");
		   WebElement element1=driver.findElement(By.id("#quickdelete"));
		   WebElement element=driver.findElement(By.cssSelector("#kw"));
		   assertEquals( element1.getAttribute("title"),"���",null);
		   assertEquals( driver.getTitle(),"�ٶ�һ�£����֪��",null);
		   assertEquals( element.getText(),"");
		   
	}

}
