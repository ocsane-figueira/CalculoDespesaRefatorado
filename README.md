Na classe TipoDespesa, por ser do tipo ENUM, já terá valores pré-definidos (limite). O que ocorrerá será um comparativo entre o limite estabelecido na enum para com a main. 
Ou seja, o valor gasto definido na Main (ex: 6000 para Jantar) será somado com o valor fixo do tipo (5000 para Jantar) e comparado ao limite. O relatório indicará se o gasto ultrapassou o limite definido para aquele tipo.

Como funciona o projeto:

Cadastro de Despesas: Ao criar uma nova Despesa, você define seu tipo (TipoDespesa) e valor. O tipo de despesa define o limite de valor que a despesa pode ter.

Relatório: A classe RelatorioDespesa é utilizada para gerar um relatório completo das despesas cadastradas, incluindo o total gasto com refeições e o total geral de todas as despesas.
