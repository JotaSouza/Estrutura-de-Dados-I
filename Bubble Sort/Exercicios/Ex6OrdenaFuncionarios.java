package com.aula4.exercicios;
import java.util.Scanner;

public class Ex6OrdenaFuncionarios {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de funcionários: ");
		int QUANT = in.nextInt();
		
		String[] nomes = new String [QUANT];
		double[] salario = new double [QUANT];
		
		
		for(int i = 0; i < QUANT; i++) {
			System.out.print("Informe o nome do funcionário "+(i+1)+" : ");
			nomes[i] = in.next();
			System.out.print("Informe o valor do salário do funcionário "+(i+1)+" : ");
			salario[i] = in.nextDouble();	
		}
		System.out.println(" ");
		for(int i = 0; i < QUANT; i++) {
			for(int j = 0; j < QUANT - 1; j++) {
				if(salario[j] > salario[j+1]) {
					double aux = salario[j];
					salario[j] = salario[j+1];
					salario[j+1] = aux;
				}
			}
		}
		System.out.println("Exibindo em forma crescente de salário:");
		for(int i = 0; i < QUANT; i++) {
			System.out.println("Nome: "+nomes[i]+" - Salário R$:"+salario[i]);
		}
		System.out.println(" ");
		for(int i = 0; i < QUANT; i++) {
			for(int j = 0; j < QUANT - 1; j++) {
				if(salario[j] < salario[j+1]) {
					double aux = salario[j];
					salario[j] = salario[j+1];
					salario[j+1] = aux;
				}
			}
		}
		System.out.println("Exibindo em forma decrescente de salário:");
		for(int i = 0; i < QUANT; i++) {
			System.out.println("Nome: "+nomes[i]+" - Salário R$:"+salario[i]);
		}
		System.out.println(" ");
		
		for(int i = 0; i < QUANT; i++) {
			for(int j = 0; j < QUANT - 1; j++) {
				if(nomes[j].compareTo(nomes[j+1]) > 0) {
					String aux = nomes[j];
					nomes[j] = nomes[j+1];
					nomes[j+1] = aux;
				}
			}
		}
		System.out.println("Exibindo relação em ordem alfabética:");
		for(int i = 0; i < QUANT; i++) {
			System.out.print("Nome: "+nomes[i]+" - Salário R$:"+salario[i]);
		}

	}

}
