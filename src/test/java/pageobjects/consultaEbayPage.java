package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class consultaEbayPage extends util {

    @FindBy(xpath = "//input[@id='gh-ac']")
    protected WebElement txtBuscar;


    public consultaEbayPage() { PageFactory.initElements(driver, this);
    }

    public void doyClickEnCuadroDeTexto(){
        wait.until(ExpectedConditions.visibilityOf(txtBuscar));
        txtBuscar.click();
    }

    public void ingresoTextoArticulo(String articulo){
        wait.until(ExpectedConditions.visibilityOf(txtBuscar));
        txtBuscar.sendKeys(articulo);
    }
}

