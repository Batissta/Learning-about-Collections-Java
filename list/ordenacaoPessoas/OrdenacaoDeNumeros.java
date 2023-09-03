package ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoDeNumeros {
	List<Integer> numeros;
	public OrdenacaoDeNumeros() {
		numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendente = new ArrayList<>(numeros);
		if(!numerosAscendente.isEmpty()) {
			Collections.sort(numerosAscendente);
			return numerosAscendente;
			
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosAscendente = new ArrayList<>(numeros);
		if(!numerosAscendente.isEmpty()) {
			Collections.sort(numerosAscendente, Collections.reverseOrder());
			return numerosAscendente;
			
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	public static void main(String[] args) {
		OrdenacaoDeNumeros nums = new OrdenacaoDeNumeros();
		nums.adicionarNumero(10);
		nums.adicionarNumero(9);
		nums.adicionarNumero(17);
		nums.adicionarNumero(14);
		nums.adicionarNumero(4);
		nums.adicionarNumero(7);
		nums.adicionarNumero(29);
		nums.adicionarNumero(1);
		System.out.println(nums.numeros);
		System.out.println(nums.ordenarAscendente());
		System.out.println(nums.ordenarDescendente());
		
	}
}
