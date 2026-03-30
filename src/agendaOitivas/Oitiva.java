package agendaOitivas;

public class Oitiva {
	private Pessoa pessoaIntimada;
	private ProcedimentoPolicial procedimento;
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private StatusOitiva status;
	private String observacao;
	
	public Oitiva(Pessoa pessoaIntimada, ProcedimentoPolicial procedimento,
			int dia, int mes, int ano, int hora, int minuto, String observacao) {
		this.pessoaIntimada = pessoaIntimada;
		this.procedimento = procedimento;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.observacao = observacao;
		this.status = StatusOitiva.PENDENTE;
	}

	public Pessoa getPessoaIntimada() {
		return pessoaIntimada;
	}

	public ProcedimentoPolicial getProcedimento() {
		return procedimento;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public StatusOitiva getStatus() {
		return status;
	}

	public String getObservacao() {
		return observacao;
	}
	
	public void setStatus(StatusOitiva status) {
		this.status = status;
	}
	
	 @Override
	    public String toString() {
	        return "Oitiva | " + dia + "/" + mes + "/" + ano
	             + " às " + hora + "h" + String.format("%02d", minuto)
	             + " | Pessoa: " + pessoaIntimada.getNome()
	             + " | " + procedimento
	             + " | Status: " + status
	             + " | Obs: " + observacao;
	    }


	

}
