package net.thucydides.showcase.cucumber.steps;

import java.io.IOException;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import net.thucydides.showcase.cucumber.pages.AdmissaoPage;
import net.thucydides.showcase.cucumber.pages.HomePage;

public class RealizarAdmissaoSteps {

	HomePage homePage;
	AdmissaoPage admissaoPage;

	@Dado("^que usuário possa acessar a tela de login do sistema$")
	public void que_usuário_possa_acessar_a_tela_de_login_do_sistema() throws IOException {

		homePage.acessar();
	}

	@Quando("^informar um usuário\"([^\"]*)\"$")
	public void informarUmUsuário(String usuario) throws IOException {

		admissaoPage.digitarUsuario(usuario);
	}

	@Quando("^inserir uma senha \"([^\"]*)\"$")
	public void inserir_uma_senha(String senha) {

		admissaoPage.digitarSenha(senha);
	}

	@Quando("^selecionar o botão entrar$")
	public void selecionar_o_botão_entrar() {
		admissaoPage.clicarBtnEntrar();

	}

	@Então("^o Menu Principal é exibido$")
	public void oMenuPrincipalÉExibido() {
		admissaoPage.clicarMenuPrincipal();

	}

	@Quando("^selecionar Meus Grupos de Cliente$")
	public void selecionar_Meus_Grupos_de_Cliente() {
		admissaoPage.clicarMeusGrupoClientes();
	}

	@Quando("^selecionar o menu Incluir Colaborador$")
	public void selecionarOMenuIncluirColaborador() {
		admissaoPage.clicarMenuIncluirColaborador();
	}

	@Quando("^selecionar botao continuar$")
	public void selecionar_botao_continuar() {
		admissaoPage.clicarBotaoContinuar();
	}

	@Quando("^inserir um empregador$")
	public void inserirUmEmpregador() throws IOException {
		admissaoPage.digitarEmpregador();
	}

	@Quando("^digitar o primeiro nome$")
	public void digitarOPrimeiroNome() {
		admissaoPage.digitarPrimeiroNome();

	}

	@Quando("^digitar sobre Nome$")
	public void digitarSobreNome() {
		admissaoPage.digitarSobreNome();

	}

	@Quando("^selecionar sexo$")
	public void selecionarSexo() {
		admissaoPage.digitarSexo("Masculino");
	}

	@Quando("^inserir Data Nascimento$")
	public void inserirDataNascimento() {
		admissaoPage.digitarDataNascimento();
	}

	@Quando("^selecionar Botao Proxima Continuar$")
	public void selecionar_Botao_Proxima_Continuar() {
		admissaoPage.selecionarBotaoContinuarProx();
	}

	@Quando("^selecionar civil$")
	public void selecionar_civil() {
		admissaoPage.selecionarEstadoCivil();
	}

	@Quando("^testando$")
	public void testando() {

	}

	@Quando("^selecionar o menu Nova Pessoa$")
	public void selecionarOMenuNovaPessoa() {
		admissaoPage.clicarMenuNovaPessoa();
	}

	@Quando("^selecionar o motivo da admissao$")
	public void selecionarOMotivoDaAdmissao() {
		admissaoPage.selecionarMotivoAdmissao();

	}

	@Quando("^inserir numero da pessoa$")
	public void inserirNumeroPessoa() {
		admissaoPage.digitarNumeroPessoa();

	}

	@Quando("^inserir o titulo$")
	public void inserirOTitulo() {
		admissaoPage.digitarTitulo();

	}

	@Quando("^inserir o nome do meio$")
	public void inserirONomeDoMeio() {
		admissaoPage.digitarNomeDoMeio();
	}

	@Quando("^selecionar o botão Adcionar Informações$")
	public void selecionarOBotãoAdcionarInformações() {
		admissaoPage.clicarBtnInformacoesAdcionais();
	}

	@Então("^o usuário digita o país$")
	public void oUsuárioDigitaOPaís() throws InterruptedException {
		admissaoPage.digitarPaises();
	}

	@Então("^escolher um tipo de documentacão$")
	public void escolherUmTipoDeDocumentacão() {
		admissaoPage.digitarTipoDocumentacao();
	}

	@Então("^digitar o numero do tipo da documentacao$")
	public void digitarONumeroDoTipoDaDocumentacao() {
		admissaoPage.digitarNumeroTipoDocumentacao();
	}

	@Então("^o usuario seleciona a proxima pagina$")
	public void oUsuarioSelecionaAProximaPagina() {
		admissaoPage.selecionarProximaPagina();
	}

	@Então("^o usuário confirma a alteração no mesmo cpf$")
	public void oUsuárioConfirmaAAlteraçãoNoMesmoCpf() {
		admissaoPage.selecionarConfirmarAlteracao();
	}

	@Quando("^digitar o primeiro endereco$")
	public void digitarOPrimeiroEndereco() {
		admissaoPage.digitarEndereco1();
	}

	@Quando("^digitar o segundo endereco$")
	public void digitarOSegundoEndereco() {
		admissaoPage.digitarEndereco2();
	}

	@Quando("^digitar a cidade$")
	public void digitarACidade() {
		admissaoPage.digitarCidade();
	}

	@Quando("^digitar o estado$")
	public void digitarOEstado() {
		admissaoPage.digitarEstado();
	}

	@Quando("^digitar o codigo da caixa portal$")
	public void digitarOCodigoDaCaixaPortal() {
		admissaoPage.digitarCodigoPostal();
	}

	@Quando("^selecionar informações adicionais$")
	public void selecionarInformaçõesAdicionais() {
		admissaoPage.selecionarInformacoesAdicionais();
	}

	@Então("^o usuaro deve informar o tipo telefone$")
	public void oUsuaroDeveInformarOTipoTelefone() {
		admissaoPage.digitarTipoTelefone();
	}

	@Então("^digitar o numero$")
	public void digitarONumero() {
		admissaoPage.digitarNumero();
	}

	@Então("^digitar o código do país$")
	public void digitarOCódigoDoPaís() throws InterruptedException {
		admissaoPage.digitarCodigoPais();
	}

	@Então("^clicar no botao proximo$")
	public void clicarNoBotaoProximo() {
		admissaoPage.selecionarBtnProximo();
	}

	@Então("^o usuario seleciona o tipo de admissao$")
	public void oUsuarioSelecionaOTipoDeAdmissao() {
		admissaoPage.digitarTipoAdmissao();
	}

	@Então("^digitar o tipo de indicador de admissao$")
	public void digitarOTipoDeIndicadorDeAdmissao() {
		admissaoPage.digitarTipoIndicadorAdmissao();
	}

	@Então("^digitar regime mão de obra$")
	public void digitarRegimeMãoDeObra() {
		admissaoPage.digitarRegimeMaoDeObra();
	}

	@Então("^digitar seguro social$")
	public void digitarSeguroSocial() {
		admissaoPage.digitarPrevidenciaSocial();

	}

	@Então("^digitar numero de atribuicao$")
	public void digitarNumeroDeAtribuicao() {
		admissaoPage.digitarNumeroAtribuicao();
	}

	@Então("^digitar unidade de negócio$")
	public void digitarUnidadeDeNegócio() {
		admissaoPage.digitarUnidadeNegocio();
	}

	@Quando("^confirmar a posicao$")
	public void confirmar_a_posicao() {
		admissaoPage.confirmarPosicao();
	}

	@Então("^digitar a posicao$")
	public void digitarAPosicao() {
		admissaoPage.digitarPosicao();
	}

	@Então("^o usuário confirma$")
	public void oUsuárioConfirma() {
		admissaoPage.clicarBtnOk();
	}

	@Então("^selecionar tipo de pagamento$")
	public void selecionarTipoDePagamento() {
		admissaoPage.digitarFormaPagamento();

	}

	@Então("^digitar Horas de Trabalho$")
	public void digitarHorasDeTrabalho() {
		admissaoPage.digitarHoraTrabalho();
	}

	@Então("^selecionar a frequencia$")
	public void selecionarAFrequencia() {
		admissaoPage.digitarFrequencia();
	}

	@Quando("^selecionar FTE$")
	public void selecionar_FTE() {
		admissaoPage.digitarFTE();
	}

	@Quando("^selecionar o quadro efetivo$")
	public void selecionar_o_quadro_efetivo() {
		admissaoPage.digitarQuadroEfetivo();
	}

	@Quando("^selecionar o estabelecimento Contribuinte$")
	public void selecionar_o_estabelecimento_Contribuinte() {
		admissaoPage.digitarEstabelecimentoContribuinte();
	}

	@Então("^digitar Categoria de Colaborador$")
	public void digitarCategoriaDeColaborador() {
		admissaoPage.digitarCategoriaColaborador();

	}
	
	@Quando("^pressionar   submeter$")
	public void pressionar_submeter() {
	   	admissaoPage.selecionarSubmeter();
	}



	@Então("^digitar periodo de experiencia$")
	public void digitarPeriodoDeExperiencia() {
		admissaoPage.digitarPeriodoExperiencia();
	}

	@Então("^digitar duracao da experiencia$")
	public void digitarDuracaoDaExperiencia() {
		admissaoPage.digitarDuracaoExperiencia();
	}

	@Então("^usuario seleciona que o colaborador não é membro de sindicato$")
	public void usuarioSelecionaQueOColaboradorNãoÉMembroDeSindicato() {
		admissaoPage.selecionarMembroSindicato();
	}

	@Quando("^selecionar o botão proxímo$")
	public void selecionarOBotãoProxímo() {
		admissaoPage.clicarBtnProximo();
	}

	@Quando("^digitar base salarial$")
	public void digitarBaseSalarial() {
		admissaoPage.digitarBaseSalarial();
	}

	@Quando("^digitar valor salarial$")
	public void digitarValorSalarial() {
		admissaoPage.digitarValorSalarial();
	}

	@Quando("^digitar revisão salarial$")
	public void digitarRevisãoSalarial() {
		admissaoPage.digitarDataRevisaoSalarial();
	}

	@Quando("^seleciona o botão salvar$")
	public void selecionaOBotãoSalvar() {
		admissaoPage.selecionarBtnSalvar();

	}

	@Então("^o usuário realiza a confirmação$")
	public void oUsuárioRealizaAConfirmação() {
		admissaoPage.confirmaMsgSalvar();

	}

	@Quando("^selecionar o botão enviar$")
	public void selecionarOBotãoEnviar() {
		admissaoPage.selecionarBtnEnviar();

	}

	@Então("^o usuário confirma o envio$")
	public void oUsuárioConfirmaOEnvio() {
		admissaoPage.confirmarMsgEnviar();
	}

	@Então("^finaliza a adimissão confirmando o processo$")
	public void finalizaAAdimissãoConfirmandoOProcesso() {
		admissaoPage.clicarBtnOk();
	}

}
