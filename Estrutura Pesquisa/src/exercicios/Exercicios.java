package exercicios;

import java.util.ArrayList;
import java.util.List;
import main.PesquisaSeqBin;

public class Exercicios {
	
	public static int[] primos(int maior){
		List<Integer> listaPrimos = new ArrayList<>();
		
		for(int i = 0; i <= maior; i++) {
			int totalDivisores=0;
	        // Conta os divisores para verificar se o valor é primo
	        for(int j = 1; j <= i; j++) {
	            if(i % j == 0) {
	                totalDivisores++;
	            }
	        }
	        // Se o total de divisores é dois, imprime o primo com formatação de 4 casas
	        if(totalDivisores == 2) {
	            listaPrimos.add(i);
	        }
	    }
		int v[] = new int[listaPrimos.size()];
		for(int i=0; i<listaPrimos.size(); i++){
			v[i] = listaPrimos.get(i);
		}
		return v;
	}
	
	public static void main(String[] args) {
		System.out.println("lg2(32) + 1 = 6, letra c");
		System.out.println("lg2(32) = 5, letra a");
		System.out.println("lg2(193) + 1 = 9, letra c");
		System.out.println("lg2(1580000) + 1 = 22, no máximo");
		
		int primos[] = primos(311);
		
		System.out.print("Posição = "+PesquisaSeqBin.buscaBinária(primos, 52));
		
		System.out.println("Pois ele vai até chegar no último elemento, e vê que ele não é o valor procurado, retornando -1");
		
	}
}
