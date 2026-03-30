package agendaOitivas;
import java.util.ArrayList;

public class ListaPendentes {
	
	private ArrayList<OitivaPendente> pendentes;
	
	public ListaPendentes() {
		this.pendentes = new ArrayList<>();
	}
	
	public void adicionarOitivaPendente(OitivaPendente pendente) {
		pendentes.add(pendente);
		System.out.println("Oitiva Pendente Adicionada com Sucesso");
	}
	
	public OitivaPendente getOitivaPendente(int indice) {
		return pendentes.get(indice);
	}
	
	public void listarOitivaPendente() {
		if(pendentes.isEmpty()) {
			System.out.println("Nenhuma Oitiva Pendente");
			return;
		}
		System.out.println("=== OITIVAS PENDENTES ===");
		for(OitivaPendente op : pendentes) {
			System.out.println(op);
		}
	}
	
	public void removerOitivaPendente(int indice) {
		pendentes.remove(indice);
		System.out.println("Oitiva Pendente Removida com Sucesso!");
	}
	
	public int totalOitivaPendente() {
		return pendentes.size();
	}

}
