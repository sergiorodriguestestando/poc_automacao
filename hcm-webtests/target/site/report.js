$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/mercanet/pedido_edi.feature");
formatter.feature({
  "name": "Realizar pedido edi",
  "description": "Como usuário do perfil gestor\nEu quero realizar um pedido edi",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@pedido_edi"
    }
  ]
});
formatter.scenario({
  "name": "Realizar pedido edi",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@pedido_edi"
    }
  ]
});
formatter.step({
  "name": "que usuário possa acessar a tela de login do sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "PedidoVendaSteps.que_usuário_possa_acessar_a_tela_de_login_do_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar um usuário",
  "keyword": "Quando "
});
formatter.match({
  "location": "PedidoVendaSteps.informar_um_usuário()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir uma senha",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.inserir_uma_senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pesquisar por um pedido edi",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoEdiSteps.pesquisar_por_um_pedido_edi()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o pedido é exibido",
  "keyword": "Então "
});
formatter.match({
  "location": "PedidoEdiSteps.o_pedido_é_exibido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sair do sistema",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.sair_do_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/mercanet/pedido_venda.feature");
formatter.feature({
  "name": "Realizar pedido",
  "description": "Como usuário do perfil gestor\nEu quero realizar um pedido",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@pedido"
    }
  ]
});
formatter.scenario({
  "name": "Realizar pedido de venda",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@pedido"
    }
  ]
});
formatter.step({
  "name": "que usuário possa acessar a tela de login do sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "PedidoVendaSteps.que_usuário_possa_acessar_a_tela_de_login_do_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar um usuário",
  "keyword": "Quando "
});
formatter.match({
  "location": "PedidoVendaSteps.informar_um_usuário()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir uma senha",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.inserir_uma_senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "menu principal é exibido",
  "keyword": "Então "
});
formatter.match({
  "location": "PedidoVendaSteps.menu_principal_é_exibido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um novo pedido",
  "keyword": "Quando "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_um_novo_pedido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um cliente",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_um_cliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um preco",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_um_preco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar uma condicao de pagamento",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_uma_condicao_de_pagamento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um produto",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_um_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar uma quantidade",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_uma_quantidade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o botao salvar",
  "keyword": "Quando "
});
formatter.match({
  "location": "PedidoVendaSteps.selecionar_o_botao_salvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem de sucesso é exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "PedidoVendaSteps.a_mensagem_de_sucesso_é_exibida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sair do sistema",
  "keyword": "E "
});
formatter.match({
  "location": "PedidoVendaSteps.sair_do_sistema()"
});
formatter.result({
  "status": "passed"
});
});