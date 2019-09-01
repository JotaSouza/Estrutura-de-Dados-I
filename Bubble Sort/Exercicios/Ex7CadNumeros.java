package com.aula4.exercicios;
import java.util.Scanner;

public class Ex7CadNumeros {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maior, menor, contador = 0, mcontador = 0;
		
		System.out.print("Informe quantos números deseja cadastrar: ");
		int quant = in.nextInt();
		
		int[] vetor = new int [quant];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o "+(i+1)+"º valor do vetor: ");
			vetor[i] = in.nextInt();
		}
        System.out.println(" ");
		for(int i = 0; i < vetor.length; i++) {
			for(int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j+1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor organizado em ordem crescente:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" | "+vetor[i]);
		}
		maior = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == maior) {
				contador++;
			}
		}
		menor = vetor[0];
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == menor) {
				mcontador ++;
			}
		}
		System.out.println("");
		System.out.println("\nO menor número digitado é: "+menor);
		System.out.println("Ele aparece "+mcontador+" vez(s) no vetor.");
		System.out.println("");
		System.out.println("O maior número digitado é: "+maior);
		System.out.println("Ele aparece "+contador+" vez(s) no vetor.");
		
		

	}

}
