package Recursividade.Exercicios;

public class SomaRecursividade {

	int n;
	
	static int SomaRecursiva(int n) {
		if(n < 1)
			return n;
		else
			return ((2 * (n*n)) + (2 * n) + 8) + SomaRecursiva(n-1);
	}
}
