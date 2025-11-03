package utilsLayer;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	ThreadLocal<WebDriver> ts= new ThreadLocal<WebDriver>();
	
	private DriverManager()
	{
		
	}
		
}
