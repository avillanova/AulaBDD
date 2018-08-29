#language: pt
#encoding: UTF-8
Funcionalidade: Exercicios 25/08 Fluxo 1

	@Fluxo1
	Cenario: Fluxo 1 - Preenchendo os campos
		Dado que acesso a pagina "Fluxo 1"
		E preecho o nome "NOME"
		E seleciono a primeira pergunta com a "Resposta Correta"
		E preencho a segunda pergunta com os dados:
		|coluna		|linha	|
		|1		 	|1		|
		|2			|2		|
		|1			|5		|
		|2			|2		|
		|2			|5		|
		|3			|3		|
		|4			|2		|
		|4			|4		|
		|5			|1		|
		|5 			|5		|
		E clico em "Enviar"
		E clico em "Ver pontuação"
		Entao eu vejo resultato positivo