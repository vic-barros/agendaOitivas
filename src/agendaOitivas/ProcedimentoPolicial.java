package agendaOitivas;

public class ProcedimentoPolicial {
	private int numeroOcorrencia;
	private int anoOcorrencia;
	private String crime;
	
	public ProcedimentoPolicial(int numeroOcorrencia, int anoOcorrencia, String crime) {
		this.numeroOcorrencia = numeroOcorrencia;
		this.anoOcorrencia = anoOcorrencia;
		this.crime = crime;
		
	}

	public int getNumeroOcorrencia() {
		return numeroOcorrencia;
	}

	public int getAnoOcorrencia() {
		return anoOcorrencia;
	}

	public String getCrime() {
		return crime;
	}

	@Override
	public String toString() {
	    return "Procedimento: " + numeroOcorrencia + "/" + anoOcorrencia 
	         + " | Crime: " + crime;
	}
	
	

	

}
