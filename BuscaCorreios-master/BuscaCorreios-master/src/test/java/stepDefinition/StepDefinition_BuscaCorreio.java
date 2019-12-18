package stepDefinition;

import PageObject_BuscaCorreio.BuscaCorreio_Page;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class StepDefinition_BuscaCorreio {

    BuscaCorreio_Page pageBuscaCorreio = new BuscaCorreio_Page();


    @Quando("^informo o CEP \"([^\"]*)\"$")
    public void informo_o_CEP(String cep) throws Throwable {
        pageBuscaCorreio.getInputCep().sendKeys(cep);
        pageBuscaCorreio.getBtnBusca().click();
    }

    @Entao("^visualizo as informações do mesmo$")
    public void visualizo_as_informações_do_mesmo() throws Throwable {
        Assert.assertEquals("DADOS ENCONTRADOS COM SUCESSO.", "DADOS ENCONTRADOS COM SUCESSO.");
    }
}
