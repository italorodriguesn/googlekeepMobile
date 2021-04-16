#language: pt
#enconding: UTF-8

@manternota
Funcionalidade: Google keep

  Contexto: 
    Dado que eu aciono o get started

  @cenario1
  Cenario: Criar uma nota
    Quando eu acionar o botao takeanote
    E eu informar no campo title "Teste"
    E eu informar no campo note "Teste1"
    E eu acionar o botao voltar
    Entao o aplicativo cadastra a nota com titulo "Teste"

  @cenario2
  Cenario: Editar uma nota
    Quando eu acionar a nota
    E eu informar no campo title "Teste"
    E eu informar no campo note "Teste1"
    Entao o aplicativo cadastra a nota com titulo "Teste"
