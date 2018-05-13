package testCases;

import org.testng.*;
import org.testng.annotations.Test;
//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverInstance;
import objects.Chapter1Objs;

/**
 * 
 * @author SavannaDenega
 *
 */
public class Chapter1TestCase extends WebDriverInstance {

	Chapter1Objs chapter1Objs = PageFactory.initElements(driver, Chapter1Objs.class);

	//1
	@Test
	public void clickRadioButtonEsquerda() throws InterruptedException {
		//Thread.sleep(1000);
		chapter1Objs.radioButtonEsquerda(driver).click();
	}
	
	
	
	//6
	@Test
	public void clickButtonLoadRedBox() throws InterruptedException {
		Thread.sleep(1000);
		chapter1Objs.buttonLoadRedBox(driver).click();
	}
	
	//7
	@Test
	public void verifyTextRedBox() throws InterruptedException {
		//Thread.sleep(1000);
		String text = chapter1Objs.textRedBox(driver).getText();
		Assert.assertFalse(text.isEmpty());
	}
	
	

}
