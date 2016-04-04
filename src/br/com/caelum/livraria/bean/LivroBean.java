package br.com.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

/**
 * @author Doug
 *
 */
@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public void gravar() {
		System.out.println("Gravando Livro "+ this.livro.getTitulo());
	}

}
