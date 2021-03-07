package tricentis.pages;

import org.openqa.selenium.WebDriver;

import tricentis.atributes.AtributesSendQuote;
import tricentis.utils.AutomationTool;
import tricentis.utils.Utils;

public class SendQuote extends AtributesSendQuote {

	Utils utils = new Utils();
	AutomationTool tool = new AutomationTool();
	WebDriver browser;

	public SendQuote(WebDriver driver) {
		this.browser = driver;
	}

	/**
	 * Metodo responsavel por preencher o formulario de envio de cotacao
	 */
	public void sendQuote() {

		tool.setText(browser, editEmail, "automation@teste.com");
		tool.setText(browser, editPhone, "987654321");
		tool.setText(browser, editUsername, "Automation");
		tool.setText(browser, editPassword, "AutomationTest@123");
		tool.setText(browser, editConfirmPassword, "AutomationTest@123");
		tool.setText(browser, textareaComments, "Automation made by Igor Veras");
		tool.click(browser, buttonSendEmail);
		tool.loading(browser, loadLoadingPDF);
		tool.getText(browser, messageSuccess, "Sending e-mail success!");
		tool.clickAction(browser, buttonConfirm);
		browser.quit();
		
	}

}