package aula6.exceptions;

public class MinhaClasseQualquer {

	public void fazAlgumaCoisa() throws ErroValidacao {
		throw new ErroValidacao("Ocorreu um erro de validacao");
	}
}
