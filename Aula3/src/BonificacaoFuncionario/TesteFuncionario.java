package BonificacaoFuncionario;

import javax.swing.JOptionPane;

public class TesteFuncionario {
	public static void main(String args[]){
		Funcionarios marcos = new Funcionarios("marcos", 2000.00, "programador java",4);
		
		marcos.setSalario(2000.50);
		marcos.setBonificacao(3);
		
		
		
		JOptionPane.showMessageDialog(null, "Salario atual "+marcos.getSalario());
		JOptionPane.showMessageDialog(null, "Bonificação atual "+marcos.getBonificacao());
		
	}

}
