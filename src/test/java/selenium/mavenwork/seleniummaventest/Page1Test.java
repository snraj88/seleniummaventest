package selenium.mavenwork.seleniummaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Page1Test {

	@BeforeClass
	public void setUp()
	{
		
	}
	
	@Test
	public void testHere()
	{
		
		 // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","f:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
	/*	DesiredCapabilities dc=DesiredCapabilities.firefox();
		FirefoxProfile profile = new FirefoxProfile();
		dc.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver =  new FirefoxDriver(dc); */
		
		
    	
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    
	}
	
	@AfterClass
	public void cleanUp()
	{
		
	}
}
