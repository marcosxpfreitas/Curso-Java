package ExercicioFolhaPagamentos;

import equipamento.Equipamento;

public class Teste {

	public static void main(String[] args) {
		FolhaPagamento x = new FolhaPagamento();
		Funcionario marcos = new Supervisor("Marcos",9000.00);
		Funcionario maMylove = new Supervisor("Marcella",5000.00);
		Funcionario  jeffersom = new Secretaria("Jefferson",1003.00);
		
		x.Calcular(marcos,maMylove,jeffersom);
		
		
	}
	
	
}
