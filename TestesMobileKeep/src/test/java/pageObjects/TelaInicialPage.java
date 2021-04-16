package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {

	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement botaoGetStart;

	@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
	private MobileElement botaotakeAnote;

	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitle;

	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNote;

	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaovolta;

	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoMenu;

	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement> menus;

	@AndroidFindBy(id = "com.google.android.keep:id/settings_move_checked_items_to_bottom")
	private MobileElement switchAddNewItens;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Teste']")
	private MobileElement notaCriada;
	
	
	public void acionarBotaoGetStarted() {
		botaoGetStart.click();
	}

	public void acionarBotaoTakeANote() {
		botaotakeAnote.click();
	}

	public void informarCampoTitle(String title) {
		campoTitle.clear();
		campoTitle.sendKeys(title);
	}

	public void informarCampoNote(String nota) {
		campoNote.sendKeys(nota);
	}

	public void clicarBotaoVoltar() {
		botaovolta.click();
	}

	public void acionarBotaoMenu() {
		botaoMenu.click();
	}

	public void acionarBotaoSettings() {
		menus.get(6).click();

	}
	
	public void clicarNoSwitch() {
		switchAddNewItens.click();

	}
	
	public void clicarNaNotaCriada() {
		notaCriada.click();

	}
	

}
