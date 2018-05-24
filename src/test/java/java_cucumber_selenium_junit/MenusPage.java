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
		// obtém a altura da página interna
		long intAlturaPagina = (Long) ((JavascriptExecutor) TestRule.getDriver())
				.executeScript("return document.documentElement.clientHeight");
		
		// obtém a altura da janela (browser)
		int intAlturaJanela = TestRule.getDriver().manage().window().getSize().height;
		
		// obtém a diferença de altura entre janela e página
		int intDiferencaAltura = intAlturaJanela - (int) intAlturaPagina;
		
		// obtém as coordenadas relativas do objeto
		int intCoordXElemento = elemento.getLocation().getX();
		int intCoordYElemento = elemento.getLocation().getY();
		
		// move para a posição esperada do objeto
		int intCoordXEsperada = intCoordXElemento;
		int intCoordYEsperada = intCoordYElemento + intDiferencaAltura;
		Robot robot = new Robot();
		robot.mouseMove(intCoordXEsperada, intCoordYEsperada);
	}
	
}
