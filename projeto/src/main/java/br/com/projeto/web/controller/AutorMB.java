package br.com.projeto.web.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.projeto.domain.Autor;
import br.com.projeto.domain.AutorService;

@ManagedBean(name = "autorMB")
@SessionScoped
public class AutorMB {
	private List<Autor> autores;
	
	private Autor autor;

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void salvar(){
		AutorService.salvarAutor(autor);
	}
	
}
