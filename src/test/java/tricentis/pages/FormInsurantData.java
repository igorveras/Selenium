package tricentis.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import tricentis.atributes.AtributesInsurantData;
import tricentis.utils.AutomationTool;
import tricentis.utils.Utils;

public class FormInsurantData extends AtributesInsurantData {

	Utils utils = new Utils();
	AutomationTool tool = new AutomationTool();
	WebDriver browser;

	public FormInsurantData(WebDriver driver) {
		this.browser = driver;
	}

	/**
	 * Metodo responsavel por preencher o formulario de seguro
	 * 
	 * @throws AWTException
	 * @throws Exception
	 */
	public void formInsurantData() throws Exception {

		String filePath = "C:\\drivers\\selenium.png";
		StringSelection stringSelection = new StringSelection(filePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Robot robot = new Robot();

		tool.setText(browser, editFirstName, "Automation");
		tool.setText(browser, editLastName, "Test");
		tool.setText(browser, inputBirthDate, "08/05/1992");
		tool.clickAction(browser, radioGenderMale);
		tool.setText(browser, editStreetAddress, "Automation street");
		tool.select(browser, selectCountry, "Brazil");
		tool.setText(browser, editZipCode, "00000");
		tool.setText(browser, editCity, "Sao Paulo");
		tool.select(browser, editOccupation, "Employee");
		tool.clickAction(browser, checkOther);
		tool.setText(browser, editWebSite, "http://teste.com");
		tool.click(browser, buttonOpen);

		// UPLOAD DO ARQUIVO
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		tool.click(browser, buttonNextEnterProductData);

	}

}