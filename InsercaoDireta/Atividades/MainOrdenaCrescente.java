package InsercaoDireta.Atividades;

import java.util.Scanner;

public class MainOrdenaCrescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tamanho = 0;
		System.out.print("Informe o tamanho do vetor: ");
		tamanho = entrada.nextInt();
		
		int[] vet = new int[tamanho];
		String[] nome = new String[tamanho];
		
		
		/*for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite o "+(i+1)+"º número: ");
			vet[i] = entrada.nextInt();
		}
		
		System.out.println("\nVetor não ordenado");
		for (int i : vet) {
			System.out.print(i+" | ");
		}
		
		OrdenaInsertionSort.insertionSortCrescente(vet);
		
		System.out.println("\nVetor ordenado em ordem crescente");
		for (int i : vet) {
			System.out.print(i+" | ");
		}
		
		OrdenaInsertionSort.insertionSortDecrescente(vet);
		
		System.out.println("\nVetor ordenado em ordem decrescente");
		for (int i : vet) {
			System.out.print(i+" | ");
		}*/
		
		System.out.println("\nOrdenando Strings\n");
		for(int i = 0; i < nome.length; i++) {
			System.out.print("Digite a "+(i+1)+"ª palavra: ");
			nome[i] = entrada.next();
		}
		
		System.out.println("\nVetor não ordenado");
		for (String i : nome) {
			System.out.print(i+" | ");
		}
		
		 OrdenaInsertionSort.insertionSortCrescenteString(nome);
		 
		 System.out.println("\nVetor de Strings ordenado em ordem crescente");
		 for (String i : nome) {
				System.out.print(i+" | ");
			}
		
		 
		entrada.close();
	}

}
