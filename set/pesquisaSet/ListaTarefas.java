package setInterface.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	Set<Tarefa> tarefas;
	
	public ListaTarefas() {
		tarefas = new HashSet<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefas.remove(tarefa);
				break;
			}
		}
	}
	
	public void exibirTarefas(){
		System.out.println(tarefas);
	}
	
	public int contarTarefas() {
		return tarefas.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for (Tarefa tarefa : tarefasConcluidas) {
			if (tarefa.getConcluida())
				tarefasConcluidas.add(tarefa);
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for (Tarefa tarefa : tarefasPendentes) {
			if (!tarefa.getConcluida())
				tarefasPendentes.add(tarefa);
		}
		return tarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(true);
			}
		}
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		for (Tarefa tarefa : tarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(false);
			}
		}
	}
	
	public void limparListaTarefas() {
		tarefas.clear();
	}
	
}
