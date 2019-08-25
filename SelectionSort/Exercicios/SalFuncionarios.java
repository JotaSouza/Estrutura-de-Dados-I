package SelectionSort.Exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class SalFuncionarios {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        final int NFUNC;
        
        System.out.println("--- Ordena Funcion�rios ---");
        System.out.print("Informe o n�mero de funcion�rios: ");
        NFUNC = input.nextInt();
        System.out.println("");
        //int[] num = new int [NFUNC];
        String[] nomes  = new String[NFUNC];
        double[] valSal = new double [NFUNC];
        
       for(int x = 0; x < nomes.length; x++){
           //int y = 0;
           System.out.print("Informe o nome do funcion�rio: ");
           nomes[x] = input.next();
           System.out.print("Informe o sal�rio do funcion�rio: ");
           valSal[x] = input.nextDouble();
           System.out.println("");
       }
        System.out.println("-- Em ordem crescente de sal�rio --");
       Arrays.sort(valSal);
       for(int y = 0; y < nomes.length; y++){
           System.out.println("Nome: "+nomes[y]);
           for(int z = 0; z < nomes.length; z++){
           System.out.println("Sal�rio: "+valSal[y]);
           }
       }
           
       input.close(); 
    }
    
}
