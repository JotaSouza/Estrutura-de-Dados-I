package InsercaoDireta;

public class InsertionSort {

	public static void insertionSort(int vetor[]) {
		int n = vetor.length;
		 for (int i = 1; i < n; i++) {  
	            int primeiroNaoOrdenado = vetor[i];  
	            int j = i-1;  
	            while ( (j > -1) && ( vetor [j] > primeiroNaoOrdenado) ) {  
	                vetor [j+1] = vetor [j];  
	                j--;  
	            }  
	            vetor[j+1] = primeiroNaoOrdenado;  
	        }  
	    }  
}
