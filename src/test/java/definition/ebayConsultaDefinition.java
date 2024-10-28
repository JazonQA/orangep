package definition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import pageobjects.consultaEbayPage;

import java.io.IOException;

public class ebayConsultaDefinition {

    consultaEbayPage ebay;

    public ebayConsultaDefinition() {
        ebay = new consultaEbayPage();
    }

    @Dado("que la web esta disponible para ebay peru")
    public void queLaWebEstaDisponibleParaEbayPeru() {
        hooks.driver.get("https://pe.ebay.com/");
        Assert.assertEquals("Artículos electrónicos, autos, ropa, objetos de colección, cupones y más | eBay", hooks.driver.getTitle());
    }

    @Cuando("doy click en textbox buscar")
    public void doyClickEnTextboxBuscar(){
        ebay.doyClickEnCuadroDeTexto();

    }

    @Y("ingreso un producto {string}")
    public void ingresoUnProducto(String articulo){
        ebay.ingresoTextoArticulo(articulo);
    }
}
