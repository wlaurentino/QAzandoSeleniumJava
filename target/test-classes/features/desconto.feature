# language: en

  @desconto
Feature: : Receber o cupom desconto da qazando
  Eu como usuário da qazando
  quero receber um cupom de desconto
  para comprar um curso com valor reduzido

  @gerar-cupom
  Scenario: : Visualizar código de desconto
    Given que estou no site da qazando
    When eu preencho meu e-mail
    When clico em ganhar cupom
    Then eu vejo o código de desconto

    @teste-falha
    Scenario: Teste com falha
      Given que tenho cupom gerado
      When eu falho