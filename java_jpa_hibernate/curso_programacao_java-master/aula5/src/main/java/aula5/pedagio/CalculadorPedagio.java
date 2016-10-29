package aula5.pedagio;

public class CalculadorPedagio {

	private double valorPorEixo;

	public CalculadorPedagio(double valorPorEixo) {
		this.valorPorEixo = valorPorEixo;
	}

	// public double calcular(Veiculo veiculo) {
	// if (veiculo instanceof PagaPedagio) {
	// PagaPedagio pagaPedagio = (PagaPedagio) veiculo;
	// return valorPorEixo * pagaPedagio.getQuantidadeEixos();
	// }
	// return 0;
	// }
	 public double calcular(PagaPedagio pagaPedagio) {
	 return valorPorEixo * pagaPedagio.getQuantidadeEixos();
	 }
}
