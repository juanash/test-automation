package co.com.choucair.certification.testuser.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class TestSearchPage extends PageObject {
    public static final Target UC_BUTTON = Target.the("selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar curso").located(By.id("coursesearchbox"));
    public static final Target GO_BUTTON = Target.the("da click para buscar").located(By.id("//button[@class='btn btn secondary']"));
    public static final Target SELECT_COURSE = Target.the("da click para buscar").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));

}
