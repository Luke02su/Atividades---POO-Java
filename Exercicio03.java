package pooatividade01;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i, vet1[] = new int[10], vet2[] = new int[10];
        
        System.out.println("Digite 10 números a serem armazenados no primeiro vetor:\n");
        
        for(i = 0; i < 10; i++) {
            System.out.print(i+1 + "° número: ");
            vet1[i] = scan.nextInt();
            vet2[i] = vet1[i] * 5;
        }
        
        System.out.println("\nA primeira coluna corresponde aos valores do primeiro vetor, enquanto os da segunda à multiplicação do primeiro por 5:\n");
        
        for(i = 0; i < 10; i++) {
            System.out.printf("%d ", vet1[i]);
            System.out.printf("%d", vet2[i]);
            System.out.println();
        }
    }
}