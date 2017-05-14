package main;

public class PesquisaSeqBin {

	
	public static String buscaSequencial(int[] v, int num){
		int posicao=0, iteracoes=0;
		for (int n : v){
			iteracoes++;
			if (n>num){
				return "nenhuma, com "+iteracoes+" iterações";
			} else if (num==n){
				return posicao+", com "+iteracoes+" iterações"; 
			}
			posicao++;
			
		}
		return "nenhuma, com "+iteracoes+" iterações";
	}
	
	public static String buscaBinária(int[] v, int num){
		int min=0, max = v.length-1, meio=0, iteracoes=0;
		while (min<=max){
			iteracoes++;
			meio = (min+max)/2;
			if(v[meio]==num){
				return meio+", com "+iteracoes+" iterações";
			} else if(num<v[meio]){
				max = meio-1;
			} else {
				min = meio+1;
			}
		}
		
		
		return "nenhuma, com "+iteracoes+" iterações";
		
	}
	
	
	public static void main(String[] args) {
		int v[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71};
		
		System.out.println("Pesquisa Sequencial");
		System.out.println("Número encontrado na posição "+buscaSequencial(v,71));
		System.out.println("Pesquisa Binária");
		System.out.println("Número encontrado na posição "+buscaBinária(v,71));
	}

}
