package java_cucumber_selenium_junit;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MenusPage extends MenusElementMap{
	
	public MenusPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	public void acessarMenuClientesInserir() throws Exception {
		Actions actions = new Actions(TestRule.getDriver());
		actions.moveToElement(menuClientes);
		actions.moveToElement(submenuClientesInserir);
		actions.click().build().perform();
	}	

	private void moverMouseSobreElemento(WebElement elemento) throws Exception {
		// obt�m a altura da p�gina interna
		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");
		
		// obt�m a altura da janela (browser)
		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;
		
		// obt�m a diferen�a de altura entre janela e p�gina
		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;
		
		// obt�m as coordenadas relativas do objeto
		int intCoordXElemento = elemento.getLocation().getX();
		int intCoordYElemento = elemento.getLocation().getY();
		
		// move para a posi��o esperada do objeto
		int intCoordXEsperada = intCoordXElemento;
		int intCoordYEsperada = intCoordYElemento + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
	}
	
}
