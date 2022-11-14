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
});