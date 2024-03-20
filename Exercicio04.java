package pooatividade01;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i, x=0;
        int vetor[] = new int[8];
        boolean encontrado = false;
        
        System.out.println("Leia 8 posições:\n");
        
        for(i = 0; i < 8; i++) {
            System.out.print(i+1 + "° posição: ");
            vetor[i] = scan.nextInt();
        }
        
        System.out.print("\nLeia um valor X qualquer: ");
        x = scan.nextInt();
        System.out.println();
        
        for(i = 0; i < 8; i++) {
            if(vetor[i] == x) {
                System.out.println(x + " foi encontrado na " + (i+1) + "° posição.");
                encontrado = true;
            }
        }
        
        if(!encontrado) {
            System.out.println("X não foi encontrado em nenhum vetor.");
        }
    }
}
