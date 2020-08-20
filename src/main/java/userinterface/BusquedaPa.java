package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BusquedaPa extends PageObject {



    public static final Target servicio=Target.the("seccion campo").located(By.xpath("//*[@id=\"menutop\"]/ul/li[3]/a"));
    public static final Target Infomacion=Target.the("Informacion Viajeros").located(By.xpath("//*[@id=\"menutop\"]/ul/li[3]/ul/li[1]/a"));
    public static final Target objetos=Target.the("Informacion Viajeros").located(By.xpath("//*[@id=\"menutop\"]/ul/li[3]/ul/li[1]/ul/li[8]/a"));
    public static final Target texto=Target.the("Informacion Viajeros").located(By.xpath("//*[@id=\'content\']/div[1]/div/p[5]/a[2]"));
    public static final Target pdf=Target.the("Informacion Viajeros").located(By.xpath("//*[@id=\'title\']/span"));
    public static final net.serenitybdd.screenplay.targets.Target quienessomos= net.serenitybdd.screenplay.targets.Target.the("seccion campo").located(By.xpath("//*[@id=\"menutop\"]/ul/li[2]/a"));
    public static final net.serenitybdd.screenplay.targets.Target historia= net.serenitybdd.screenplay.targets.Target.the("seccion campo").located(By.xpath("//*[@id=\"content\"]/h2"));


    public  void metodo(){

        waitFor(5).second();

    }


}
