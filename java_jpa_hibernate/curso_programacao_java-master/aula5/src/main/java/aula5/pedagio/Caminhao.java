package aula5.pedagio;

public class Caminhao extends Veiculo implements PagaPedagio {

	private int quantidadeEixos;

	public Caminhao(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;

	}

	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}
}
