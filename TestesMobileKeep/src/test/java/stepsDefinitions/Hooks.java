package stepsDefinitions;

//import teste.Calculadora;
import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
		@Before()
		public void setUp() throws Exception {
			acessarKeep();
			}
	
	@After 
		public void fecharCalculadora() {
			driver.quit();
		}
	
	
}
