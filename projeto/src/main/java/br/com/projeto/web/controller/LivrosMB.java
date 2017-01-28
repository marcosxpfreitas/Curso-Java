package br.com.projeto.web.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.projeto.domain.Livro;
import br.com.projeto.domain.LivroService;

@ManagedBean(name = "livroMB")
@SessionScoped
public class LivrosMB {
	private List<Livro> livros;
	
	private Livro livro;

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String salvar(){
		LivroService.salvarLivro(livro);
		return "listagem?faces-redirect=true";
	}
	
	

}
