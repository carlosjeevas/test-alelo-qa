package selenium.platform;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromePlatform extends AbstractBrowserPlatform {

	final static Logger logger = Logger.getLogger(ChromePlatform.class);

	private static String OS;
	private static String GETBINARYPATH;

	public static ChromePlatform StartWebDriver() {
		return new ChromePlatform();
	}

	public ChromePlatform() {
		OS = System.getProperty("os.name").toLowerCase();

		GETBINARYPATH = "src/test/resources/chromeDriver/chromedriver.exe";
	}

	@Override
	public WebDriver getLocalWebDriver() {

		if (OS.toLowerCase().contains("windows")) {
			try {
				logger.info("Fechado instancias do Chrome");
				Process process = Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
				for (int i = 0; i < 10; i++) {
					if (process.isAlive()) {
						Thread.sleep(1000);
					}
				}
				process.destroy();

				process = Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
				for (int t = 0; t < 10; t++) {
					if (process.isAlive()) {
						Thread.sleep(1000);
					}

				}

			} catch (Exception e) {
				logger.fatal("Erro ao finalizar driver do Chrome");
			}

		}

		logger.info("Inciando o Chrome local");
		String currentPath = "";
		try {
			currentPath = new java.io.File(".").getCanonicalPath() + "/downloads";
		} catch (IOException e) {
			logger.error("Erro ao acessar o diretorio de Download", e);
		}

		System.setProperty("webdriver.chrome.driver", GETBINARYPATH);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("download.default_directory=" + currentPath);

		String profileChrome;
		if (OS.contains("windows")) {
			profileChrome = System.getProperty("user.home") + "\\AppData\\Local\\Google\\Chrome\\User Data";
		} else {
			profileChrome = System.getProperty("user.home");
		}

		chromeOptions.addArguments("--user-data-dir=" + profileChrome);
		chromeOptions.addArguments("--no-sandbox");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.manage().window().maximize();

		return webDriver;
	}

	@Override
	public WebDriver getRemoteWebDriver(String host, int port) {
		logger.info("Starting Chrome Remote WebDriver");

		return super.getRemoteWebDriver(host, port);
	}

	@Override
	protected DesiredCapabilities getDesiredCapabilities() {
		return null;
	}

	@Override
	public void cleanUpResources() {
	}
}