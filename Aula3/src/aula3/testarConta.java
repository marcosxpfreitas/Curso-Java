package aula3;

public class testarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1500.00);
		conta1.depositar(1500.00);
		
		if(conta1.sacar(200.00)==false){
			System.out.println("Saldo Insuficiente");
		}else
			System.out.println("Saque efetuado com sucesso");
		
		
		System.out.println("Saldo atual "+conta1.obterSaldo());
		

	}

}
