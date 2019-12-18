package pctCore;

import cucumber.api.java.pt.Dado;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static pctCore.DriverFactory.getDriver;
import static pctCore.DriverFactory.killDriver;

public class BaseTest{

    @Rule
    public TestName testName = new TestName();

    @Before
    @Dado("^que acesso o site \"([^\"]*)\"$")
    public void que_acesso_o_site(String URL) throws Throwable {
        getDriver().get(URL);
    }

    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

        killDriver();
    }
}
