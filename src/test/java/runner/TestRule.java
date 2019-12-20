package runner;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import selenium.platform.ChromePlatform;
import selenium.platform.Platform;
import utils.PropertiesUtil;

public class TestRule {
	private static WebDriver webDriver;

	@Before
	public void iniciate() {
		Platform correios = ChromePlatform.StartWebDriver();
		webDriver = correios.getLocalWebDriver();
		webDriver.navigate().to(PropertiesUtil.getProp("uri"));
	}

	@After
	public static void teardown() throws InterruptedException {
		webDriver.close();
		webDriver.quit();
	}

	public static WebDriver getDriver() {
		return webDriver;
	}
}