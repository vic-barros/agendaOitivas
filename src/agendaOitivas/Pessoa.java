package agendaOitivas;

import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private TipoPessoa tipoDePessoa;
	
	
	public Pessoa(String nome, String cpf, TipoPessoa tipoDePessoa) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipoDePessoa = tipoDePessoa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public TipoPessoa getTipoDePessoa() {
		return tipoDePessoa;
	}


	public void setTipoDePessoa(TipoPessoa tipoDePessoa) {
		this.tipoDePessoa = tipoDePessoa;
	}


	@Override
	public String toString() {
		return "NOME = " + nome + " CPF = " + cpf + " PARTE = " + tipoDePessoa + "";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, tipoDePessoa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome) && tipoDePessoa == other.tipoDePessoa;
	}
	
	
	

}
