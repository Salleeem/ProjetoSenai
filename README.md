# ProjetoSenai


Documentação do Sistema de Gerenciamento de Estoque e Ativos Patrimoniais para uma Unidade Escolar do SENAI-SP
1. Introdução
O Sistema de Gerenciamento de Estoque e Ativos Patrimoniais foi desenvolvido para auxiliar a unidade escolar do SENAI-SP no controle e gestão dos materiais utilizados em laboratórios, salas de aula e demais áreas, bem como na administração dos ativos patrimoniais da instituição. Este documento descreve os principais aspectos do sistema, desde os requisitos até os benefícios esperados.

2. Requisitos do Sistema
2.1 Requisitos Funcionais
Registro de materiais utilizados pela unidade escolar.
Cadastro de categorias de materiais para organização.
Controle de entradas e saídas de estoque.
Gerenciamento de ativos patrimoniais, incluindo registro, atualização e exclusão.
Interface intuitiva para interação com o sistema.
2.2 Requisitos Não Funcionais
Segurança: O sistema deve garantir a segurança dos dados e das operações realizadas.
Performance: O sistema deve ser responsivo e eficiente, mesmo em momentos de alta demanda.
Escalabilidade: Deve ser possível escalar o sistema conforme necessário para atender ao crescimento da instituição.
Usabilidade: A interface de usuário deve ser intuitiva e de fácil utilização para diferentes perfis de usuários.
3. Design do Banco de Dados
O banco de dados foi projetado para armazenar as informações sobre estoque e ativos patrimoniais da seguinte forma:

Tabelas:
Patrimônio:

id_patri (Primary Key)
id_bloco (Foreign Key)
id_sala (Foreign Key)
nome_func
id_cat (Foreign Key)
id_uni (Foreign Key)
valor_patri
data_aqc
Administrador:

id_adm (Primary Key)
senha_adm
nome_adm
cpf_adm
Funcionários:

id_func (Primary Key)
id_sala (Foreign Key)
função
nome_func
senha_func
cpf_func
Consumíveis:

id_cons (Primary Key)
id_func (Foreign Key)
id_cat (Foreign Key)
qnt_cons
Bloco:

id_bloco (Primary Key)
id_uni (Foreign Key)
Unidade:

id_uni (Primary Key)
Salas:

id_sala (Primary Key)
id_bloco (Foreign Key)
nome_func
id_uni (Foreign Key)
Categoria:

id_cat (Primary Key)
Movimentação:

id_mov (Primary Key)
id_patri (Foreign Key)
id_sala (Foreign Key)
id_bloco (Foreign Key)
nome_func
tipo_mov
qnt_patri
data_mov
Descrição das Colunas:
Primary_key: Indica a chave primária da tabela.
Foreign_key: Indica a chave estrangeira que referencia a tabela especificada.
Varchar: Tipo de dado para armazenar strings de comprimento variável.
Boolean: Tipo de dado para armazenar valores booleanos (verdadeiro ou falso).
Int: Tipo de dado para armazenar números inteiros.
Date/time: Tipo de dado para armazenar datas e horas.

Este esquema permite a representação das relações entre as entidades e suas respectivas propriedades, garantindo a integridade dos dados e possibilitando consultas e operações adequadas no sistema de gerenciamento de estoque e ativos patrimoniais para a unidade escolar do SENAI-SP.


4. Implementação da API
A API RESTful foi implementada utilizando o framework Spring Boot em Java. Foram criados endpoints para realizar as seguintes operações:

Adicionar, visualizar, atualizar e excluir materiais e categorias de materiais.
Registrar movimentações de estoque (entrada e saída).
Gerenciar ativos patrimoniais, incluindo operações de registro, atualização e exclusão.


5. Desenvolvimento da Interface de Usuário
A interface de usuário foi desenvolvida de forma responsiva e intuitiva, utilizando HTML e CSS  Os usuários podem interagir com o sistema através de uma interface amigável, que permite:

Adicionar novos materiais e categorias de materiais.
Registrar movimentações de estoque.
Visualizar inventários e gerenciar ativos patrimoniais.
6. Testes e Deploy
Foram realizados testes unitários e de integração para garantir o funcionamento correto do sistema. Após os testes, a aplicação foi configurada e implantada em um ambiente de produção, garantindo sua disponibilidade para uso pela unidade escolar do SENAI-SP.

7. Entregáveis
Documento de requisitos detalhados.
Modelo de banco de dados.
Código fonte da API e da interface de usuário.
Relatório de testes realizados.
URL de acesso ao sistema em ambiente de produção.
8. Benefícios Esperados
Melhor controle e organização dos materiais utilizados pela unidade escolar.
Facilidade na identificação e gestão de ativos patrimoniais.
Redução de perdas e desperdícios de materiais.
Melhoria na eficiência dos processos de controle de estoque.
Conclusão
O Sistema de Gerenciamento de Estoque e Ativos Patrimoniais oferece uma solução prática e eficiente para auxiliar a unidade escolar do SENAI-SP na gestão de seus recursos materiais e patrimoniais. Com uma interface amigável e funcionalidades abrangentes, o sistema contribui para a melhoria dos processos internos e para um melhor aproveitamento dos recursos disponíveis.