package aula5.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import aula5.list.Pessoa;

public class TestarMap {

	public static void main(String[] args) {
		Map<String, Pessoa> pessoasPorCPF= new HashMap<>();
		pessoasPorCPF.put("0", new Pessoa("Juquinha","0"));
		pessoasPorCPF.put("1", new Pessoa("Renan","1"));
		pessoasPorCPF.put("2", new Pessoa("Olalvo","2"));
		pessoasPorCPF.put("0", new Pessoa("Mesquita","5"));

		System.out.println("Pessoas por cpf size"+ pessoasPorCPF.size());
		System.out.println("Pessoas por containskey "+ pessoasPorCPF.containsKey("0"));
		System.out.println("Pessoas por containskey "+ pessoasPorCPF.containsKey("10"));
		
		
		//Achar o fera
		Pessoa pessoa = pessoasPorCPF.get("2");
		System.out.println("Chave 3:"+ pessoa.getNome());
		
		Set<Entry<String,Pessoa>> entrySet = pessoasPorCPF.entrySet();
		for(Entry<String,Pessoa> EntrySet : entrySet){
			System.out.println(entry.getKey() + ": "+ entry.getValue);
		}
		
	}

}
