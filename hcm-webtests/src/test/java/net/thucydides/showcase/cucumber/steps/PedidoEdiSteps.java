package net.thucydides.showcase.cucumber.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.PedidoPage;
import net.thucydides.showcase.cucumber.util.LoginArquivo;

public class PedidoEdiSteps {

	PedidoPage pedidoPage;
	LoginArquivo loginArquivo = new LoginArquivo();
	String pedidoEdi = "950";

	@Quando("^pesquisar por um pedido edi$")
	public void pesquisar_por_um_pedido_edi() {
		pedidoPage.clicarBtnEntrar();
		pedidoPage.clicarMenuPrincipal();
		pedidoPage.pesquisarMenu();
		pedidoPage.selecionarrSubMenuPedidoEdi();
	}

	@Então("^o pedido é exibido$")
	public void o_pedido_é_exibido() {
		pedidoPage.framePedidoEdi();
		pedidoPage.selecionarDataInicial();
		pedidoPage.selecionarTipoPedido();
		pedidoPage.clicarBtnPesquisarPedidoEdi();
		pedidoPage.digitarPedidoEdi(pedidoEdi);
		Assert.assertEquals(pedidoPage.verificarPedidosEdi(pedidoEdi), pedidoEdi);
	}

}
