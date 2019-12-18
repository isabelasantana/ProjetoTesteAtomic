package PageObject_BuscaCorreio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pctCore.DriverFactory.getDriver;

public class BuscaCorreio_Page {

    private WebElement inputCep = getDriver().findElement(By.id("acesso-busca"));
    private WebElement btnBusca = getDriver().findElement(By.xpath("//input[@id='acesso-busca']/following-sibling::button[@class='bt-link-ic']/i[@class='ic-busca-out']"));

    public BuscaCorreio_Page() {
    }

    public BuscaCorreio_Page(WebElement inputCep, WebElement btnBusca) {
        this.inputCep = inputCep;
        this.btnBusca = btnBusca;
    }

    public WebElement getInputCep() {
        return inputCep;
    }

    public WebElement getBtnBusca() {
        return btnBusca;
    }
}
