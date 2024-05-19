package mypackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SelenimEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//@SuppressWarnings("unused");
		WebDriver driver=new ChromeDriver();//open the browser
		
		driver.manage().window().maximize();//maximize the windows
		driver.get("http://facebook.com");  //open google automatically
	}

}
