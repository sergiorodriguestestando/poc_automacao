$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/admissao/RealizarAdmissao.feature");
formatter.feature({
  "name": "Realizar Admissão de um nono colocaborador",
  "description": "Como usuário do perfil Gestor\nEu quero informar os dados obrigatórios\nE cadastrar um novo colaborador",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Realizar Admissão de um Colaborador",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "que usuário possa acessar a tela de login do sistema",
  "keyword": "Dado "
});
formatter.step({
  "name": "informar um usuário\u003cUsuario\u003e",
  "keyword": "Quando "
});
formatter.step({
  "name": "inserir uma senha \u003cSenha\u003e",
  "keyword": "E "
});
formatter.step({
  "name": "selecionar o botão entrar",
  "keyword": "E "
});
formatter.step({
  "name": "o Menu Principal é exibido",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Senha"
      ]
    },
    {
      "cells": [
        "\"integration.hcm\"",
        "\"Int2017@mdb\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Realizar Admissão de um Colaborador",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "que usuário possa acessar a tela de login do sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "RealizarAdmissaoSteps.que_usuário_possa_acessar_a_tela_de_login_do_sistema()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar um usuário\"integration.hcm\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "RealizarAdmissaoSteps.informarUmUsuário(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir uma senha \"Int2017@mdb\"",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarAdmissaoSteps.inserir_uma_senha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecionar o botão entrar",
  "keyword": "E "
});
formatter.match({
  "location": "RealizarAdmissaoSteps.selecionar_o_botão_entrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o Menu Principal é exibido",
  "keyword": "Então "
});
formatter.match({
  "location": "RealizarAdmissaoSteps.oMenuPrincipalÉExibido()"
});
formatter.result({
  "status": "passed"
});
});