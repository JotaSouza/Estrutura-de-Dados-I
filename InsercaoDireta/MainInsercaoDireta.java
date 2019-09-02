package InsercaoDireta;

public class MainInsercaoDireta {

	public static void main(String[] args) {
		
		int[] vetor = {3,1,4,1,5,9,2,6,5,4};
		int naoOrdenado;
		
		System.out.println("Vetor não ordenado");
		for(int i = 0; i < vetor.length; i++) {
			int j = i;
			naoOrdenado = vetor[i];
			while((j > 0) && (vetor[j - 1] > naoOrdenado)) {
				vetor[j] = vetor[j -1];
				j--;
			}
			vetor[j] = naoOrdenado;
			
		//	System.out.print(naoOrdenado+" | ");
			System.out.print(vetor[j]+" | ");
		}

	}

}
