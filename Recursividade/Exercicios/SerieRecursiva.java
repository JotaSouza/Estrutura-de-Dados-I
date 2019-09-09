package Recursividade.Exercicios;

public class SerieRecursiva {
	int n;
	
	static int CalculaValor(int n) {
		if(n < 1)
			return n;
		else
			return (2 + ((5/2) + (10/3)) + (1 + (n*n))/n) + CalculaValor(n-1);
	}
}
