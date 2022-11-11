package net.thucydides.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.Select;

import groovyjarjarantlr.collections.List;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePage extends PageObject {

	// private final String url =
	// "https://hdkd-dev2.login.us6.oraclecloud.com/oam/server/obrareq.cgi?encquery%3DYRUsAnzy0Rfc8z9SvVAorSoE2k5fDxgLzFaI0TJfV0YZVYcWthIf6LDc7N7ldSqnARBOW2%2FoYS55IzgLRfIdB1Sw7Hs0xp6BhzMi3Zegzvmyk2oGGaNwo%2BXL7eRp7Z%2B2bq2rDlY7NU2wTUyz82wPdAiCD8KYmA27bW6ctjD3j9J%2BC8Ono4rEQhs0Vy%2FWo3wOFqhraP1MNZ9VrpLUn6N1GdvkqghS2cGshs6AFjcu3b82YHe0z1z%2BS%2FwVX1Bhc5Plj%2FN4WaGx70pkoZA9%2FRS%2BoMV%2B6rP2EVONtx1MjY6tz9u6q61M%2FLwRA%2BrQWNdzXgNKQ%2Bjmecv7QLoOaaZyPOgMdS9xEFbMV%2FvzhYj%2BbYxeYzf21FvqvcrVWFbHsD9ZJMIoYyjj7VgpqJDzdESvVObJiUAokxfcyT94W1V9IgKR1KkTW17Mm7OrTpGZ3BP9QKjh%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2%26cksum%3De551337a70c5c3ae3e1c4ddbff984c12c770bc6c&ECID-Context=1.005dfDXBz8k5i%5EE_R5%5EAyd0005EP0002xF%3BkXhgv0ZCLILIGVAPnJPRLPJBXKQP1LSTcLQRoPROXKTQjUO";

	private final String url = "https://mercanetwebdev2.mdb.com.br/MercanetWeb/";
	public WebElementFacade webElement;

	int tempo = 2000;

	int rapido = 1000;
	int medio = 2000;
	int lento = 3000;

	public void acessar() {
		getDriver().get(url);

	}
	
	public void entrarFrame(String frame) {
		getDriver().switchTo().frame(frame);
	}
	
	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void escrever(WebElementFacade webElementFacade, String texto) {
		try {
			Thread.sleep(rapido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElementFacade.sendKeys(texto);
	}

	public WebElementFacade Aguaradando(WebElementFacade webElementFacade) {
		try {
			Thread.sleep(tempo);
			System.out.println("Elemento : " + webElementFacade.getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return withTimeoutOf(20, TimeUnit.SECONDS).waitFor(webElementFacade);
	}

	public void escreverCompassado(WebElementFacade webElementFacade, String texto) throws InterruptedException {
		Thread.sleep(rapido);
		webElementFacade.clear();
		for (int i = 0; i < texto.length(); i++) {
			String letra = String.valueOf(texto.charAt(i));
			Thread.sleep(rapido);
			Thread.sleep(rapido);
			webElementFacade.sendKeys(letra);
			Thread.sleep(rapido);

		}
		
		

	}
	public void tempos() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pressionarEnter(WebElementFacade webElementFacade) {
		try {
			Thread.sleep(rapido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webElementFacade.sendKeys(Keys.ENTER);
	}

	public void clicar(WebElementFacade webElementFacade) {
		try {
			Thread.sleep(rapido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementoEstaNaPagina(webElementFacade);
		elementoEstaVisivel(webElementFacade);
		webElementFacade.click();
	}
	
	
	public boolean verificaElemento (ByXPath racunho){
		
		try {
			String text = getDriver().findElement(racunho).getText();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public void apagarCampo(WebElementFacade webElementFacade) {
		webElementFacade.clear();
	}

	public String obterTexto(WebElementFacade webElement) {

		return webElement.getText();
	}

	// ------------------esperas--------------------------------------
	public boolean elementoEstaVisivel(WebElementFacade webElementFacade) {
		try {
			Thread.sleep(rapido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return webElementFacade.isVisible();

	}

	public WebElementFacade elementoEstaNaPagina(WebElementFacade webElementFacade) {
		try {
			Thread.sleep(rapido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return webElementFacade.waitUntilVisible();

	}
	

	
	




	public void aguardar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean elementoEstaPresente(WebElementFacade webElementFacade) {
		try {
			Thread.sleep(rapido);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return webElementFacade.isPresent();

	}

	// --------------------Click------------------------------------------------
	public void clicarRadio(WebElementFacade webbElement) {
		webbElement.click();
	}

	public void clicarLink(WebElementFacade webbElement) {
		webbElement.click();
	}

	public void clicarBotaok(WebElementFacade webbElement) {
		webbElement.click();
	}

	public void setaParaBaixo(WebElementFacade webbElement) {
		try {
			Thread.sleep(rapido);
			String multiSelect = Keys.chord(Keys.SHIFT, Keys.DOWN);
			webbElement.sendKeys(multiSelect);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// -----------------Combo---------------------------------------------

	public void selecionarCombo(WebElementFacade webbElement, String texto) {
		Select combo = new Select(webbElement);
		combo.selectByVisibleText(texto);

	}

	public void rolagemParaBaixo() {

		evaluateJavascript("scrollBy(0,250)", "");

	}

	public void rolagemParaCima() {

		evaluateJavascript("scrollBy(0,-250)", "");

	}

}