package tricentis.atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AtributesInsurantData {

	@FindBy(how = How.ID, using = "firstname")
	public WebElement editFirstName;

	@FindBy(how = How.ID, using = "lastname")
	public WebElement editLastName;

	@FindBy(how = How.ID, using = "birthdate")
	public WebElement inputBirthDate;

	@FindBy(how = How.ID, using = "gendermale")
	public WebElement radioGenderMale;

	@FindBy(how = How.ID, using = "streetaddress")
	public WebElement editStreetAddress;

	@FindBy(how = How.ID, using = "country")
	public WebElement selectCountry;

	@FindBy(how = How.ID, using = "zipcode")
	public WebElement editZipCode;

	@FindBy(how = How.ID, using = "city")
	public WebElement editCity;

	@FindBy(how = How.ID, using = "occupation")
	public WebElement editOccupation;

	@FindBy(how = How.ID, using = "other")
	public WebElement checkOther;

	@FindBy(how = How.ID, using = "website")
	public WebElement editWebSite;

	@FindBy(how = How.ID, using = "open")
	public WebElement buttonOpen;

	@FindBy(how = How.ID, using = "nextenterproductdata")
	public WebElement buttonNextEnterProductData;

}