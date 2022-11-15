package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage    homePage = new HomePage(driver);

    @Given("^que estou no site da qazando")
    public void acessar_site_qazando(){
        homePage.acessarAplicacao();
  }
    @When("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencheEmail();
    }

    @When("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
        homePage.clickGanharDesconto();

    }

    @When("que tenho cupom gerado")
    public void queTenhoCupomGerado() {
        driver.findElement(By.id("buttonXX")).click();
    }

    @Then("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto(){
        homePage.verificarCupomDesconto();
    }

}
