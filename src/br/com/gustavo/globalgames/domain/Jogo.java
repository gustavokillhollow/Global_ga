package br.com.gustavo.globalgames.domain;

public class Jogo {
	private String titulo;
	private String genero;
	private String classIndicativa;
	private String precoDia;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClassIndicativa() {
		return classIndicativa;
	}

	public void setClassIndicativa(String classIndicativa) {
		this.classIndicativa = classIndicativa;
	}

	public String getPrecoDia() {
		return precoDia;
	}

	public void setPrecoDia(String precoDia) {
		this.precoDia = precoDia;
	}

}
