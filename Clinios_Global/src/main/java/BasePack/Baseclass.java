package BasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	@BeforeTest
	public void Open() throws IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\malli\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		
		FileInputStream f = new FileInputStream("C:\\MallikarjunaEclipseData\\Clinios_Global\\src\\test\\data\\mymfile");
		Properties obj = new Properties();
		obj.load(f);
	}

}
