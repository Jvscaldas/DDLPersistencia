package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente extends Medico {

	@Column(name = "instituicao_ensino", length = 50)
	@NotNull
	private String instituicao;

	@Column(name = "ano_ingresso")
	@NotNull
	private int anoIngresso;

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	@Override
	public String toString() {
		return "Residente [instituicao=" + instituicao + ", anoIngresso=" + anoIngresso + "]";
	}

}
