import java.util.ArrayList;
import java.util.List;

import ExercicioGaragem.Veiculo;


public class GeradorSenha {
	int IdososAtendidos=0;;
	int Atendidos=0;
	int contFila=0;
	int contFilaP=0;
	List<Integer> fila = new ArrayList<>();
	List<Integer> filaPreferencial = new ArrayList();
	
	
	public String gerarSenhaIdoso(){
		contFila++;
		fila.add(contFila);
		return "Senha idoso nº"+contFila;
	}
	public String gerarSenhaPadrao(){
		contFilaP++;
		filaPreferencial.add(contFilaP);
		return "Senha normal nº"+contFilaP;
	}
	public String chamarSenha(){
		
			
	}
	
}
