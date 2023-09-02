package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	List<Tarefa> tarefaList;
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
		System.out.println("Nova tarefa adicionada!");
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricaoDaTarefa().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefaParaRemover); //removeAll deve receber uma lista com os itens a serem removidos
	}
	public int obterNumeroTotal() {
		return tarefaList.size();
	}
	public void obterDescricao(){
		System.out.println(tarefaList);
	}
	public static void main(String[] args) {
		ListaTarefas list = new ListaTarefas();
		System.out.println("O número total de tarefas é: "+list.obterNumeroTotal());
		list.adicionarTarefa("Tarefa 1");
		list.adicionarTarefa("Tarefa 1");
		list.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de tarefas é: "+list.obterNumeroTotal());
		list.removerTarefa("Tarefa ");
		System.out.println("O número total de tarefas é: "+list.obterNumeroTotal());
	}
}
