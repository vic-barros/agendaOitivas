package agendaOitivas;

public class OitivaPendente {
	
	private Pessoa pessoa;
	private ProcedimentoPolicial procedimento;
	private String observacao;
	
	
	public OitivaPendente(Pessoa pessoa, ProcedimentoPolicial procedimento, String observacao) {
		this.pessoa = pessoa;
		this.procedimento = procedimento;
		this.observacao = observacao;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}

	public ProcedimentoPolicial getProcedimento() {
		return procedimento;
	}

	public String getObservacao() {
		return observacao;
	}
	
	 @Override
	    public String toString() {
	        return "Pendente | Pessoa: " + pessoa.getNome()
	             + " | " + procedimento
	             + " | Obs: " + observacao;
	    }


	

	
	

}
