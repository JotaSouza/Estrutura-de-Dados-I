package com.aula4.exercicios;
import java.util.Scanner;

public class Ex5MenuUsuario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Para prosseguir, escolha uma das opções:");
		System.out.println("1: Ordenação por inteiros");
		System.out.println("2: Ordenação por caracter");
		int opcao = in.nextInt();
		
		if(opcao == 1) {
			System.out.print("Informe o tamanho do vetor: ");
			int tam = in.nextInt();
			
			int[] vetor = new int [tam];
			
			for(int i = 0; i < vetor.length; i++) {
				System.out.print("Informe os valores para o vetor: ");
				vetor[i] = in.nextInt();
			}
			System.out.println(" ");
			System.out.println("Escolha uma das opções:");
			System.out.println("1: Ordenar em ordem crescente");
			System.out.println("2: Ordenar em ordem decrescente");
			int opcao2 = in.nextInt();
			
			if(opcao2 == 1) {
				for(int i = 0; i < vetor.length; i++) {
					for(int j = 0; j < vetor.length - 1; j++) {
						if(vetor[j] > vetor[j+1]) {
							int aux = vetor[j];
							vetor[j] = vetor[j+1];
							vetor[j+1] = aux;
						}
					}
				}
				System.out.println(" ");
				System.out.println("Vetor organizado em ordem crescente:");
				for(int i = 0; i < vetor.length; i++) {
					System.out.print(" | "+vetor[i]);
				}
			} else {
				for(int i = 0; i < vetor.length; i++) {
					for(int j = 0; j < vetor.length - 1; j++) {
						if(vetor[j] < vetor[j+1]) {
							int aux = vetor[j];
							vetor[j] = vetor[j+1];
							vetor[j+1] = aux;
						}
					}
				}
				System.out.println(" ");
				System.out.println("Vetor organizado em ordem decrescente:");
				for(int i = 0; i < vetor.length; i++) {
					System.out.print(" | "+vetor[i]);
				}
			}
		} else {
			System.out.print("Informe o tamanho do vetor: ");
			int tam = in.nextInt();
			
			String [] vetor = new String [tam];
			
			for(int i = 0; i < vetor.length; i++) {
				System.out.print("Informe as letras para o vetor: ");
				vetor[i] = in.next();
			}
			System.out.println(" ");
			System.out.println("Escolha uma das opções:");
			System.out.println("1: Ordenar em ordem crescente");
			System.out.println("2: Ordenar em ordem decrescente");
			int opcao3 = in.nextInt();
			
			if(opcao3 == 1) {
				for(int i = 0; i < vetor.length; i++) {
					for(int j = 0; j < vetor.length - 1; j++) {
						if(vetor[j].compareTo(vetor[j+1]) > 0) {
							String aux = vetor[j];
							vetor[j] = vetor[j+1];
							vetor[j+1] = aux;
						}
					}
				}
				System.out.println(" ");
				System.out.println("Vetor organizado em ordem crescente:");
				for(int i = 0; i < vetor.length; i++) {
					System.out.print(" | "+vetor[i]);
				}
			} else {
				for(int i = 0; i < vetor.length; i++) {
					for(int j = 0; j < vetor.length - 1; j++) {
						if(vetor[j].compareTo(vetor[j+1]) < 0) {
							String aux = vetor[j];
							vetor[j] = vetor[j+1];
							vetor[j+1] = aux;
						}
					}
				}
				System.out.println(" ");
				System.out.println("Vetor organizado em ordem decrescente:");
				for(int i = 0; i < vetor.length; i++) {
					System.out.print(" | "+vetor[i]);
				}
			}
		}

	}

}
