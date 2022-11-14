package net.thucydides.showcase.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.showcase.cucumber.util.LerArquivo;

public class PedidoPage extends BasePage {

	LerArquivo arquivo = new LerArquivo();

	@FindBy(id = "txtUsuarioNovoLayout")
	WebElementFacade campoUsuario;

	@FindBy(id = "password")
	WebElementFacade campoSenha;

	@FindBy(id = "btnEntrarNovoNL")
	WebElementFacade btnEntrar;

	@FindBy(id = "txtPesquisar")
	WebElementFacade inputPesquisa;
	
	@FindBy(id = "iconeMenuWrapper")
	WebElementFacade menuPrincipal;

	@FindBy(xpath = "//h2[text()='Pedidos']")
	WebElementFacade menuPedido;

	@FindBy(xpath = "//h2[text()='Pedidos']")
	WebElementFacade SubMenuPedido;
	
	@FindBy(xpath = "//h2[text()='Pedidos EDI']")
	WebElementFacade SubMenuPedidoEdi;
	
	@FindBy(id = "ctl00_ctl00_PageContentPlaceHolder_PageContentPlaceHolder_grdLista_DXFREditorcol3_I")
	WebElementFacade inputPedidoEdi;
	
	@FindBy(xpath = "//div[@id='ctl00_ctl00_PageContentPlaceHolder_AvancadoContentPlaceHolder_actPesquisar']")
	WebElementFacade btnPesquisaPedidoEdi;
	
	
	
	@FindBy(xpath = "//input[@id='ctl00_ctl00_PageContentPlaceHolder_AvancadoContentPlaceHolder_cboData_I']")
	WebElementFacade tipoPedido;
	
	@FindBy(id = "ctl00_ctl00_PageContentPlaceHolder_AvancadoContentPlaceHolder_dtpDataInicial_I")
	WebElementFacade dtInicioPedido;
	
	
	
	
	ByXPath listaPedidosEdi = (ByXPath) By.xpath("//td[@style='border-bottom-width:0px;']");

	
	
	//ctl00_ctl00_PageContentPlaceHolder_PageContentPlaceHolder_grdLista_DXFREditorcol3_I

	String framePrincipal = "tab--Consultas-PedidoDeVendaRedirect-aspx";
	String frameSecundario = "tab--Cadastros-PedidoVenda-PedidoRedirect-aspx";
	String framePedidoEdi = "tab--Consultas-EDI-ConsPedidoEDI-aspx";
	
	

	@FindBy(id = "ctl00_ctl00_mbuToolbar_DXI0_")
	WebElementFacade btnNovo;

	@FindBy(id = "lupaCLIENTE")
	WebElementFacade lupaPesquisarClientes;

	@FindBy(id = "txtPesquisaFiltro2")
	WebElementFacade InputPesquisarClientes;

	@FindBy(id = "btnLookup")
	WebElementFacade btnPesquisar;

	ByXPath listaClientes = (ByXPath) By.xpath("//div[@id='divLookupResult']//tbody/tr/td");
	ByXPath racunho = (ByXPath) By.xpath("//div[@id='MsgErro']//a[text()='exclua o rascunho']");

	@FindBy(id = "btnLookupOK")
	WebElementFacade btnSelecionar;

	@FindBy(xpath = "//div[@id='MsgErro']//a[text()='exclua o rascunho']")
	WebElementFacade btnRascunho;

	@FindBy(xpath = "//label[text()='Lista de preço']/../../../..//button")
	WebElementFacade listaPrecos;

	@FindBy(id = "LISTAPRECO")
	WebElementFacade preco;
	
	@FindBy(id = "CONDICAOPAGAMENTO")
	WebElementFacade condicao;
	
	@FindBy(xpath = "//span[text()='Itens']")
	WebElementFacade menuItens;
	
	@FindBy(css  = "input[data-custom-id='PRODUTO']")
	WebElementFacade produto;
	
	@FindBy(css  = "input[data-custom-id='QUANTIDADE']")
	WebElementFacade quantidade;
	
	@FindBy(xpath = "//label[text()='Atualizar pedido']")
	WebElementFacade btnAtualizar;



	public List<WebElement> listaElementos(ByXPath listaClientes2) {
		List<WebElement> results = getDriver().findElements(listaClientes2);
		return results;
	}
	


	public void digitarUsuario(String usuario) {

		// getDriver().switchTo().defaultContent();
		elementoEstaNaPagina(campoUsuario);
		escrever(campoUsuario, usuario);
		// selectedSuburb.click();

	}

	public boolean elementoEstaPresente() {
		return verificaElemento(racunho);

	}

	public void digitarSenha(String senha) {
		escrever(campoSenha, senha);
	}

	public void clicarBtnEntrar() {
		btnEntrar.click();
	}

	public void clicarRascunho() {
		btnRascunho.click();
	}

	public void clicarMenuPrincipal() {
		menuPrincipal.click();
	}
	
	public void pesquisarMenu() {
		escrever(inputPesquisa, "Pedidos EDI");
	}
	
	public void selecionarTipoPedido() {
		tipoPedido.click();
		setaParaBaixo(tipoPedido);
		pressionarEnter(tipoPedido);
	}
	
	public void selecionarDataInicial() {
		dtInicioPedido.click();
	//	escrever(dtInicioPedido, "01/11");
	}


	public void clicarMenuPedido() {
		menuPedido.click();
	}

	public void clicarSubMenuPedido() {
		SubMenuPedido.click();
	}
	
	public void selecionarrSubMenuPedidoEdi() {
		
		clicar(SubMenuPedidoEdi);
	}
	
	public void digitarPedidoEdi(String pedidoEdi) {
		escrever(inputPedidoEdi, pedidoEdi);
		tempos();
		tempos();
	}


	public void clicarBotaoNovo() {
		btnNovo.click();
	}

	public void frameP() {
		entrarFrame(framePrincipal);
	}
	
	public void framePedidoEdi() {
		entrarFrame(framePedidoEdi);
	}

	public void frameS() {
		entrarFrame(frameSecundario);
	}

	public void clicarLupaPesquisarCliente() {
		lupaPesquisarClientes.click();
	}

	public void digitarCliente(String cliente) {
		escrever(InputPesquisarClientes, cliente);
	}

	public void clicarBtnPesquisar() {
		btnPesquisar.click();
	}
	
	public void clicarBtnPesquisarPedidoEdi() {
		btnPesquisaPedidoEdi.click();
	}

	public void buscarElementos() {
		List<WebElement> lista = listaElementos(listaClientes);
		for (WebElement webElement : lista) {
			webElement.click();
		}
	}
	
	
	public String verificarPedidosEdi(String pedido) {
		List<WebElement> lista = listaElementos(listaPedidosEdi);
		String pedidoEdi = "";
		for (WebElement webElement : lista) {
			if(webElement.getText().equals(pedido))
			pedidoEdi = webElement.getText();
		}
		return pedidoEdi;
	}

	public void clicarBtnSelecionar() {
		btnSelecionar.click();
	}

	public void clicarListaPreco() {
		listaPrecos.click();
	}

	public void selecionarPreco() {
		setaParaBaixo(preco);
		pressionarEnter(preco);
	}
	
	public void selecionarCondicao() {
		escrever(condicao, "416");
		tempos();
		tempos();
		setaParaBaixo(condicao);
		pressionarEnter(condicao);
	}
	
	public void selecionarMenuItens() {
		menuItens.click();
	}
	
	public void selecionarProduto() {
		escrever(produto, "11012");
		tempos();
		tempos();
		setaParaBaixo(produto);
		pressionarEnter(produto);
	}
	
	public void selecionarQuantidade() {
		escrever(quantidade, "2");
		tempos();
		tempos();
		setaParaBaixo(quantidade);
		pressionarEnter(quantidade);
	}
	
	public void selecionarBtnAtaulizar() {
		btnAtualizar.click();
	}
	
	
	


}
