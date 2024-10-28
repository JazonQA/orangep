package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class registroOrangePage extends util {

    @FindBy(xpath = "//input[@name='username']")
    protected WebElement txtAdmin;

    @FindBy(xpath = "//input[@name='password']")
    protected WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement btnLogin;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    protected WebElement validarSeccionDashboard;

    @FindBy(xpath = "//span[text()='PIM']")
    protected WebElement btnPim;

    @FindBy(xpath = "//a[text()='Add Employee']")
    protected WebElement btnAgregarEmpleado;

    @FindBy(xpath = "//input[@name='firstName']")
    protected WebElement txtIngresarFirstName;

    @FindBy(xpath = "//input[@name='middleName']")
    protected WebElement txtIngresarMiddleName;

    @FindBy(xpath = "//input[@name='lastName']")
    protected WebElement txtIngresarLastName;

    @FindBy(xpath = "//div[@class='oxd-switch-wrapper'] //span")
    protected WebElement swithCreateLogin;




    public registroOrangePage() {
        PageFactory.initElements(driver, this);
    }

    public void ingresoUsuario(String usuario) {
        wait.until(ExpectedConditions.visibilityOf(txtAdmin));
        txtAdmin.sendKeys(usuario);
    }

    public void ingresoPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(pass);
    }

    public void clickEnLogin() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        btnLogin.click();
        Thread.sleep(6000);
    }

    public void validarSeccionDashboard() {
        wait.until(ExpectedConditions.visibilityOf(validarSeccionDashboard));
        validarSeccionDashboard.getText();

    }

    public void clickBotonPim() throws InterruptedException  {
        wait.until(ExpectedConditions.visibilityOf(btnPim));
        btnPim.click();
        Thread.sleep(2000);
    }

    public void clickBotonSeccionAgregarEmpleado() {
        wait.until(ExpectedConditions.visibilityOf(btnAgregarEmpleado));
        btnAgregarEmpleado.click();

    }

    public void setTxtIngresarFirstName(String name) {
        wait.until(ExpectedConditions.visibilityOf(txtIngresarFirstName));
        txtIngresarFirstName.sendKeys(name);

    }

    public void setTxtIngresarMiddleName(String name) {
        wait.until(ExpectedConditions.visibilityOf(txtIngresarMiddleName));
        txtIngresarMiddleName.sendKeys(name);

    }

    public void setTxtIngresarLastName(String name) {
        wait.until(ExpectedConditions.visibilityOf(txtIngresarLastName));
        txtIngresarLastName.sendKeys(name);

    }

    public void clickSeccionDetalleLogeo(){
        wait.until(ExpectedConditions.visibilityOf(swithCreateLogin));
        swithCreateLogin.click();
    }


}
