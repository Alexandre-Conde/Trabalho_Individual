package br.org.serratec.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Embeddable
public class Publicacao {
	
	@NotBlank(message = "O Autor precisa ser adicionado")
	@Size(min = 2, max = 50, message = "Nome do Autor precisa ser entre {min} a {max} letras")
	@Column(nullable = false)
	private String autor;
	
	@Column
	private LocalDate dataPublicacao;
	
	@Column
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
