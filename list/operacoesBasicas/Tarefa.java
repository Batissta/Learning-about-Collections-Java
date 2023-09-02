package list.operacoesBasicas;

public class Tarefa {
	String descricaoDaTarefa;

	public Tarefa(String descricaoDaTarefa) {
		this.descricaoDaTarefa = descricaoDaTarefa;
	}

	public String getDescricaoDaTarefa() {
		return descricaoDaTarefa;
	}

	@Override
	public String toString() {
		return descricaoDaTarefa;
	}
	
	
}
