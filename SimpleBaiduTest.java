import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SimpleBaiduTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.baidu.com/");
   System.out.println("页面标题是"+driver.getTitle());
   
   WebElement element=driver.findElement(By.cssSelector("#kw"));
   WebElement element1=driver.findElement(By.id("#quickdelete"));
  
   System.out.println("标题属性值"+ element1.getAttribute("title"));
   element.sendKeys("计科专业课程设置");
   element.submit();
   
   
   try {
	Thread.sleep(100000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   driver.quit();
	}
	

}
