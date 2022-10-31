package net.thucydides.showcase.cucumber.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.showcase.cucumber.util.LerArquivo;

public class HomePage extends BasePage {

	LerArquivo arquivo = new LerArquivo();

	@FindBy(id = "userid")
	WebElementFacade campoUsuario;

	@FindBy(id = "password")
	WebElementFacade campoSenha;

	@FindBy(id = "btnActive")
	WebElementFacade btnEntrar;

	@FindBy(xpath = "//div[@class='user-login']/p/span/strong")
	WebElementFacade autenticacao;

	@FindBy(xpath = "//form//p")
	WebElementFacade erroLogin;

	public void digitarUsuario(String usuario) {
		elementoEstaNaPagina(campoUsuario);
		escrever(campoUsuario, usuario);

	}

	public void digitarSenha(String senha) {

		escrever(campoSenha, senha);

	}

	public void clicarBtnEntrar() {
		btnEntrar.click();
	}

	public String mensagemSucesso() {
		String texto = obterTexto(autenticacao);
		return texto;
	}

	public String mensagemErrologin() {
		String texto = erroLogin.getText();
		return texto;
	}

}
