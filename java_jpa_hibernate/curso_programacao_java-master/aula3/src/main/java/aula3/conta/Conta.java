package aula3.conta;

public class Conta {

	private double saldo;

	public Conta() {
		this.saldo = 0;
	}

	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}
}
