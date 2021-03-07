package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tricentis.pages.FormInsurantData;
import tricentis.pages.FormProductData;
import tricentis.pages.FormVehicleData;
import tricentis.pages.SelectingPrice;
import tricentis.pages.SendQuote;
import tricentis.utils.Utils;

public class StepsDefinitions {

	Utils util = new Utils();
	WebDriver driver = util.setBrowser();
	
	FormVehicleData formularioVeiculo = PageFactory.initElements(driver, FormVehicleData.class);
	FormInsurantData formularioSeguro = PageFactory.initElements(driver, FormInsurantData.class);
	FormProductData formularioProduto = PageFactory.initElements(driver, FormProductData.class);
	SelectingPrice selectingPrice = PageFactory.initElements(driver, SelectingPrice.class);
	SendQuote sendQuote = PageFactory.initElements(driver, SendQuote.class);
	
	@Given("eu acesse o site do formulario")
	public void eu_acesse_o_site_do_formulario() {

		formularioVeiculo.openBrowser();

	}

	@When("preencher o formulario das infos do veiculos")
	public void preencher_o_formulario_das_infos_do_veiculos() {

		formularioVeiculo.formVehicleData();

	}

	@And("preencher o formulario do seguro")
	public void preencher_o_formulario_do_seguro() throws Exception {

		formularioSeguro.formInsurantData();
	}

	@And("preencher infos do produto")
	public void preencher_infos_do_produto() {

		formularioProduto.formProdutcData();
		
	}

	@And("selecionar um valor")
	public void selecionar_um_valor() {
		
		selectingPrice.selectingPrice();

	}

	@Then("conseguirei enviar o pedido de cotacao")
	public void conseguirei_enviar_o_pedido_de_cotacao() {

		sendQuote.sendQuote();
		
	}

}
