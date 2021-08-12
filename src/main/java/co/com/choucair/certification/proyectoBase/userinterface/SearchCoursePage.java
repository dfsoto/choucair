package co.com.choucair.certification.proyectoBase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("select university choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("search the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search the course").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Click to search the course").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("name of the course").located(By.xpath("//h1[contains(text(),'Recursos Automatizacion Bancolombia')]"));
}
