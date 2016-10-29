package aula4.equipamento;

public class TestarEquipamentos {

	public static void main(String[] args) {
		Equipamento cadeira = new Equipamento("cadeira", 50);
		Equipamento televisao = new Televisao("Sony", 1500);
		Equipamento impressora = new Impressora("Hp", 500);

		mostrarPrecos(cadeira, televisao, impressora);
	}

	private static void mostrarPrecos(Equipamento... equipamentos) {
		for (Equipamento equipamento : equipamentos) {
			System.out.println(equipamento.getClass().getSimpleName() + " :" + equipamento.calcularPrecoFinal());
		}
	}
}
