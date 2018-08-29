package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pom.PageMain;


public class GeneralStep extends PageMain{




	@Dado("^que acesso a pagina \"([^\"]*)\"$")
	public void que_acesso_a_pagina(String pagina) {
		if(pagina.equals("Fluxo 1")){
			fluxo1Page.accessPage();
		}else{
			fluxo2Page.accessPage();
		}

	}
	
	@Entao("^vejo a tela \"([^\"]*)\"$")
	public void vejo_a_tela(String arg1) {
		System.out.println("selecionei"+arg1);
	}


	
}
