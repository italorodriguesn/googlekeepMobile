package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class CriarNotaSteps {

	TelaInicialPage telainicial = new TelaInicialPage(driver);
	
	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() throws Exception {
		telainicial.acionarBotaoGetStarted();
		Thread.sleep(8000);
	}

	@Quando("eu acionar o botao takeanote")
	public void euAcionarOBotaoTakeanote() {
		telainicial.acionarBotaoTakeANote();
	}
	
	@Quando("eu informar no campo title {string}")
	public void euInformarNoCampoTitle(String title) {
		telainicial.informarCampoTitle(title);
	}

	@Quando("eu informar no campo note {string}")
	public void euInformarNoCampoNote(String nota) {
		telainicial.informarCampoNote(nota);
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
		telainicial.clicarBotaoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com titulo {string}")
	public void oAplicativoCadastraANotaComTitulo(String title) {
	   assertEquals(title, driver.findElement(By.id("com.google.android.keep:id/index_note_title")).getText());
	}

	@Quando("eu acionar a nota")
	public void euAcionarANota() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    telainicial.clicarNaNotaCriada();
	}
}
