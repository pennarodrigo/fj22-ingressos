package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {

	// Horario Filme e Duracao

	private Integer id;
	private Filme filme;
	private Sala sala;
	private LocalTime horario;

	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

}
