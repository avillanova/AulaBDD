#language: pt
#encoding: UTF-8
Funcionalidade: Exercicios 25/08 - Fluxo 2

	@Fluxo2
	Esquema do Cenario: Fluxo 2 - Preencher cadastro <Resultado>
		Dado que acesso a pagina "Fluxo 2"
		Quando em multipla escolha seleciono a opcao <Multipla Escolha>
#       E em Caixa de selecao seleciono a opcao <Caixa de Selecao>
#		E em Escala Linear seleciono a opcao <Escala Linear>
#		E em Grade multipla escolha seleciono coordenadas:
#		 |coor1|<coor1>|
#		 |coor2|<coor1>|
#		 |coor3|<coor1>|
#		 |coor4|<coor1>|
#		 |coor5|<coor1>|
#		E em Grade de caixa de selecao - <Grade de caixas>
#		E clico em "Proximo"
#		Entao vejo a tela "Fluxo 3 - pagina 2"
#		Quando preencho a data
#		E preencho a hora
#		E em Lista suspensa seleciono a ultima opcao
#		E clico em "Enviar"
		Entao vejo a tela "pontuacao"
#		Quando clico em "Ver Pontua��o"
#		Entao vejo o resultado "<Resultado>"
		Exemplos:
			|Multipla Escolha	|Caixa de Selecao|Escala Linear|coor1 |coor2 |coor3	 |coor4  |coor5  |Grade de caixas|Resultado|
			|1								|2							 |3						 |1x1		|1x2	 |2x2    |3x3		 |4x4    |3    					 |Invalido |
			|4								|5							 |6						 |1x2		|6x6   |7x7    |8x8    |9x9 	 |7							 |Valido	 |
#

