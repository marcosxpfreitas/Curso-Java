package aula3;

public class Conta {
	private double saldo=0;
	

	Conta (double saldo){
		this.saldo=saldo;
			
	}
	public boolean sacar(double valor){
		
		if (valor>saldo){
			return false;
		}else{
			saldo= saldo-valor;
			return true;
		}
	}
	public void depositar(double valor){
		saldo+=valor;
	}
	public double obterSaldo(){
		return saldo;
	}


}

