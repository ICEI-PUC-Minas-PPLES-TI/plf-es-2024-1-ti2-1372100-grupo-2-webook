# WeBook


**Arthur Curi Kramberger, ackramberger@sga.pucminas.br**

**Eduardo Palhares Reale Pereira, eduardo.palhares@sga.pucminas.br**

**Hugo Macedo de Carvalho, hmcarvalho@sga.pucminas.br**

**João Pedro Guimarães Ribeiro, joao.ribeiro.1485762@sga.pucminas.br**

**Pedro Henrique de Almeida Araujo, pedro.araujo.1444425@sga.pucminas.br**

**Pedro Henrique Pimenta Vaz, pedro.vaz@sga.pucminas.br**

---

Professores:

**Eveline Alonso Veloso**

**Juliana Amaral Baroni de Carvalho**

---

Curso de Engenharia de Software

Instituto de Informática e Ciências Exatas – Pontifícia Universidade Católica de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil

---

**Resumo**. Escrever aqui o resumo. O resumo deve contextualizar rapidamente o trabalho, descrever seu objetivo e, ao final, 
mostrar algum resultado relevante do trabalho (até 10 linhas).

---


## 1. Introdução

Explore um mundo de conhecimento e entretenimento sem sair do conforto da sua casa. Bem-vindo ao nosso site de aluguel de livros, sua biblioteca online pessoal, onde a leitura se torna uma experiência de fácil acesso, mais barata e simples.

### 1.1 Contextualização

As bibliotecas assumem um papel fundamental na sociedade moderna, servindo como centros de informação, conhecimento e cultura. Elas transcendem a mera função de armazenamento de livros, atuando como espaços de pesquisa, aprendizado e desenvolvimento social. No contexto da era digital, as bibliotecas se reinventam, incorporando novas tecnologias e ampliando seus serviços para atender às demandas de uma sociedade cada vez mais conectada. De acordo com a pesquisa **1.1** realizada pela Associação Paulista de Bibliotecas e Leitura, cerca de 34 milhões de pessoas frequentam bibliotecas no País, sendo a maioria pertencente à classe C (49%), seguida da B, com 26% e D/E, com 21%. Os estudantes são 60% dos frequentadores. A principal motivação para ir à biblioteca é ler livros para pesquisar ou estudar (51%) e, em seguida, ler por prazer (33%).



### 1.2 Problema

Problemas de bibliotecas sem sistemas de automação começam com a locação de seus livros, que, quando são alugados, podem ser roubados, ou não foram devolvidos ainda. Além de auxiliar e avisar o bibliotecário quando o livro será devolvido caso ele esteja alugado, ele ainda calcula o valor do aluguel para o cliente independente de quanto tempo o cliente quer alugar o livro.

### 1.3 Objetivo geral

No caso específico desse projeto, o objetivo deste trabalho  é desenvolver um sistema para automação de processos para bibliotecas no geral. Automatizando serviços como fazer o inventário dos livros para controle geral, fazer a conta do preço do aluguel dos livros e facilitar a administração de livros novos.

#### 1.3.1 Objetivos específicos

Objetivos específicos:
  Empréstimo;
  
  Devolução;
  
  Gerenciamento de usuário;
  
  Gerenciamento de livro;
  

### 1.4 Justificativas

Auxiliar bibliotecas físicas com o gerenciamento e organização dos livros.
Auxiliar bibliotecas físicas e onlines (como o kindle) por exemplo com métodos de pagamento e cálculo de preços.
O processo se justifica pois muitas bibliotecas físicas sofrem com o controle e administração de empréstimo e devolução de livros.

## 2. Participantes do processo

Apenas dois participantes no processo, seriam eles:

  Usuário;
   
  Bibliotecário;

## 3. Modelagem do processo de negócio

### 3.1. Análise da situação atual

  Nas bibliotecas atuais, o controle manual de empréstimos consome consideravelmente o tempo dos bibliotecários, tanto durante o processo de empréstimo realizado pelos clientes, quanto na gestão da disponibilidade dos livros para os leitores em datas específicas. Tradicionalmente, no procedimento geral de empréstimo, o cliente, após apresentar sua documentação, escolhe o livro desejado e assina um termo, registrando o momento da retirada e o responsável. Após essa etapa, o cliente recebe um comprovante contendo informações essenciais para a devolução na data estipulada, incluindo possíveis multas por atraso. Ao retornar à biblioteca, o cliente entrega o livro ao bibliotecário ou utiliza um terminal de autoatendimento designado para a devolução. O bibliotecário verifica o estado do livro, examinando possíveis danos ou itens em falta, e confirma a devolução. O status do livro é alterado para "devolvido" e remove a associação com o cliente. Caso o usuário esteja sujeito a multas devido ao atraso na devolução, ele gera automaticamente uma notificação, esta notificação pode ser enviada por e-mail, mensagem de texto ou até mesmo uma nota impressa, informando ao usuário sobre a multa e seu valor. São oferecidas ao usuário diferentes opções de pagamento para quitar a multa. Isso pode incluir o pagamento em dinheiro no balcão de atendimento ou até mesmo integração com sistemas de pagamento digital, no qual o cliente pode escolher a opção mais conveniente e realizar o pagamento. Após o pagamento ser efetuado, a transação é registrada, atualizando o status do cliente e removendo a multa pendente de seu registro, um recibo de pagamento pode ser emitido, fornecendo ao mesmo um comprovante da transação realizada. 
  Se o cliente devolve o livro com danos visíveis ou informa à biblioteca sobre a perda do livro durante o período de empréstimo, um bibliotecário avalia a condição do exemplar, verifica se os danos são superficiais, como rasgos leves ou páginas dobradas, ou se são mais graves, como capas danificadas ou páginas arrancadas. Em caso de perda, a ausência total do livro também é verificada, o valor da compensação é calculado com base na política da biblioteca e no preço de reposição do livro. Se a biblioteca optar por substituir o livro danificado ou perdido, o cliente pode ser cobrado pelo custo da nova cópia, além de eventuais taxas administrativas. Se for aplicavél, o cliente é instruído sobre os próximos passos para resolver a questão, incluindo informações sobre como efetuar o pagamento ou fornecer uma cópia substituta do livro, se permitido pela biblioteca, o cliente tem a opção de pagar pela compensação dos danos ou pela perda do livro, seguindo os procedimentos estabelecidos pela biblioteca. Caso ele opte por fornecer uma cópia substituta do livro, ela será avaliada pela biblioteca para garantir que atenda aos requisitos de qualidade e edição. Após o pagamento ser efetuado ou a compensação ser aceita pela biblioteca, a transação é registrada e atualiza o status do cliente, adicionando o livro ao acervo da biblioteca e registrando como parte do processo de reposição. 
  Infelizmente, muitas bibliotecas enfrentam desafios decorrentes do elevado volume de clientes, resultando em dificuldades e atrasos nesse processo que poderia ser agilizado e gerenciado de maneira mais eficiente. Diante dessas dificuldades, as bibliotecas em todo o Brasil enfrentam desafios significativos relacionados ao mal gerenciamento, roubos e danos aos livros emprestados aos leitores.


### 3.2. Descrição geral da proposta
   Hoje em dia, bibliotecas físicas no Brasil, encaram muitos problemas em seus processos padrões, tais como: processo de locação de livros; filas para pagamento de multas; localização de livros especificos dentro da biblioteca. O nosso projeto propõe soluções desses problemas especificos atraves do software. Os problemas poderão ser solucionados atraves de uma plataforma que possuirá o cadastro de todos os usuarios que frequentam a biblioteca, além do cadastro de livros e cálculos do valor de multas e alugueis. Além disso, possibilitará ao bibliotecario utilizar o seu tempo em outros serviços dentro da biblioteca e disponibilizará um melhor serviço ao cliente.

### 3.3. Modelagem dos processos

[PROCESSO 1 - Processo de Empréstimo](processo-1-nome-do-processo.md "Detalhamento do Processo 1.")

[PROCESSO 2 - Processo de Devolução](processo-2-nome-do-processo.md "Detalhamento do Processo 2.")

[PROCESSO 3 - Processo de Gerenciamento de Livros](processo-3-nome-do-processo.md "Detalhamento do Processo 3.")

[PROCESSO 4 - Processo de Gerenciamento de Usuário](processo-4-nome-do-processo.md "Detalhamento do Processo 4.")

## 4. Projeto da solução

[Projeto da solução](solution-design.md "Detalhamento do projeto da solução: modelo relacional e tecnologias.")


## 5. Indicadores de desempenho

O documento a seguir apresenta os indicadores de desempenho dos processos.

[Indicadores de desempenho dos processos](performance-indicators.md)


## 6. Interface do sistema

A sessão a seguir apresenta a descrição do produto de software desenvolvido. 

[Documentação da interface do sistema](interface.md)

## 7. Conclusão

Apresente aqui a conclusão do seu trabalho. Discussão dos resultados obtidos no trabalho, onde se verifica as observações pessoais de cada aluno. Poderá também apresentar sugestões de novas linhas de estudo.

# REFERÊNCIAS

**[1.1]** - SPLEITURAS, Organização Social de Cultura; Angelo Xavier. Cerca de 34 milhões de pessoas frequentam bibliotecas no Brasil, diz pesquisa. POSTADO EM 11 DE SETEMBRO DE 2020. ed. Rua Faustolo, 576 • Água Branca • 05041-000 • São Paulo.

Fonte: https://www.spleituras.org.br/noticia/cerca-de-34-milhes-de-pessoas-frequentam-bibliotecas-no-brasil-diz-pesquisa

Acesso em: 29 fev. 2024.

**[1.2]** - 

**[1.3]** - 

**[1.4]** - 

**[1.5]** -



# APÊNDICES

Atualizar os links e adicionar novos links para que a estrutura do código esteja corretamente documentada.


## Apêndice A - Código fonte

[Código do front-end](../src/front) -- repositório do código do front-end

[Código do back-end](../src/back)  -- repositório do código do back-end


## Apêndice B - Apresentação final


[Slides da apresentação final](presentations/)


[Vídeo da apresentação final](video/)






