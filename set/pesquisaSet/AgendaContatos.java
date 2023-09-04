package setInterface.pesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> agendaDeContatos;
	
	public AgendaContatos() {
		agendaDeContatos = new HashSet<>();
	}
	public void adicionarContato(String nome, int numero) {
		agendaDeContatos.add(new Contato(nome, numero));
	}
	public void exibirContatos() {
		System.out.println(agendaDeContatos);
	}
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato contato : agendaDeContatos) {
			if(contato.getNome().startsWith(nome))
				contatosPorNome.add(contato);
		}
		return contatosPorNome;
		
	}
	public Contato atualizarNumeroContato(String nome, int numero) {
		Contato atualizado = null;
		for (Contato c : agendaDeContatos) {
			if (c.getNome().equalsIgnoreCase(nome)){
				c.setNumeroDeTelefone(numero);
				atualizado = c;
				break;
			}
		}
		return atualizado;
	}
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.exibirContatos();
		agendaContatos.adicionarContato("Francinaldo", 5555);
		agendaContatos.adicionarContato("Francinaldo DIO", 5511);
		agendaContatos.adicionarContato("Francinaldo Batista", 5581);
		agendaContatos.adicionarContato("Francinaldo Faculdade", 5583);
		agendaContatos.adicionarContato("Francinaldo", 1111);
		agendaContatos.adicionarContato("Guanabara", 5583);
		
		agendaContatos.exibirContatos();
		System.out.println(agendaContatos.pesquisarPorNome("Francinaldo"));
		System.out.println(agendaContatos.atualizarNumeroContato("Francinaldo", 8399695));
	}
}
