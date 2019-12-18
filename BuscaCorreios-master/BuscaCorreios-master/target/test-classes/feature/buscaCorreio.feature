#language: pt
@tag
Funcionalidade: Criar um processo de autoamção que faça busca no site dos Correios

  @tagTeste
  Esquema do Cenario: Cenario: Busca no site dos Correios
    Dado que acesso o site "http://www.correios.com.br/"
    Quando informo o CEP "<cep>"
    Entao visualizo as informações do mesmo
  Exemplos:
      |cep	   |
      |18079324|