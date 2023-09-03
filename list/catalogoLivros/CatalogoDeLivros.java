package catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
	List<Livro> livrosDisponiveis;
	
	public CatalogoDeLivros() {
		livrosDisponiveis = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int ano) {
		livrosDisponiveis.add(new Livro(titulo, autor, ano));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosByAutor = new ArrayList<>(); 
		if (!livrosDisponiveis.isEmpty()) {
			for (Livro livro : livrosByAutor) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosByAutor.add(livro);
				}
			}
			
		}
		return livrosByAutor;
	}
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosNoIntervalo = new ArrayList<>();
		if (!livrosDisponiveis.isEmpty()) {
			for (Livro livro : livrosDisponiveis) {
				if(livro.getAnoPublicado()>= anoInicial && livro.getAnoPublicado() <= anoFinal) {
					livrosNoIntervalo.add(livro);
				}
			}
		}
		return livrosNoIntervalo;
	}
	public Livro pesquisarPorTitulo(String titulo) {
		Livro selecionado = null;
		if (!livrosDisponiveis.isEmpty()) {
			for (Livro livro : livrosDisponiveis) {
				if(livro.getTitulo().equalsIgnoreCase(titulo));
					selecionado = livro;
					break;
			}
		}
		return selecionado;
	}
	public static void main(String[] args) {
		
	}
} 
