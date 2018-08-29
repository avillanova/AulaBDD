package pom;

import util.Hook;
import util.PAGES;

public class Fluxo2Page extends PageMain{

    public void accessPage() {
        Hook.getDriver().get(String.valueOf(PAGES.FLUXO_2));
    }
}
