package selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.command.CommandAction;
import selenium.search_elements.SearchElement;


public abstract class Page {

	static final Logger logger = Logger.getLogger(Page.class);

	protected WebDriver webDriver;
	protected CommandAction command;
	protected SearchElement searchElement;
	protected WebDriverWait webDriverWait;

	/**
	 * Default options to Page Objects
	 * 
	 * @param webDriver
	 * @param command
	 * @param searchElement
	 */
	public Page(WebDriver webDriver, CommandAction command, SearchElement searchElement) {
		this.webDriver = webDriver;
		this.webDriverWait = new WebDriverWait(webDriver, 30);
		this.command = command;
		this.searchElement = searchElement;
	}

	public byte[] takeScreenshot() throws Exception {
		return command.screenshot();
	}
}
