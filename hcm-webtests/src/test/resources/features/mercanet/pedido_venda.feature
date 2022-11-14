#language:pt

@pedido
Funcionalidade: Realizar pedido


Como usuário do perfil gestor
Eu quero realizar um pedido


Cenário: Realizar pedido de venda

Dado que usuário possa acessar a tela de login do sistema
Quando informar um usuário
E inserir uma senha
Então menu principal é exibido
Quando selecionar um novo pedido
E selecionar um cliente
E selecionar um preco
E selecionar uma condicao de pagamento
E selecionar um produto
E selecionar uma quantidade
Quando selecionar o botao salvar
Então a mensagem de sucesso é exibida



