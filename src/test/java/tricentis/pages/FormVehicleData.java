package tricentis.pages;

import org.openqa.selenium.WebDriver;

import tricentis.atributes.AtributesVehicleData;
import tricentis.utils.AutomationTool;
import tricentis.utils.Utils;

public class FormVehicleData extends AtributesVehicleData {

	Utils utils = new Utils();
	AutomationTool tool = new AutomationTool();
	WebDriver browser;

	public FormVehicleData(WebDriver driver) {
		this.browser = driver;
	}

	/**
	 * Metodo responsável por abrir o navegador na pagina destino
	 * 
	 * @param driver
	 */
	public void openBrowser() {

		browser.manage().window().maximize();
		browser.get("http://sampleapp.tricentis.com/101/app.php");

	}

	/**
	 * Preencher formulario com dados do veiculo
	 */
	public void formVehicleData() {

		tool.select(browser, selectMake, "BMW");
		tool.select(browser, selectModel, "Motorcycle");
		tool.setText(browser, editCylinderCapacity, "20");
		tool.setText(browser, editEnginePerformance, "300");
		tool.setText(browser, inputDateofManufacture, "11/17/2020");
		tool.select(browser, editNumberofSeats, "2");
		tool.clickAction(browser, inputRightHandDriveyes);
		tool.select(browser, selectNumberofSeatsMotorcycle, "2");
		tool.select(browser, editFuelType, "Petrol");
		tool.setText(browser, editPayLoad, "150");
		tool.setText(browser, editTotalWeight, "200");
		tool.setText(browser, editListPrice, "5000");
		tool.setText(browser, editLicensePlateNumber, "250");
		tool.setText(browser, editAnnualMileage, "600");
		tool.click(browser, buttoNextEnterInsurantData);

	}

}