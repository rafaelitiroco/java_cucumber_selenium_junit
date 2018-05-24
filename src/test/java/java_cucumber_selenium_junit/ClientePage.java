package java_cucumber_selenium_junit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClientePage extends ClienteElementMap{
	
	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void InformarDadosIdentificacaoPF() {
		fisica.click();
		cpf_cnpj.sendKeys("837.623.723-30");
		nome_razaosocial.sendKeys("Automação");
		email.sendKeys("automacao@teste.com.br");
		data_nascimento.sendKeys("02/01/1990");
		
		Select cmbSexo = new Select(sexo);
		cmbSexo.selectByVisibleText("Masculino");
		
		Select cmbEstadoCivil = new Select(estado_civil);
		cmbEstadoCivil.selectByVisibleText("Solteiro");
	}

	public void clicarAvacar() {
		avancar.click();
		
	}

	public void informarEnderecos() {
		//Endereco Principal
		endp_cep.sendKeys("98765-432");
		endp_endereco.sendKeys("Rua da Automação");
		endp_numero.sendKeys("12");
		endp_complemento.sendKeys("Bloco Z");
		endp_cidade.sendKeys("São Paulo");
		Select cmbEstadoEndPrincipal = new Select(endp_estado);
		cmbEstadoEndPrincipal.selectByVisibleText("SP");
		endp_telefone.sendKeys("11 4567-8912");
		endp_celular.sendKeys("11 98765-4321");
		
		//Endereco de Cobranca
		endc_cep.sendKeys("78945-123");
		endc_endereco.sendKeys("Rua do Teste");
		endc_numero.sendKeys("39");
		endc_complemento.sendKeys("Conj 950");
		endc_cidade.sendKeys("São Caetano do Sul");
		Select  cmbEstadoEndCobranca = new Select(endc_estado);
		cmbEstadoEndCobranca.selectByVisibleText("SP");
		endc_telefone.sendKeys("11 4561-4561");
		endc_celular.sendKeys("11 78945-6123");
		
	}

	public void clicarSalvar() {
		salvar.click();		
	}

	public void verificarMensagemSucesso() {
		// TODO Auto-generated method stub
		
	}

	public void efetuarLogout() {
		// TODO Auto-generated method stub
		
	}


}
