package setInterface.operacoresBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		palavrasUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		if (!verificarPalavra(palavra))
			palavrasUnicas.add(palavra);
		else
			System.out.println("Esta série já está na lista");
	}
	
	public void removerPalavra(String palavra) {
		palavrasUnicas.remove(palavra);
	}
	
	public boolean verificarPalavra(String palavra) {
		boolean palavraPresente = false;
		for (String string : palavrasUnicas) {
			if (string.equalsIgnoreCase(palavra))
				palavraPresente = true;
		}
		return palavraPresente;
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavrasUnicas);
	}
	
	public int quantidadeDePalavras() {
		return palavrasUnicas.size();
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();
		System.out.println("Existem "+ c.quantidadeDePalavras() + " na lista");
		c.adicionarPalavra("The Office");
		c.adicionarPalavra("Breaking bed");
		c.adicionarPalavra("Alone");
		c.adicionarPalavra("How i met your mother");
		System.out.println("Existem "+ c.quantidadeDePalavras() + " na lista");
		
	}
}
