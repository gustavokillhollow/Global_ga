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
	private int classIndicativa;

	@Column
	private float precoDia;

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

	public int getClassIndicativa() {
		return classIndicativa;
	}

	public void setClassIndicativa(int classIndicativa) {
		this.classIndicativa = classIndicativa;
	}

	public float getPrecoDia() {
		return precoDia;
	}

	public void setPrecoDia(float precoDia) {
		this.precoDia = precoDia;
	}

	public void setId(int id) {


	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Jogo{" +
				"id=" + id +
				", titulo='" + titulo + '\'' +
				", genero='" + genero + '\'' +
				", classIndicativa=" + classIndicativa +
				", precoDia=" + precoDia +
				'}';
	}
}
