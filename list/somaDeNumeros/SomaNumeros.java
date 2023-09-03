package somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	List<Integer> listaDeNumeros;
	public SomaNumeros() {
		listaDeNumeros = new ArrayList<>();
	}
	public void adicionarNumero(int numero) {
		listaDeNumeros.add(numero);
	}
	public int calcularSoma() {
		int soma = 0;
		for (Integer integer : listaDeNumeros) {
			soma+=integer;
		}
		return soma;
	}
	public int encontrarMaiorNumero() {
		int maior = 0;
		for (Integer integer : listaDeNumeros) {
			if(integer>maior) maior = integer;
		}
		return maior;
	}
	public int encontrarMenorNumero() {
		int menor = this.encontrarMaiorNumero();
		for (Integer integer : listaDeNumeros) {
			if(integer<menor) menor = integer;
		}
		return menor;
	}
	public List<Integer> exibirNumeros() {
		return listaDeNumeros;
	}
	public static void main(String[] args) {
		SomaNumeros s = new SomaNumeros();
		s.adicionarNumero(10);
		s.adicionarNumero(2);
		s.adicionarNumero(16);
		s.adicionarNumero(34);
		s.adicionarNumero(12);
		s.adicionarNumero(24);
		s.adicionarNumero(13);
		System.out.println(s.calcularSoma());
		System.out.println(s.encontrarMaiorNumero());
		System.out.println(s.encontrarMenorNumero());
		System.out.println(s.exibirNumeros());
	}
}
