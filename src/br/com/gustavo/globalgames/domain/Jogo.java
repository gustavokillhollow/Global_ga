package br.com.gustavo.globalgames.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_jogo")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String titulo;

	@Column
	private String genero;

	@Column
	private String classIndicativa;

	@Column
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
