$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/mercanet/pedido.feature");
formatter.feature({
  "name": "Realizar login no sistema",
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
  "location": "MercanetSteps.que_usuário_possa_acessar_a_tela_de_login_do_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar um usuário",
  "keyword": "Quando "
});
formatter.match({
  "location": "MercanetSteps.informar_um_usuário()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir uma senha",
  "keyword": "E "
});
formatter.match({
  "location": "MercanetSteps.inserir_uma_senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "menu principal é exibido",
  "keyword": "Então "
});
formatter.match({
  "location": "MercanetSteps.menu_principal_é_exibido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um novo pedido",
  "keyword": "Quando "
});
formatter.match({
  "location": "MercanetSteps.selecionar_um_novo_pedido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um cliente",
  "keyword": "E "
});
formatter.match({
  "location": "MercanetSteps.selecionar_um_cliente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um preco",
  "keyword": "E "
});
formatter.match({
  "location": "MercanetSteps.selecionar_um_preco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar uma condicao de pagamento",
  "keyword": "E "
});
formatter.match({
  "location": "MercanetSteps.selecionar_uma_condicao_de_pagamento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar um produto",
  "keyword": "E "
});
formatter.match({
  "location": "MercanetSteps.selecionar_um_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar uma quantidade",
  "keyword": "E "
});
formatter.match({
  "location": "MercanetSteps.selecionar_uma_quantidade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o botao salvar",
  "keyword": "Quando "
});
formatter.match({
  "location": "MercanetSteps.selecionar_o_botao_salvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem de sucesso é exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "MercanetSteps.a_mensagem_de_sucesso_é_exibida()"
});
formatter.result({
  "status": "passed"
});
});