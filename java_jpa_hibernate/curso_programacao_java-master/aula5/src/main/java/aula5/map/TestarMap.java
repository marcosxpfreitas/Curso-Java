package aula5.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import aula5.pessoa.Pessoa;

public class TestarMap {

	public static void main(String[] args) {
		Map<String, Pessoa> pessoasPorCPF = new HashMap<>();
		pessoasPorCPF.put("0", new Pessoa("Juquinha", "0"));
		pessoasPorCPF.put("1", new Pessoa("Julia", "1"));
		pessoasPorCPF.put("2", new Pessoa("Marina", "2"));
		pessoasPorCPF.put("3", new Pessoa("Suzan", "3"));
		pessoasPorCPF.put("0", new Pessoa("Jose", "0"));

		System.out.println("pessoasPorCPF.size: " + pessoasPorCPF.size());
		System.out.println("pessoasPorCPF.containsKey(10): " + pessoasPorCPF.containsKey("10"));
		System.out.println("pessoasPorCPF.containsKey(0): " + pessoasPorCPF.containsKey("0"));
		
		Pessoa pessoa = pessoasPorCPF.get("3");
		System.out.println("chave 3: " + pessoa.getNome());
		System.out.println("chave 20: " + pessoasPorCPF.get("20"));
		
		Set<Entry<String,Pessoa>> entrySet = pessoasPorCPF.entrySet();
		for (Entry<String, Pessoa> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue().getNome());
		}
		
	}
}
