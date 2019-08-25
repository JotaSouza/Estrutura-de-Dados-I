package SelectionSort.Exercicios;
import java.util.Scanner;

public class UCrescenteVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int TAM;
        int aux;
        
        System.out.println("------- Ordena Vetor(crescente) -------");
        System.out.print("Informe o tamanho do vetor: ");
        TAM = input.nextInt();
        int[] num = new int [TAM];
        
        for(int x = 0; x < num.length; x++){
            System.out.println("Informe um número");
            num[x] = input.nextInt();
            
            for(int y = 0; y < num.length; y++){
                if(num[x] < num[y]){
                    aux = num[x];
                    num[x] = num[y];
                    num[y] = aux;
                }
                    
            }
        }
        for(int z = 0; z < num.length; z++){
            System.out.print(num[z]+" | ");
        }
        
        input.close();
    }
    
}
