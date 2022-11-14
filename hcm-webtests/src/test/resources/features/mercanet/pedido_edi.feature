#language:pt

@pedido_edi
Funcionalidade: Realizar pedido edi


Como usuário do perfil gestor
Eu quero realizar um pedido edi


Cenário: Realizar pedido edi

Dado que usuário possa acessar a tela de login do sistema
Quando informar um usuário
E inserir uma senha
E pesquisar por um pedido edi
Então o pedido é exibido
