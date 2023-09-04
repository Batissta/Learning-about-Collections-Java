package setInterface.operacoresBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidados;
	
	public ConjuntoConvidados() {
		convidados = new HashSet<>();
	}
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidados.add(new Convidado(nome, codigoConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado convidado : convidados) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = convidado;
				break;
			}
		}
		convidados.remove(convidadoParaRemover);
	}
	public int contarConvidados() {
		return convidados.size();
	}
	public void exibirConvidados() {
		System.out.println(convidados);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados c = new ConjuntoConvidados();
		System.out.println("Existem "+ c.contarConvidados()+" pessoas convidadas para a festa!");
		c.adicionarConvidado("Convidado 1", 1);
		c.adicionarConvidado("Convidado 2", 2);
		c.adicionarConvidado("Convidado 3", 3);
		c.adicionarConvidado("Convidado 4", 3);
		c.adicionarConvidado("Convidado 5", 5);
		c.adicionarConvidado("Convidado 6", 6);
		c.adicionarConvidado("Convidado 7", 7);
		System.out.println("Existem "+ c.contarConvidados()+" pessoas convidadas para a festa!");
		c.removerConvidadoPorCodigoConvite(5);
		System.out.println("Existem "+ c.contarConvidados()+" pessoas convidadas para a festa!");
		c.exibirConvidados();
	}
}
