package com.dextraining.garagem.dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dextraining.garagem.dominio.veiculo.Veiculo;
import com.dextraining.garagem.dominio.veiculo.VeiculoComparator;
import com.dextraining.garagem.exception.VeiculoDuplicadoException;
import com.dextraining.garagem.exception.VeiculoNaoEncontradoException;

public class GaragemComArquivoCSV implements Garagem {
	private static final String ARQUIVO = "/home/java01/veiculos.csv";

	@Override
	public void adicionar(Veiculo veiculo) {
		Veiculo veiculoEncontrado = buscar(veiculo.getPlaca());
		if (veiculoEncontrado != null) {
			throw new VeiculoDuplicadoException();
		}
		salvarNoArquivo(veiculo, true);
	}

	private void salvarNoArquivo(List<Veiculo> veiculos) {
		limparConteudoArquivo();

		for (Veiculo veiculo : veiculos) {
			salvarNoArquivo(veiculo, true);
		}
	}

	private void limparConteudoArquivo() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
			writer.write("");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void salvarNoArquivo(Veiculo veiculo, boolean append) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, append))) {
			writer.write(veiculo.getMarca());
			writer.write(";");
			writer.write(veiculo.getModelo());
			writer.write(";");
			writer.write(veiculo.getPlaca());
			writer.write(";");
			writer.write(String.valueOf(veiculo.getAno()));
			writer.write(";");
			writer.write(String.valueOf(veiculo.getPreco()));
			writer.newLine();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void vender(String placa) {
		List<Veiculo> veiculos = listar();

		for (Veiculo veiculo : veiculos) {
			if (veiculo.getPlaca().equals(placa)) {
				veiculos.remove(veiculo);
				salvarNoArquivo(veiculos);
				break;
			}
		}
		throw new VeiculoNaoEncontradoException();
	}

	@Override
	public Veiculo buscar(String placa) {
		for (Veiculo veiculo : listar()) {
			if (veiculo.getPlaca().equals(placa)) {
				return veiculo;
			}
		}
		return null;
	}

	@Override
	public List<Veiculo> listar() {
		List<Veiculo> veiculos = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
			String linha = null;
			while ((linha = reader.readLine()) != null) {
				String campos[] = linha.split(";");
				String marca = campos[0];
				String modelo = campos[1];
				String placa = campos[2];
				int ano = Integer.valueOf(campos[3]);
				double preco = Double.valueOf(campos[4]);

				veiculos.add(new Veiculo(marca, modelo, placa, ano, preco));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		Collections.sort(veiculos, new VeiculoComparator());
		return veiculos;
	}
}