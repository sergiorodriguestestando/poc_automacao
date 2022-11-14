package net.thucydides.showcase.cucumber.steps;

import java.io.IOException;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.PedidoPage;
import net.thucydides.showcase.cucumber.util.LoginArquivo;

public class PedidoVendaSteps {

	PedidoPage pedidoPage;
	LoginArquivo loginArquivo = new LoginArquivo();

	@Dado("^que usuário possa acessar a tela de login do sistema$")
	public void que_usuário_possa_acessar_a_tela_de_login_do_sistema() throws IOException {

		pedidoPage.acessar();
	}

	@Quando("^informar um usuário$")
	public void informar_um_usuário() throws IOException {
		loginArquivo.Ler();
		pedidoPage.digitarUsuario(loginArquivo.getUsuario());
	}

	@Quando("^inserir uma senha$")
	public void inserir_uma_senha() {
		pedidoPage.digitarSenha(loginArquivo.getSenha());
	}
	
	
	@Então("^menu principal é exibido$")
	public void menu_principal_é_exibido() { 
		pedidoPage.clicarBtnEntrar();
		pedidoPage.clicarMenuPrincipal();
	//	pedidoPage.clicarMenuPedido();
		pedidoPage.pesquisarMenu();
	//	pedidoPage.clicarSubMenuPedido();
		pedidoPage.selecionarrSubMenuPedidoEdi();
		pedidoPage.framePedidoEdi();
		pedidoPage.digitarPedidoEdi("39393901");
		pedidoPage.clicarBtnPesquisarPedidoEdi();
		
		boolean valor = pedidoPage.elementoEstaPresente();
		
		if (valor) {
			pedidoPage.clicarRascunho();
		}
	  
	}


	@Quando("^selecionar um novo pedido$")
	public void selecionar_um_novo_pedido() {
		pedidoPage.clicarBotaoNovo();
		pedidoPage.sairFrame();
		pedidoPage.frameS();
	}

	@Quando("^selecionar um cliente$")
	public void selecionar_um_cliente() {
		pedidoPage.clicarLupaPesquisarCliente();
		pedidoPage.digitarCliente("6887668002122");
		pedidoPage.clicarBtnPesquisar();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.buscarElementos();
		pedidoPage.clicarBtnSelecionar();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.tempos();
	}

	@Quando("^selecionar um preco$")
	public void selecionar_um_preco() {
		pedidoPage.clicarListaPreco();
		pedidoPage.tempos();
		pedidoPage.tempos();
		pedidoPage.selecionarPreco();
	}

	@Quando("^selecionar uma condicao de pagamento$")
	public void selecionar_uma_condicao_de_pagamento() {
		pedidoPage.selecionarCondicao();	
		pedidoPage.selecionarMenuItens();
	}

	@Quando("^selecionar um produto$")
	public void selecionar_um_produto() {
		pedidoPage.selecionarProduto(); 
	}

	@Quando("^selecionar uma quantidade$")
	public void selecionar_uma_quantidade() {
		pedidoPage.selecionarQuantidade();
	}

	@Quando("^selecionar o botao salvar$")
	public void selecionar_o_botao_salvar() {
	 
	}

	@Então("^a mensagem de sucesso é exibida$")
	public void a_mensagem_de_sucesso_é_exibida() {
	 
	}

//	@Quando("^selecionar o botão entrar$")
//	public void selecionar_o_botão_entrar() {
//		pedidoPage.clicarBtnEntrar();
//		pedidoPage.clicarMenuPrincipal();
//		pedidoPage.clicarMenuPedido();
//		pedidoPage.clicarSubMenuPedido();
//		pedidoPage.frameP();
//		
//		boolean valor = pedidoPage.elementoEstaPresente();
//		
//		if (valor) {
//			pedidoPage.clicarRascunho();
//		}
		
//		pedidoPage.clicarBotaoNovo();
//		pedidoPage.sairFrame();
//		pedidoPage.frameS();
//		pedidoPage.clicarLupaPesquisarCliente();
//		pedidoPage.digitarCliente("6887668002122");
//		pedidoPage.clicarBtnPesquisar();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.buscarElementos();
//		pedidoPage.clicarBtnSelecionar();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.clicarListaPreco();
//		pedidoPage.tempos();
//		pedidoPage.tempos();
//		pedidoPage.selecionarPreco();
//		pedidoPage.selecionarCondicao();
//		pedidoPage.selecionarMenuItens();
//		pedidoPage.selecionarProduto();
//		pedidoPage.selecionarQuantidade();
	//	pedidoPage.selecionarBtnAtaulizar();				
//	}

//	@Então("^o Menu Principal é exibido$")
//	public void oMenuPrincipalÉExibido() {
//		
//
//	}

}
