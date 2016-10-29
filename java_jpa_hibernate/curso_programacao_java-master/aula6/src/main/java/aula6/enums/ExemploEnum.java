package aula6.enums;

import java.util.ArrayList;
import java.util.List;

public class ExemploEnum {

	public static void main(String[] args) {
		exemploManipulacaoIndices();
		exemploComLista();
		exemploComparacaoComIgualIgual();
		exemploTelefone();
		exemploSwitch();
	}

	private static void exemploManipulacaoIndices() {
		TipoPecaXadrez[] values = TipoPecaXadrez.values();
		TipoPecaXadrez primeiro = TipoPecaXadrez.fromIndex(0);
		System.out.println("Elemento: " + primeiro);
	}

	private static void exemploComparacaoComIgualIgual() {
		TipoPecaXadrez tipo = TipoPecaXadrez.valueOf("CAVALO");
		System.out.println("==" + (tipo == TipoPecaXadrez.CAVALO));
	}

	private static void exemploComLista() {
		List<PecaXadrez> pecas = new ArrayList<>();
		pecas.add(new PecaXadrez(TipoPecaXadrez.CAVALO));
		pecas.add(new PecaXadrez(TipoPecaXadrez.BISPO));
		pecas.add(new PecaXadrez(TipoPecaXadrez.REI));

		for (PecaXadrez pecaXadrez : pecas) {
			System.out.print(pecaXadrez.getTipoPecaXadrez() + ": ");
			System.out.println(pecaXadrez.getTipoPecaXadrez()
					.getTipoMovimento());
		}
	}

	private static void exemploTelefone() {
		Telefone telefone = new Telefone();
		telefone.setNumero("55 67 97878 8787");
		telefone.setTipo(TipoTelefone.COMERCIAL);
	}

	private static void exemploSwitch() {
		TipoPecaXadrez meuTipo = TipoPecaXadrez.BISPO;
		switch (meuTipo) {
		case CAVALO:
			System.out.println("Cavalo");
			break;
		case BISPO:
			System.out.println("Bispo");
			break;
		default:
			break;
		}
	}
}
