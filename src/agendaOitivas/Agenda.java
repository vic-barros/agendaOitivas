package agendaOitivas;
import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Oitiva> oitivas;
	
	public Agenda() {
		this.oitivas = new ArrayList<>();
	}
	
	public void adicionarOitiva(Oitiva oitiva){
		oitivas.add(oitiva);
		System.out.println("Oitiva Agendada com Sucesso!");
	}
	
	public void listarOitivas() {
		if(oitivas.isEmpty()) {
			System.out.println("Nenhuma Oitiva Agendada");
			return;
		}
		System.out.println("=== OITIVAS AGENDADAS ===");
		for(Oitiva o : oitivas) {
			System.out.println(o);
		}
	}
	
	public Oitiva getOitiva(int indice) {
		return oitivas.get(indice);
	}
	
	public void alterarStatus(int indice, StatusOitiva novoStatus) {
		oitivas.get(indice).setStatus(novoStatus);
		System.out.println("Status da Oitiva Atualizado com Sucesso");
	}
	
	public void removerOitiva(int indice) {
		oitivas.remove(indice);
		System.out.println("Oitiva Removida com Sucesso");
	}
	
	public int totalOitivas() {
		return oitivas.size();
	}

}
