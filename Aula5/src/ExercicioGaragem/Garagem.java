package ExercicioGaragem;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import aula5.list.Pessoa;

public class Garagem  {
	List<Veiculo> veiculos= new ArrayList<Veiculo>();
	
	public void adicionarCarro(Veiculo veiculo){
		veiculos.add(veiculo);
	}
	
	public List<Veiculo> listarVeiculos(){
		return veiculos;
	}
	public boolean venderCarro(String placa){
		for(Veiculo v : this.listarVeiculos()) {
			if(v.getPlaca().equals(placa)){
				veiculos.remove(v);
				return true;
			}
		}
		return false;

	}
	public boolean buscarCarro(String placa){
		for(Veiculo v: this.listarVeiculos()){
			if(v.getPlaca().equals(placa)){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	

}
