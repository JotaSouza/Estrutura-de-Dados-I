package InsercaoDireta.Atividades;

public class OrdenaInsertionSort {

	//método de ordenação crescente - Inteiros
	public static void insertionSortCrescente(int vetor[]) {
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
	//método de ordenação decrescente - Inteiros
	public static void insertionSortDecrescente(int vetor[]) {
		int n = vetor.length;
		 for (int i = 1; i < n; i++) {  
	            int primeiroNaoOrdenado = vetor[i];  
	            int j = i-1;  
	            while ( (j >= 0) && ( vetor [j] < primeiroNaoOrdenado) ) {  
	                vetor [j+1] = vetor [j];  
	                j--;  
	            }  
	            vetor[j+1] = primeiroNaoOrdenado; 
	           
	            }
	        } 
	//método de ordenação crescente - String/caractere
	public static void insertionSortCrescenteString(String[] nome) {
		int n = nome.length;
		 for (int i = 1; i < n; i++) {  
	            String primeiroNaoOrdenado = nome[i];  
	            int j = i-1;  
	            while ( (j > -1) && ( j > primeiroNaoOrdenado.compareTo(nome[j])) ) {  
	                nome [j+1] = nome [j];  
	                j--;  
	            }  
	            nome[j+1] = primeiroNaoOrdenado;  
	        }  
	    }
	//método de ordenação decrescente - String/caractere
	public static void insertionSortDecrescenteString(String[] nome) {
		int n = nome.length;
		 for (int i = 1; i < n; i++) {  
	            String primeiroNaoOrdenado = nome[i];  
	            int j = i-1;  
	            while ( (j >= 0) && ( j < primeiroNaoOrdenado.compareTo(nome[j])) ) {  
	                nome [j+1] = nome [j];  
	                j--;  
	            }  
	            nome[j+1] = primeiroNaoOrdenado;  
	        }  
	    }
	
	
}  

