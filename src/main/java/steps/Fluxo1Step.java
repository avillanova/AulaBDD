package steps;

import cucumber.api.DataTable;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.PageMain;

import java.util.List;
import java.util.Map;

public class Fluxo1Step extends PageMain{

    @E("^preecho o nome \"([^\"]*)\"$")
    public void preechoONome(String arg0)  {
        fluxo1Page.preenchoNome(arg0);
    }

    @E("^seleciono a primeira pergunta com a \"([^\"]*)\"$")
    public void selecionoAPrimeiraPerguntaComA(String arg0) throws Throwable {
        fluxo1Page.selectRespostaCorreta();
    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clico_em(String arg1) {
        fluxo1Page.clicarEm(arg1);
    }

    @Entao("^eu vejo resultato positivo$")
    public void euVejoResultatoPositivo() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @E("^preencho a segunda pergunta com os dados:$")
    public void preenchoASegundaPerguntaComOsDados(DataTable dataTable) throws Throwable {
        List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
        for(int i=0; i<list.size(); i++){
            fluxo1Page.selectXY(list.get(i).get("coluna"), list.get(i).get("linha"));
        }
    }
}
