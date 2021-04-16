package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class InteragirComSwitchSteps {

	TelaInicialPage telainicial = new TelaInicialPage(driver);
	
	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
	    telainicial.acionarBotaoMenu();
	}

	@Quando("eu acionar a aba settings")
	public void euAcionarAAbaSettings() {
	    telainicial.acionarBotaoSettings();
	}

	@Quando("eu tocar no switch")
	public void euTocarNoSwitch() {
		telainicial.clicarNoSwitch();
	}

	@Entao("o switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
	    assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
        System.out.println("imprime: "+ driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	}
	
}
