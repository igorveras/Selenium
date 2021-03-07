package tricentis.atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AtributesSendQuote {

	@FindBy(how = How.ID, using = "email")
	public WebElement editEmail;
	
	@FindBy(how = How.ID, using = "phone")
	public WebElement editPhone;
	
	@FindBy(how = How.ID, using = "username")
	public WebElement editUsername;
	
	@FindBy(how = How.ID, using = "password")
	public WebElement editPassword;
	
	@FindBy(how = How.ID, using = "confirmpassword")
	public WebElement editConfirmPassword;
	
	@FindBy(how = How.ID, using = "Comments")
	public WebElement textareaComments;
	
	@FindBy(how = How.ID, using = "sendemail")
	public WebElement buttonSendEmail;
	
	@FindBy(how = How.ID, using = "LoadingPDF")
	public WebElement loadLoadingPDF;
	
	@FindBy(how = How.CLASS_NAME, using = "confirm")
	public WebElement buttonConfirm;
	
	@FindBy(how = How.XPATH, using = "//*[@class='sweet-alert showSweetAlert visible']/h2")
	public WebElement messageSuccess;
	
}