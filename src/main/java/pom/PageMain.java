package pom;

import org.openqa.selenium.By;
import util.Hook;

public class PageMain {
    public static final Fluxo1Page fluxo1Page = new Fluxo1Page();
    public static final Fluxo2Page fluxo2Page = new Fluxo2Page();

    public void clicarEm(String botao){
        Hook.getDriver().findElement(By.xpath("//span[text()='"+botao+"']")).click();
    }
}
