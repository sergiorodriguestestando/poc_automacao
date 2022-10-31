package net.thucydides.showcase.cucumber.pages;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.showcase.cucumber.util.LerArquivo;

public class AdmissaoPage extends BasePage {

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

	@FindBy(xpath = "//a[@title='Página Inicial']/../a[@id='pt1:_UIShome']")
	WebElementFacade menuPrincipal;

	@FindBy(xpath = "//a[text()='Meus Grupos de Clientes']")
	WebElementFacade meusGruposClientes;

	@FindBy(xpath = "//a[1][text()='Admitir um Colaborador' and @quickactioncategory='grp_mcg_new_person']")
	WebElementFacade menuIncluirColaborador;

	@FindBy(xpath = "//span[text()='Continuar']")
	WebElementFacade botaoContinuar;

	@FindBy(xpath = "//label[text()='Empregador Legal' and @class='af_panelLabelAndMessage_label-text']/../..//input")
	WebElementFacade empregador;

	@FindBy(xpath = "//label[text()='Nome']/../..//input")
	WebElementFacade primeiroNome;

	@FindBy(xpath = "//label[.='Nome do Meio']/../..//td/input")
	WebElementFacade nomeDoMeio;

	@FindBy(xpath = "//label[text()='Estado Civil']/../..//span/input")
	WebElementFacade estadoCivil;

	// --------------------------------------------------------
	@FindBy(xpath = "//a[.='Nova Pessoa']")
	WebElementFacade menuNovaPessoa;

	@FindBy(xpath = "//img[@title='Tarefas']")
	WebElementFacade menuTarefas;

	@FindBy(xpath = "//label[.='Motivo da Admissão']/../../td//input[@role='combobox']")
	WebElementFacade motivoAdmissao;

	@FindBy(xpath = "//label[.='Número da Pessoa']/../..//td/input")
	WebElementFacade numeroPessoa;

	@FindBy(xpath = "//label[.='Título']/../..//input[@role='combobox']")
	WebElementFacade titulo;

	@FindBy(xpath = "//label[text()='Sobrenome']/../..//input")
	WebElementFacade sobreNome;

	@FindBy(xpath = "//label[text()='Sexo']/../..//input")
	WebElementFacade sexo;

	@FindBy(xpath = "//label[text()='Data de Nascimento']/../..//input")
	WebElementFacade dataNascimento;

	@FindBy(xpath = "//*[contains(span,'Con')]")
	WebElementFacade linkContinuar;

	@FindBy(xpath = "//button[@title='Continuar']")
	WebElementFacade btnProxContinuar;

	@FindBy(xpath = "//span[text()='S']")
	WebElementFacade btnConfirmarPosicao;

	@FindBy(xpath = "//img[@title='Adicionar Linha']")
	WebElementFacade btnInformacoesAdcionais;

	@FindBy(xpath = "//input[@value='Brasil']")
	WebElementFacade países;

	@FindBy(xpath = "//span[text()='Tipo de ID Nacional']/../../../../../../../../../../..//input[@role='combobox' and @class='x2h']/..//a")
	WebElementFacade tipoDocumentacao;

	@FindBy(xpath = "//li[text()='RG']")
	WebElementFacade tipoRG;

	@FindBy(xpath = "//input[@value='Brasil']/../../../../../td[6]/span//input")
	WebElementFacade numeroTipoDocumentacao;

	@FindBy(xpath = "//span[.='Próximo']")
	WebElementFacade proximaPagina;

	@FindBy(xpath = "//button[text()='Continuar']")
	WebElementFacade confirmarAlteracao;

	@FindBy(xpath = "//label[.='Linha 1 do Endereço']/../..//td/input")
	WebElementFacade endereco1;

	@FindBy(xpath = "//label[.='Linha 2 do Endereço']/../..//td/input")
	WebElementFacade endereco2;

	@FindBy(xpath = "//label[.='Cidade']/../..//td/input")
	WebElementFacade cidade;

	@FindBy(xpath = "//label[.='Estado']/../..//td/input")
	WebElementFacade estado;

	@FindBy(xpath = "//label[.='Código Postal']/../..//td/input")
	WebElementFacade postal;

	@FindBy(xpath = "//img[@title='Adicionar Linha']")
	WebElementFacade informacoesAdicionais;

	@FindBy(xpath = "//label[.='Tipo']/.././/input")
	WebElementFacade tipoTelefone;

	@FindBy(xpath = "//label[.='Código do País']/../..//input")
	WebElementFacade codigoPais;

	@FindBy(xpath = "//span[.='Próximo']")
	WebElementFacade btnProximo;

	@FindBy(xpath = "//label[.='Tipo de Admissão']/../..//input")
	WebElementFacade tipoAdmissao;

	@FindBy(xpath = "//label[.='Número']/../..//input")
	WebElementFacade numero;

	@FindBy(xpath = "//label[.='Indicador de Admissão']/../..//input")
	WebElementFacade indicarAdmissao;

	@FindBy(xpath = "//label[text()='Regime de Mão de Obra']/../..//input")
	WebElementFacade regimeMaoObra;

	@FindBy(xpath = "//label[.='Regime de Previdência Social']/../..//input")
	WebElementFacade seguroSocial;

	@FindBy(xpath = "//label[.='Número de Atribuição']/../..//input")
	WebElementFacade numeroAtribuicao;

	@FindBy(xpath = "//label[text()='Unidade de Negócio']/../..//input")
	WebElementFacade unidadeNegocio;

	@FindBy(xpath = "//label[text()='Posição']/../..//input")
	WebElementFacade posicao;

	@FindBy(xpath = "//label[.='Pagamento por Hora ou Mensal']/../..//input")
	WebElementFacade formaPagamento;

	@FindBy(xpath = "//label[.='Horas de Trabalho']/..//input")
	WebElementFacade horasTrabalho;

	@FindBy(xpath = "//label[text()='Frequência']/../..//span//input")
	WebElementFacade frequencia;

	@FindBy(xpath = "//label[text()='FTE']/../..//input")
	WebElementFacade fte;

	@FindBy(xpath = "//label[text()='FTE']/../..//input")
	WebElementFacade QuadroEfetivo;

	@FindBy(xpath = "//label[text()='Estabelecimento Contribuinte']/../..//span//input")
	WebElementFacade contribuinte;

	@FindBy(xpath = "//button[@accesskey='K']")
	WebElementFacade btnOK;

	@FindBy(xpath = "//label[text()='Categoria do Colaborador']/../..//span//input")
	WebElementFacade categoriaColaborador;

	@FindBy(xpath = "//span[text()='Sub']")
	WebElementFacade btnSubmeter;

	@FindBy(xpath = "//label[.='Período de Experiência']/../input")
	WebElementFacade periodoExperiencia;

	@FindBy(xpath = "//label[.='Período de Experiência']/../..//input/..//a")
	WebElementFacade duracaoExperiencia;

	@FindBy(xpath = "//label[.='Membro de Sindicato']/../..//input")
	WebElementFacade membroSindicato;

	@FindBy(xpath = "//label[.='Base Salarial']/../input")
	WebElementFacade baseSalarial;

	@FindBy(xpath = "//label[.='Valor do Salário']/../input")
	WebElementFacade valorSalarial;

	@FindBy(xpath = "//label[.='Data da Próxima Revisão Salarial']/../..//input")
	WebElementFacade dataRevisaoSalarial;

	@FindBy(xpath = "//span[.='Salvar']")
	WebElementFacade btnSalvar;

	@FindBy(xpath = "//button[text()='O']")
	WebElementFacade msgConfirmacaoSalvar;

	@FindBy(xpath = "//a[.='Enviar']")
	WebElementFacade btnEnviar;

	@FindBy(xpath = "//button[text()='im']")
	WebElementFacade msgConfirmarEnviar;

	

	public void digitarUsuario(String usuario) {
		clicar(campoUsuario);
		escrever(campoUsuario, usuario);

	}

	public void digitarSenha(String senha) {
		clicar(campoSenha);
		escrever(campoSenha, senha);

	}

	public void clicarBtnEntrar() {
		clicar(btnEntrar);
	}

	public void clicarMenuPrincipal() {
		elementoEstaPresente(menuPrincipal);
		elementoEstaVisivel(menuPrincipal);
		elementoEstaNaPagina(menuPrincipal);
		menuPrincipal.click();
	}

	public void clicarMeusGrupoClientes() {
		elementoEstaPresente(meusGruposClientes);
		elementoEstaVisivel(meusGruposClientes);
		elementoEstaNaPagina(meusGruposClientes);
		meusGruposClientes.click();
	}

	public void clicarMenuNovaPessoa() {
		elementoEstaPresente(menuNovaPessoa);
		elementoEstaVisivel(menuNovaPessoa);
		elementoEstaNaPagina(menuNovaPessoa);
		
	}

	public void clicarMenuIncluirColaborador() {
		elementoEstaPresente(menuIncluirColaborador);
		elementoEstaVisivel(menuIncluirColaborador);
		elementoEstaNaPagina(menuIncluirColaborador);
		menuIncluirColaborador.click();
	}

	public void clicarBotaoContinuar() {
		elementoEstaPresente(linkContinuar);
		elementoEstaVisivel(linkContinuar);
		elementoEstaNaPagina(linkContinuar);
		linkContinuar.click();
	}

	public void selecionarMotivoAdmissao() {
		elementoEstaPresente(motivoAdmissao);
		elementoEstaVisivel(motivoAdmissao);
		elementoEstaNaPagina(motivoAdmissao);
		clicar(motivoAdmissao);
		setaParaBaixo(motivoAdmissao);
		setaParaBaixo(motivoAdmissao);
		pressionarEnter(motivoAdmissao);

	}

	public void digitarEmpregador() throws IOException {
		elementoEstaPresente(empregador);
		elementoEstaVisivel(empregador);
		elementoEstaNaPagina(empregador);
		arquivo.Ler();
		escrever(empregador, arquivo.getEmpregador());
		setaParaBaixo(empregador);
		pressionarEnter(empregador);

	}

	public void digitarNumeroPessoa() {
		elementoEstaPresente(numeroPessoa);
		elementoEstaVisivel(numeroPessoa);
		elementoEstaNaPagina(numeroPessoa);
		escrever(numeroPessoa, "" + arquivo.numeroQualquer());
	}

	public void digitarTitulo() {
		elementoEstaPresente(titulo);
		elementoEstaVisivel(titulo);
		elementoEstaNaPagina(titulo);
		clicar(titulo);
		setaParaBaixo(titulo);
		setaParaBaixo(titulo);
		setaParaBaixo(titulo);
		setaParaBaixo(titulo);
		pressionarEnter(titulo);
	}

	public void digitarPrimeiroNome() {
		elementoEstaPresente(primeiroNome);
		elementoEstaVisivel(primeiroNome);
		elementoEstaNaPagina(primeiroNome);
		escrever(primeiroNome, "" + arquivo.numeroQualquer() + arquivo.getNome());
	}

	public void digitarNomeDoMeio() {
		elementoEstaPresente(nomeDoMeio);
		elementoEstaVisivel(nomeDoMeio);
		elementoEstaNaPagina(nomeDoMeio);
		escrever(nomeDoMeio, "" + arquivo.numeroQualquer() + "nomeDoMeio" + arquivo.getNome());
	}

	public void digitarSobreNome() {
		elementoEstaNaPagina(sobreNome);
		escrever(sobreNome, "" + arquivo.numeroQualquer() + "sobreNome" + arquivo.getSobreNome());
	}

	public void digitarSexo(String texto) {
		elementoEstaPresente(sexo);
		elementoEstaVisivel(sexo);
		elementoEstaNaPagina(sexo);
		escrever(sexo, texto);
		clicar(sexo);
		setaParaBaixo(sexo);
		pressionarEnter(sexo);

	}

	public void digitarDataNascimento() {
		elementoEstaPresente(dataNascimento);
		elementoEstaVisivel(dataNascimento);
		elementoEstaNaPagina(dataNascimento);
		escrever(dataNascimento, "01/01/1980");
	}

	public void selecionarBotaoContinuarProx() {
		elementoEstaPresente(btnProxContinuar);
		elementoEstaVisivel(btnProxContinuar);
		elementoEstaNaPagina(btnProxContinuar);
		clicar(btnProxContinuar);
		;
	}

	public void selecionarEstadoCivil() {
		elementoEstaPresente(estadoCivil);
		elementoEstaVisivel(estadoCivil);
		elementoEstaNaPagina(estadoCivil);
		clicar(estadoCivil);
		setaParaBaixo(estadoCivil);
		pressionarEnter(estadoCivil);

	}

	public void clicarBtnInformacoesAdcionais() {
		elementoEstaNaPagina(btnInformacoesAdcionais);
		clicar(btnInformacoesAdcionais);
		rolagemParaBaixo();

	}

	public void digitarPaises() throws InterruptedException {
		elementoEstaPresente(países);
		elementoEstaVisivel(países);
		elementoEstaNaPagina(países);
		escreverCompassado(países, "BRASIL");
		pressionarEnter(países);
		aguardar();

	}

	public void digitarTipoDocumentacao() {

		elementoEstaPresente(tipoDocumentacao);
		aguardar();
		aguardar();
		elementoEstaVisivel(tipoDocumentacao);
		aguardar();
		aguardar();
		elementoEstaNaPagina(tipoDocumentacao);
		aguardar();
		aguardar();
		clicar(tipoDocumentacao);
		aguardar();
		aguardar();
		elementoEstaPresente(tipoRG);
		aguardar();
		aguardar();
		elementoEstaVisivel(tipoRG);
		aguardar();
		// elementoEstaNaPagina(tipoRG);
		aguardar();
		aguardar();
		clicar(tipoRG);

	}

	public void digitarNumeroTipoDocumentacao() {
		elementoEstaPresente(numeroTipoDocumentacao);
		elementoEstaVisivel(numeroTipoDocumentacao);
		elementoEstaNaPagina(numeroTipoDocumentacao);
		escrever(numeroTipoDocumentacao, "65997514072");
	}

	public void selecionarProximaPagina() {
		elementoEstaPresente(proximaPagina);
		elementoEstaVisivel(proximaPagina);
		elementoEstaNaPagina(proximaPagina);
		clicar(proximaPagina);

	}

	public void selecionarConfirmarAlteracao() {
		elementoEstaPresente(confirmarAlteracao);
		elementoEstaVisivel(confirmarAlteracao);
		elementoEstaNaPagina(confirmarAlteracao);
		clicar(confirmarAlteracao);

	}

	public void digitarEndereco1() {
		elementoEstaPresente(endereco1);
		elementoEstaVisivel(endereco1);
		elementoEstaNaPagina(endereco1);
		endereco1.waitUntilPresent();
		escrever(endereco1, "endereco1");
	}

	public void digitarEndereco2() {
		elementoEstaPresente(endereco2);
		elementoEstaVisivel(endereco2);
		elementoEstaNaPagina(endereco2);
		escrever(endereco2, "endereco2");
	}

	public void digitarCidade() {
		elementoEstaPresente(cidade);
		elementoEstaVisivel(cidade);
		elementoEstaNaPagina(cidade);
		escrever(cidade, "cidade1");
	}

	public void digitarEstado() {
		elementoEstaPresente(estado);
		elementoEstaVisivel(estado);
		elementoEstaNaPagina(estado);
		escrever(estado, "CE");
	}

	public void digitarCodigoPostal() {
		elementoEstaPresente(postal);
		elementoEstaVisivel(postal);
		elementoEstaNaPagina(postal);
		escrever(postal, "60000-000");
	}

	public void selecionarInformacoesAdicionais() {
		elementoEstaPresente(informacoesAdicionais);
		elementoEstaVisivel(informacoesAdicionais);
		elementoEstaNaPagina(informacoesAdicionais);
		clicar(informacoesAdicionais);
	}

	public void selecionarTipoTelefone() {
		elementoEstaPresente(informacoesAdicionais);
		elementoEstaVisivel(informacoesAdicionais);
		elementoEstaNaPagina(informacoesAdicionais);
		clicar(informacoesAdicionais);
	}

	public void digitarTipoTelefone() {
		elementoEstaPresente(tipoTelefone);
		elementoEstaVisivel(tipoTelefone);
		elementoEstaNaPagina(tipoTelefone);
		clicar(tipoTelefone);
		setaParaBaixo(tipoTelefone);
		setaParaBaixo(tipoTelefone);
		setaParaBaixo(tipoTelefone);
		setaParaBaixo(tipoTelefone);
		setaParaBaixo(tipoTelefone);
		pressionarEnter(tipoTelefone);

	}

	public void digitarCodigoPais() throws InterruptedException {
		elementoEstaPresente(codigoPais);
		elementoEstaVisivel(codigoPais);
		elementoEstaNaPagina(codigoPais);
		escreverCompassado(codigoPais, "Brasil 55");

	}

	public void selecionarBtnProximo() {
		elementoEstaPresente(btnProximo);
		elementoEstaVisivel(btnProximo);
		elementoEstaNaPagina(btnProximo);
		clicar(btnProximo);

	}

	public void digitarTipoAdmissao() {
		elementoEstaPresente(tipoAdmissao);
		elementoEstaVisivel(tipoAdmissao);
		elementoEstaNaPagina(tipoAdmissao);
		escrever(tipoAdmissao, "Admissão");

	}

	public void digitarNumero() {
		elementoEstaPresente(numero);
		elementoEstaVisivel(numero);
		elementoEstaNaPagina(numero);
		escrever(numero, "" + arquivo.numeroQualquer());

	}

	public void digitarTipoIndicadorAdmissao() {
		elementoEstaPresente(indicarAdmissao);
		elementoEstaVisivel(indicarAdmissao);
		elementoEstaNaPagina(indicarAdmissao);
		escrever(indicarAdmissao, "Normal");

	}

	public void digitarRegimeMaoDeObra() {
		elementoEstaPresente(regimeMaoObra);
		elementoEstaVisivel(regimeMaoObra);
		elementoEstaNaPagina(regimeMaoObra);
		// clicar(regimeMaoObra);
		aguardar();
		escrever(regimeMaoObra, "2 - Regime Jurídico Próprio (Estatutários)");

	}

	public void digitarPrevidenciaSocial() {
		elementoEstaPresente(seguroSocial);
		elementoEstaVisivel(seguroSocial);
		elementoEstaNaPagina(seguroSocial);
		escrever(seguroSocial, "Regime Geral da Previdência Social - RGPS");
	}

	public void digitarNumeroAtribuicao() {
		elementoEstaPresente(numeroAtribuicao);
		elementoEstaVisivel(numeroAtribuicao);
		elementoEstaNaPagina(numeroAtribuicao);
		escrever(numeroAtribuicao, "" + arquivo.numeroQualquer());
	}

	public void digitarUnidadeNegocio() {
		elementoEstaPresente(unidadeNegocio);
		elementoEstaVisivel(unidadeNegocio);
		elementoEstaNaPagina(unidadeNegocio);
		escrever(unidadeNegocio, "MDB");
		setaParaBaixo(unidadeNegocio);
		pressionarEnter(unidadeNegocio);
	}

	public void digitarPosicao() {
		elementoEstaPresente(posicao);
		elementoEstaVisivel(posicao);
		elementoEstaNaPagina(posicao);
		escrever(posicao, "POSICAO TESTE AUTOMATIZADO");
		setaParaBaixo(posicao);
		pressionarEnter(posicao);
	}

	public void confirmarPosicao() {
		elementoEstaPresente(btnConfirmarPosicao);
		elementoEstaVisivel(btnConfirmarPosicao);
		elementoEstaNaPagina(btnConfirmarPosicao);
		clicar(btnConfirmarPosicao);
	}

	public void digitarFormaPagamento() {
		elementoEstaPresente(formaPagamento);
		elementoEstaVisivel(formaPagamento);
		elementoEstaNaPagina(formaPagamento);
		escrever(formaPagamento, "Mensalista");
	}

	public void digitarHoraTrabalho() {
		elementoEstaPresente(horasTrabalho);
		elementoEstaVisivel(horasTrabalho);
		elementoEstaNaPagina(horasTrabalho);
		escrever(horasTrabalho, "20");
	}

	public void digitarFrequencia() {
		elementoEstaPresente(frequencia);
		elementoEstaVisivel(frequencia);
		elementoEstaNaPagina(frequencia);
		escrever(frequencia, "Mensal");
		setaParaBaixo(frequencia);
		pressionarEnter(frequencia);

	}

	public void digitarFTE() {
		elementoEstaPresente(fte);
		elementoEstaVisivel(fte);
		elementoEstaNaPagina(fte);
		escrever(fte, "1");

	}

	public void digitarQuadroEfetivo() {
		elementoEstaPresente(QuadroEfetivo);
		elementoEstaVisivel(QuadroEfetivo);
		elementoEstaNaPagina(QuadroEfetivo);
		escrever(QuadroEfetivo, "1");

	}

	public void digitarEstabelecimentoContribuinte() {
		elementoEstaPresente(contribuinte);
		elementoEstaVisivel(contribuinte);
		elementoEstaNaPagina(contribuinte);
		escrever(contribuinte, "MOINHO DIAS BRANCO");
		setaParaBaixo(contribuinte);
		pressionarEnter(contribuinte);

	}

	public void clicarBtnOk() {
		aguardar();
		aguardar();
		aguardar();
		elementoEstaPresente(btnOK);
		elementoEstaVisivel(btnOK);
		elementoEstaNaPagina(btnOK);
		clicar(btnOK);
	}

	public void digitarCategoriaColaborador() {
		elementoEstaPresente(categoriaColaborador);
		elementoEstaVisivel(categoriaColaborador);
		elementoEstaNaPagina(categoriaColaborador);
		escrever(categoriaColaborador, "Empregado");
		setaParaBaixo(categoriaColaborador);
		pressionarEnter(categoriaColaborador);
	}

	public void selecionarSubmeter() {
		elementoEstaPresente(btnSubmeter);
		elementoEstaVisivel(btnSubmeter);
		elementoEstaNaPagina(btnSubmeter);
		clicar(btnSubmeter);
	}

	public void digitarPeriodoExperiencia() {
		elementoEstaPresente(periodoExperiencia);
		elementoEstaVisivel(periodoExperiencia);
		elementoEstaNaPagina(periodoExperiencia);
		escrever(periodoExperiencia, "45");
	}

	public void digitarDuracaoExperiencia() {
		elementoEstaPresente(duracaoExperiencia);
		elementoEstaVisivel(duracaoExperiencia);
		elementoEstaNaPagina(duracaoExperiencia);
		clicar(duracaoExperiencia);
		setaParaBaixo(duracaoExperiencia);
		pressionarEnter(duracaoExperiencia);
	}

	public void selecionarMembroSindicato() {
		elementoEstaPresente(membroSindicato);
		elementoEstaVisivel(membroSindicato);
		elementoEstaNaPagina(membroSindicato);
		clicar(membroSindicato);
		setaParaBaixo(membroSindicato);
		pressionarEnter(membroSindicato);
	}

	public void clicarBtnProximo() {
		elementoEstaPresente(btnProximo);
		elementoEstaVisivel(btnProximo);
		elementoEstaNaPagina(btnProximo);
		clicar(btnProximo);

	}

	public void digitarBaseSalarial() {
		elementoEstaPresente(baseSalarial);
		elementoEstaVisivel(baseSalarial);
		elementoEstaVisivel(baseSalarial);
		elementoEstaNaPagina(baseSalarial);
		escrever(baseSalarial, "SALBAS");
	}

	public void digitarValorSalarial() {
		elementoEstaPresente(valorSalarial);
		elementoEstaVisivel(valorSalarial);
		elementoEstaNaPagina(valorSalarial);
		escrever(valorSalarial, "3000");
	}

	public void digitarDataRevisaoSalarial() {
		elementoEstaPresente(dataRevisaoSalarial);
		elementoEstaVisivel(dataRevisaoSalarial);
		elementoEstaNaPagina(dataRevisaoSalarial);
		escrever(dataRevisaoSalarial, "01/01/2020");
	}

	public void selecionarBtnSalvar() {
		elementoEstaPresente(btnSalvar);
		elementoEstaVisivel(btnSalvar);
		elementoEstaNaPagina(btnSalvar);
		clicar(btnSalvar);

	}

	public void confirmaMsgSalvar() {
		aguardar();
		aguardar();
		aguardar();
		aguardar();
		elementoEstaPresente(msgConfirmacaoSalvar);
		elementoEstaVisivel(msgConfirmacaoSalvar);
		elementoEstaNaPagina(msgConfirmacaoSalvar);
		clicar(msgConfirmacaoSalvar);

	}

	public void selecionarBtnEnviar() {
		aguardar();
		aguardar();
		elementoEstaPresente(btnEnviar);
		elementoEstaVisivel(btnEnviar);
		elementoEstaNaPagina(btnEnviar);
		clicar(btnEnviar);
		aguardar();
		aguardar();

	}

	public void confirmarMsgEnviar() {
		aguardar();
		aguardar();
		aguardar();
		aguardar();
		elementoEstaPresente(msgConfirmarEnviar);
		elementoEstaVisivel(msgConfirmarEnviar);
		elementoEstaNaPagina(msgConfirmarEnviar);
		clicar(msgConfirmarEnviar);
		aguardar();
		aguardar();
		aguardar();
		aguardar();
		aguardar();

	}

}
