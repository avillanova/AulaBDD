package pom;


import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.Hook;
import util.PAGES;
import util.Tools;


public class Fluxo1Page extends PageMain {

    @FindBy(how = How.XPATH, using = "//input[@aria-label='Nome']")
    private WebElement txtNome;
    @FindBy(how= How.XPATH, using = "//div[@aria-labelledby='i4']//div[@aria-label='Resposta correta']")
    private WebElement radioRespostaCorreta;
    @FindBy(how = How.XPATH, using = "//div[@aria-label='Sua segunda pergunta?']")
    private WebElement segundaPergunta;

    public Fluxo1Page(){
        PageFactory.initElements(Hook.getDriver(), this);
    }


    public void preenchoNome(String arg0) {
        Tools.waitBy(txtNome).sendKeys(arg0);
    }

    public void selectRespostaCorreta(){
        Tools.waitBy(radioRespostaCorreta).click();
    }
    public void selectXY(String coluna, String linha){
        segundaPergunta.findElement(By.xpath("//div[@role='checkbox' and @aria-label='Coluna "+coluna+", resposta para Linha "+linha+"']")).click();

    }

    public void accessPage() {
        Hook.getDriver().get(String.valueOf(PAGES.FLUXO_1));
    }


}
