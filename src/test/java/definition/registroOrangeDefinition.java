package definition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageobjects.registroOrangePage;

public class registroOrangeDefinition {

    registroOrangePage orange;

    public registroOrangeDefinition() {
        orange = new registroOrangePage();
    }

    @Dado("que la web esta disponible para orange")
    public void queLaWebEstaDisponibleParaOrange() {
        hooks.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals("OrangeHRM", hooks.driver.getTitle());
    }


    @Cuando("ingrese el usuario {string}")
    public void ingreseElUsuario(String usuario) {
        orange.ingresoUsuario(usuario);
    }

    @Y("Ingrese la contraseña {string}")
    public void ingreseLaContraseña(String pass) {
        orange.ingresoPassword(pass);
    }

    @Y("hago click en el boton login")
    public void hagoClickEnElBotonLogin() throws InterruptedException {
        orange.clickEnLogin();

    }

    @Entonces("valido la seccion dashboard")
    public void validoLaSeccionDashboard() {
       Assert.assertEquals("Dashboard", hooks.driver.findElements(By.xpath("//span[text()='Dashboard']")));
    }

    @Y("doy click en el boton PIM")
    public void doyClickEnElBotonPIM() throws InterruptedException  {
        orange.clickBotonPim();

    }

    @Entonces("doy click la seccion agregar empleado")
    public void doyClickLaSeccionAgregarEmpleado() {
        orange.clickBotonSeccionAgregarEmpleado();
    }

    @Y("ingreso primer {string}")
    public void ingresoPrimer(String name) {
        orange.setTxtIngresarFirstName(name);
    }

    @Y("ingreso segundo {string}")
    public void ingresoSegundo(String name) {
        orange.setTxtIngresarMiddleName(name);
    }

    @Y("ingreso apellido {string}")
    public void ingresoApellido(String name) {
        orange.setTxtIngresarLastName(name);
    }

    @Y("doy click en boton para agregar detalle de logeo")
    public void doyClickEnBotonParaAgregarDetalleDeLogeo() {
    }
}