package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

@Entity
@Table(name = "mae")
public class Mae {

	@Id
	@Column(name = "cpf_mae", length = 11)
	@NotNull
	private String cpf;
	
	@Column(name = "nome_mae", length = 60)
	@NotNull
	private String nome;
	
	@Column(name = "logradouro_endereco", length = 100)
	@NotNull
	private String logradouro;
	
	@Column(name = "numero_endereco")
	@NotNull
	private int numero;
	
	@Column(name = "cep_endereco", length = 8)
	@NotNull
	private String cep;
	
	@Column(name = "complemento_endereco", length = 200)
	@Null
	private String complemento;
	
	@Column(name = "telefone", length = 10)
	@NotNull
	private String telefone;
	
	@Column(name = "nascimento_mae")
	@NotNull
	private LocalDate nascimento;

	public String getCpf() {
		return cpf;
	}

	public void setId(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Mae [cpf=" + cpf + ", nome=" + nome + ", logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep
				+ ", complemento=" + complemento + ", telefone=" + telefone + ", nascimento=" + nascimento + "]";
	}

}
