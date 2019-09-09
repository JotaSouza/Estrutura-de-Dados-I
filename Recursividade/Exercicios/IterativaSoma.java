package Recursividade.Exercicios;

public class IterativaSoma {
	int n;
	
	static int SomaIterativa(int n) {
		for(int i = 0; i < n;) {
			
			return ((2 * (n*n)) + (2 * n) + 8) + SomaIterativa(n-1);
		}
		return n;
	}
}
