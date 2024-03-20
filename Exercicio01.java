package pooatividade01;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i;
        double soma = 0;
        double n[] = new double[10];
        
        System.out.println("Digite 10 números:\n");
                
        for(i = 0; i < 10; i++) {
            System.out.print(i+1 + "º número: ");
            n[i] = scan.nextDouble();
            soma  += n[i];
        }
        
        System.out.printf("\n%.2f\n", soma);
        System.out.println();
       
        for(i = 0; i < 10; i++) {
            System.out.println(i+1 + "º número: " + n[i]);
        }  
    }  
}
