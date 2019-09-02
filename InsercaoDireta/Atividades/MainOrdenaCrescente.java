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
		
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			vet[i] = entrada.nextInt();
		}
		
		System.out.println("\nVetor n�o ordenado");
		for (int i : vet) {
			System.out.print(i+" | ");
		}
		//Exerc�cio 1
		OrdenaInsertionSort.insertionSortCrescente(vet);
		System.out.println("\nVetor ordenado em ordem crescente");
		for (int i : vet) {
			System.out.print(i+" | ");
		}
		//Exerc�cio 2
		OrdenaInsertionSort.insertionSortDecrescente(vet);
		System.out.println("\nVetor ordenado em ordem decrescente");
		for (int i : vet) {
			System.out.print(i+" | ");
		}
		System.out.println(" ");
		System.out.println("\nOrdenando Strings");
		for(int i = 0; i < nome.length; i++) {
			System.out.print("Digite a "+(i+1)+"� palavra: ");
			nome[i] = entrada.next();
		}
		
		System.out.println("\nVetor n�o ordenado");
		for (String i : nome) {
			System.out.print(i+" | ");
		}
		//Exerc�cio 3
		 OrdenaInsertionSort.insertionSortCrescenteString(nome);
		 System.out.println("\nVetor de Strings ordenado em ordem crescente");
		 for (String i : nome) {
				System.out.print(i+" | ");
			}
		//Exerc�cio 4
		 OrdenaInsertionSort.insertionSortDecrescenteString(nome);
		 System.out.println("\nVetor de Strings ordenado em ordem decrescente");
		 for (String i : nome) {
				System.out.print(i+" | ");
			}
		entrada.close();
	}

}
