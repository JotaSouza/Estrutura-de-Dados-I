package Recursividade.Exercicios;

public class SequenciaFibonacci {
	int n;
	
	static int Fibonacci(int n) {
		
		if(n < 2)
			return n;
		else
			return Fibonacci(n - 1) + Fibonacci(n -2);

	}
}
