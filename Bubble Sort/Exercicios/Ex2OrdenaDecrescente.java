package com.aula4.exercicios;

import java.util.Scanner;

public class Ex2OrdenaDecrescente {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tam = input.nextInt();
		
		int[] vetor = new int [tam];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Informe os valores para o vetor: ");
			vetor[i] = input.nextInt();
		}
		System.out.println(" ");
		
		System.out.println("Vetor desorganizado:");		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" | "+vetor[i]);
		}
		System.out.println(" ");
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] < vetor[j+1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor organizado em ordem decrescente:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" | "+vetor[i]);
		}
		

	}

}
