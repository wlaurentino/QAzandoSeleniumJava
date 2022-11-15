package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/index.html"},
        features = "src/test/resources/features",
//        tags = "~@ignore", // descomentar se quiser usar tags
        glue = {"steps"}
)

// mvn test cluecumber-report:reporting -Dtest="RunCucumberTest" // no terminal
// ajustando

public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();
        System.out.println("Iniciou");

    }

    @AfterClass
    public static void stop(){
        System.out.println("Finalizou");
        driver.quit();

    }

};
