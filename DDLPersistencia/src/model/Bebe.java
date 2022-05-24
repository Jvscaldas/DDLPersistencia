package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
public class Bebe {

	@Id
	@Column(name = "cpf_bebe", length = 11)
	@NotNull
	private String cpf;
	
	@Column(name = "nome_bebe", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "nascimento_bebe")
	@NotNull
	private LocalDate nascimento;
	
	@Column(name = "altura")
	@NotNull
	private float altura;
	
	@ManyToOne
	@JoinColumn(name = "id_mae")
	@NotNull
	private Mae mae;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}

	@Override
	public String toString() {
		return "Bebe [cpf=" + cpf + ", nome=" + nome + ", nascimento=" + nascimento + ", altura=" + altura + ", mae="
				+ mae + "]";
	}

}
