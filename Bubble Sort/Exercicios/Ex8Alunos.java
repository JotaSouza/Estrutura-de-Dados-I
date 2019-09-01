package com.aula4.exercicios;
import java.util.Scanner;

public class Ex8Alunos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos: ");
		int quant = in.nextInt();
		
		String[] nomes = new String [quant];
		float[] nota1 = new float [quant];
		float[] nota2 = new float [quant];
		float[] soma1 = new float [quant];
		float[] soma2 = new float [quant];
		float[] media = new float [quant];
		//double soman1 = 0, soman2 = 0, media = 0;
		
		for(int i = 0; i < quant; i++) {
			System.out.println(" ");
			System.out.print("Informe o nome do "+(i+1)+"º aluno: ");
			nomes[i] = in.next();
			System.out.print("Informe a nota 1 do "+(i+1)+"º aluno: ");
			nota1[i] = in.nextFloat();
			System.out.print("Informe a nota 2 do "+(i+1)+"º aluno: ");
			nota2[i] = in.nextFloat();
			soma1[i] = (soma1[i] + nota1[i]* 2);
			soma2[i] = (soma2[i] + nota2[i] * 3) ;
			media[i] = (soma1[i] + soma2[i]) / (2+3);
		}
		for(int i = 0; i < quant; i++) {
			for(int j = 0; j < media.length - 1; j++) {
				if(media[j] > media[j+1]) {
					float aux = media[j];
					media[j] = media[j+1];
					media[j+1] = aux;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Resultado pela média ponderada: ");
		for(int i = 0; i < media.length; i++) {
			System.out.println("O aluno "+nomes[i]+" obteve média igual a: "+media[i]);
		}

	}

}
