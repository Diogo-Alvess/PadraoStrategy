Este repositório apresenta a implementação do padrão de projeto Strategy em um cenário de aplicação de descontos em compras.
Foi criada uma estrutura que permite calcular o valor final de uma compra de forma flexível, conforme o tipo de desconto escolhido ,como Natal, Black Friday, Aniversário ou Sem Desconto.

Através da interface Desconto, definimos o comportamento comum para todas as estratégias, garantindo que cada classe concreta implemente o método calcular(valor) de maneira específica.
A classe Loja atua como o contexto, responsável por aplicar o desconto selecionado ao valor da compra, enquanto a classe Compra representa o cliente que escolhe e utiliza a estratégia desejada.

Essa implementação demonstra, de forma simples e prática, como o padrão Strategy permite isolar variações de comportamento (neste caso, os diferentes cálculos de desconto) sem modificar o código principal do sistema.
Com isso, o código torna-se mais flexível, extensível e de fácil manutenção, sendo ideal para sistemas que precisam alterar dinamicamente o tipo de operação realizada sobre um mesmo conjunto de dados.
