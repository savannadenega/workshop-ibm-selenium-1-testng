package utils;

//import interacoes.LoginInteracao;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author SavannaDenega
 *
 */
public class WebDriverInstance {

	protected static WebDriver driver = null;
	protected static String baseUrl = System.getProperty("baseUrl",
			"http://book.theautomatedtester.co.uk/chapter1");
	
	//TODO ver sobre porque usar System.getProperty("baseUrl", ...

	@BeforeClass
	public static void setUp() throws Exception {
		driver = WebDriverFactoryInstance.getInstance().createConfigurationsWebDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get(baseUrl);
	}

//	@AfterClass
//	public static void tearDown() throws Exception {
//		driver.close();
//		driver.quit();
//	}
}