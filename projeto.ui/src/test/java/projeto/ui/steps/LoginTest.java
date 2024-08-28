package projeto.ui.steps;

import org.junit.Test;
import org.openqa.selenium.By;

import projeto.ui.executa.Executa;
import projeto.ui.metodos.Metodos;

public class LoginTest {
	
	Metodos metodo = new Metodos();
	
	By btnLogin = By.xpath("//input[@id='login-button']");
	By msgErro = By.xpath("//h3[@data-test='error']");

		
	@Test
	public void LoginBrancoTeste() {
		Executa.iniciarTeste();
		metodo.clicar(btnLogin);
		metodo.validarTexto(msgErro, "Epic sadface: Username is required");
		
	}

}
