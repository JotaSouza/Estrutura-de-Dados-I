package InsercaoDireta;

public class MainInsertionSort {

	public static void main(String[] args) {
				
		int[] vet = {3,1,4,1,5,9,2,6,5,4};
		System.out.println("Vetor desordenado");
		for (int i : vet) {
			System.out.print(i+" | ");
		}
		System.out.println(" ");
		InsertionSort.insertionSort(vet);
		
		System.out.println("Vetor ordenado");
		for (int i : vet) {
			System.out.print(i+" | ");
		}

	}

}
