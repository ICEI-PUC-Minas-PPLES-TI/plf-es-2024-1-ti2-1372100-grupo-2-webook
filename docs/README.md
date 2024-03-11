# WeBook


**Arthur Curi Kramberger, ackramberger@sga.pucminas.br**

**Eduardo Palhares Reale Pereira, eduardo.palhares@sga.pucminas.br**

**Hugo Macedo de Carvalho, hmcarvalho@sga.pucminas.br**

**João Pedro Guimarães Ribeiro, joao.ribeiro.1485762@sga.pucminas.br**

**Pedro Henrique de Almeida Araujo, pedroaraujo2906@hotmail.com**

**Pedro Henrique Pimenta Vaz, pedro.vaz@sga.pucminas.br**

---

Professores:

**Eveline Alonso Veloso**

**Juliana Amaral Baroni de Carvalho**

---

_Curso de Engenharia de Software_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade Católica de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

_**Resumo**. Escrever aqui o resumo. O resumo deve contextualizar rapidamente o trabalho, descrever seu objetivo e, ao final, 
mostrar algum resultado relevante do trabalho (até 10 linhas)._

---


## 1. Introdução

_Explore um mundo de conhecimento e entretenimento sem sair do conforto da sua casa. Bem-vindo ao nosso site de aluguel de livros, sua biblioteca online pessoal, onde a leitura se torna uma experiência de fácil acesso, mais barata e simples._

### 1.1 Contextualização

_As bibliotecas assumem um papel fundamental na sociedade moderna, servindo como centros de informação, conhecimento e cultura. Elas transcendem a mera função de armazenamento de livros, atuando como espaços de pesquisa, aprendizado e desenvolvimento social. No contexto da era digital, as bibliotecas se reinventam, incorporando novas tecnologias e ampliando seus serviços para atender às demandas de uma sociedade cada vez mais conectada. De acordo com essa pesquisa realizada pela Associação Paulista de Bibliotecas e Leitura, cerca de 34 milhões de pessoas frequentam bibliotecas no País, sendo a maioria pertencente à classe C (49%), seguida da B, com 26% e D/E, com 21%. Os estudantes são 60% dos frequentadores. A principal motivação para ir à biblioteca é ler livros para pesquisar ou estudar (51%) e, em seguida, ler por prazer (33%).
Fonte: https://www.spleituras.org.br/noticia/cerca-de-34-milhes-de-pessoas-frequentam-bibliotecas-no-brasil-diz-pesquisa_

### 1.2 Problema

_Problemas de bibliotecas sem sistemas de automação começam com a locação de seus livros, que, quando são alugados, podem ser roubados, ou não foram devolvidos ainda. Além de auxiliar e avisar o bibliotecário quando o livro será devolvido caso ele esteja alugado, ele ainda calcula o valor do aluguel para o cliente independente de quanto tempo o cliente quer alugar o livro._

### 1.3 Objetivo geral

_No caso específico desse projeto, o objetivo deste trabalho  é desenvolver um sistema para automação de processos para bibliotecas no geral. Automatizando serviços como fazer o inventário dos livros para controle geral, fazer a conta do preço do aluguel dos livros e facilitar a administração de livros novos._

#### 1.3.1 Objetivos específicos

_Objetivos específicos:
  Empréstimo;
  Devolução;
  Gerenciamento de usuário;
  Gerenciamento de livro;_

### 1.4 Justificativas

_Auxiliar bibliotecas físicas com o gerenciamento e organização dos livros.
Auxiliar bibliotecas físicas e onlines (como o kindle) por exemplo com métodos de pagamento e cálculo de preços.
O processo se justifica pois muitas bibliotecas físicas sofrem com o controle e administração de empréstimo e devolução de livros._

## 2. Participantes do processo

_Apenas dois participantes no processo, seriam eles:
   Usuario
   Bibliotecario_

## 3. Modelagem do processo de negócio

### 3.1. Análise da situação atual

_Normalmente os procedimentos manuais e/ou sistemas tradicionais de gestão de bibliotecas são usados para lidar com o problema das filas e dos atrasos na devolução de livros em bibliotecas. Aqui está uma descrição textual de como esses sistemas normalmente funcionam:
**Devolução de livros:** Dentro do prazo estabelecido para a devolução, o utilizador volta à biblioteca com o livro em sua posse. Mais uma vez, ele vai até ao balcão de atendimento, onde o funcionário verifica a condição do livro e registra a devolução no sistema. Caso haja atraso na devolução, o funcionário irá calcular a multa conforme as políticas da biblioteca.
**Gestão de filas:** O tempo de espera nas filas pode mudar conforme a quantidade de usuários na biblioteca, o atendimento eficaz e outros fatores. Durante os horários de pico, a biblioteca pode designar mais funcionários para o balcão ou implementar sistemas de reserva online de livros para reduzir a espera.
**Cobrança de multas:** Normalmente, as multas por atraso na devolução são cobradas quando o livro é devolvido ou em um momento subsequente quando o usuário retorna à biblioteca. A multa é calculada de acordo com o atraso e as políticas da biblioteca.
Nas bibliotecas atuais, o controle manual de empréstimos consome considerável tempo dos bibliotecários, tanto durante o processo de empréstimo realizado pelos estudantes quanto na gestão da disponibilidade dos livros para os leitores em datas específicas. Tradicionalmente, no procedimento geral de empréstimo, o cliente, após apresentar sua documentação, escolhe o livro desejado e assina um termo, registrando o momento da retirada e o responsável. Após essa etapa, o cliente recebe um comprovante contendo informações essenciais para a devolução na data estipulada, incluindo possíveis multas por atraso. Infelizmente, muitas bibliotecas enfrentam desafios decorrentes do elevado volume de clientes, resultando em dificuldades e atrasos nesse processo que poderia ser agilizado e gerenciado de maneira mais eficiente.
Diante dessas dificuldades, as bibliotecas em todo o Brasil confrontam desafios significativos relacionados a roubos e danos aos livros emprestados aos leitores. Em resposta a esse cenário, nosso projeto propõe a minimização desses problemas por meio de um sistema de gerenciamento de multas. O objetivo central é calcular com precisão as multas dos clientes, visando evitar prejuízos financeiros para as bibliotecas. Nossa plataforma será utilizada para calcular o valor correspondente a livros perdidos e efetuar o pagamento correspondente. Em casos de danos, faremos uma avaliação da gravidade do estrago, incorporando o custo do reparo ao valor do aluguel do livro. Com essa abordagem integrada, almejamos não apenas otimizar a eficiência do processo de empréstimo, mas também proporcionar uma gestão mais ágil e eficaz dos recursos bibliotecários em todo o país._

### 3.2. Descrição geral da proposta

_A proposta do nosso projeto consiste em auxiliar bibliotecas físicas e presenciais com os metodos de pagamento da locação de livros, datas de devolução, calculo de multas em caso de atraso do prazo de devolução e localização de um livro especifico em determinado setor da biblioteca, facilitando o trabalho do bibliotecario e melhorando o atendimento ao cliente, alem de facilitar calcular o valor de multas através do cadastro do cliente e dos livros no nosso software._

### 3.3. Modelagem dos processos

[PROCESSO 1 - Nome do Processo](processo-1-nome-do-processo.md "Detalhamento do Processo 1.")

[PROCESSO 2 - Nome do Processo](processo-2-nome-do-processo.md "Detalhamento do Processo 2.")

[PROCESSO 3 - Nome do Processo](processo-3-nome-do-processo.md "Detalhamento do Processo 3.")

[PROCESSO 4 - Nome do Processo](processo-4-nome-do-processo.md "Detalhamento do Processo 4.")

## 4. Projeto da solução

O documento a seguir apresenta o detalhamento do projeto da solução. São apresentadas duas seções que descrevem, respectivamente: modelo relacional e tecnologias.

[Projeto da solução](solution-design.md "Detalhamento do projeto da solução: modelo relacional e tecnologias.")


## 5. Indicadores de desempenho

O documento a seguir apresenta os indicadores de desempenho dos processos.

[Indicadores de desempenho dos processos](performance-indicators.md)


## 6. Interface do sistema

A sessão a seguir apresenta a descrição do produto de software desenvolvido. 

[Documentação da interface do sistema](interface.md)

## 7. Conclusão

_Apresente aqui a conclusão do seu trabalho. Discussão dos resultados obtidos no trabalho, onde se verifica as observações pessoais de cada aluno. Poderá também apresentar sugestões de novas linhas de estudo._

# REFERÊNCIAS

_Como um projeto de software não requer revisão bibliográfica, a inclusão das referências não é obrigatória. No entanto, caso você deseje incluir referências relacionadas às tecnologias, padrões, ou metodologias que serão usadas no seu trabalho, relacione-as de acordo com a ABNT._

_Verifique no link abaixo como devem ser as referências no padrão ABNT:_

http://portal.pucminas.br/imagedb/documento/DOC_DSC_NOME_ARQUI20160217102425.pdf

**[1.1]** - _ELMASRI, Ramez; NAVATHE, Sham. **Sistemas de banco de dados**. 7. ed. São Paulo: Pearson, c2019. E-book. ISBN 9788543025001._

**[1.2]** - _COPPIN, Ben. **Inteligência artificial**. Rio de Janeiro, RJ: LTC, c2010. E-book. ISBN 978-85-216-2936-8._

**[1.3]** - _CORMEN, Thomas H. et al. **Algoritmos: teoria e prática**. Rio de Janeiro, RJ: Elsevier, Campus, c2012. xvi, 926 p. ISBN 9788535236996._

**[1.4]** - _SUTHERLAND, Jeffrey Victor. **Scrum: a arte de fazer o dobro do trabalho na metade do tempo**. 2. ed. rev. São Paulo, SP: Leya, 2016. 236, [4] p. ISBN 9788544104514._

**[1.5]** - _RUSSELL, Stuart J.; NORVIG, Peter. **Inteligência artificial**. Rio de Janeiro: Elsevier, c2013. xxi, 988 p. ISBN 9788535237016._



# APÊNDICES


_Atualizar os links e adicionar novos links para que a estrutura do código esteja corretamente documentada._


## Apêndice A - Código fonte

[Código do front-end](../src/front) -- repositório do código do front-end

[Código do back-end](../src/back)  -- repositório do código do back-end


## Apêndice B - Apresentação final


[Slides da apresentação final](presentations/)


[Vídeo da apresentação final](video/)






