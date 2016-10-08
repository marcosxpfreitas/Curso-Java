package equipamento;

public class TestarEquipamento {

	public static void main(String[] args) {
		Equipamento impressora = new Impressora("HP",500.00,40);
	
		Equipamento cadeira = new Cadeira("Madeira boa",200,"roxa");
		//System.out.println(cadeira);
		
		Equipamento tv1 = new Televisao("samsumg",1500, 40);
		//System.out.println(tv1);
		
		ImprimirPrecosFinais(impressora, cadeira, tv1);
		
	}
		public static double ImprimirPrecosFinais(Equipamento... equipamentos){
			double valorTotal=0;
			
			for(Equipamento equipamento : equipamentos){
				System.out.println(equipamento.getClass().getSimpleName()+":"+equipamento.calculaPrecoFinal());
			}
			
			return valorTotal;
			
		}
		
	
		
}


