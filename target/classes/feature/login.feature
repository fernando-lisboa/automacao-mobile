#language: pt
#Author: FERNANDO LISBOA - Sep,2018
#Review: FILIPE SANTOS - Nov 01,2018

Funcionalidade: Efetuar Login inicial
  
  #COMO usuário do app Go in
  #EU acessar como usuário
  #PARA utilizar os recursos do app

	
@tag01
  Esquema do Cenario: Login com e sem sucesso
  	Dado que o Emulador esta disponivel com app sem dados
  	E que abri o app em Android
    Quando inserir o usuario "<e-mail>" e senha "<senha>"
    E clicar em entrar
    Entao verifico se foi autentidado como "<status>"
    Exemplos: 
    | DescricaoDoCenario                                | e-mail                   | senha    | status   |
    | Logar no app com usuário e senha válido           | filsantos1984@gmail.com  | filipe   | VALIDO   |
    | Logar no app com usuário válido e senha invalida  | filsantos1984@gmail.com  | Usuario1 | INVALIDO |
    | Logar no app com usuário invalido e senha válida  | usuario10@goin.com.br    | filipe   | INVALIDO |
    | Logar no app com usuário em branco e senha válida |                          | filipe   | INVALIDO |
    | Logar no app com usuário válido e senha em branco | filsantos1984@gmail.com  |          | INVALIDO |
    | Logar no app com usuário e senha invalido         | usuario10@goin.com.br    | Usuario1 | INVALIDO |
    | Logar no app com usuário e senha em branco        |                          |          | INVALIDO |
    
