package pedagio;
	
public class CalculadorPedagio {
	 static final double EIXO2 = 4.00;
	 static final double EIXO4 = 7.00;
	 static final double EIXO8 = 10.00;
	 
	 public double Calcular(PagaPedagio pagaPedagio){
		 if(pagaPedagio.QuantidadeEixos()==1){
			 return EIXO2;
		 }else if(pagaPedagio.QuantidadeEixos()==2){
			 return EIXO4;
		 }else{
			 return EIXO8;
		 }
	 }

}
