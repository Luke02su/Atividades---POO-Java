package pooatividade01;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i;
        String nome[] = new String[100];
        
        System.out.println("Digite 10 nomes:\n");
        
        for(i = 0; i < 10; i++) {
            System.out.print(i+1 + "° nome: ");
            nome[i] = scan.next();
        }
        
        System.out.println("\nOrdem conforme foi digitado:\n");
        
        for(i = 0; i < 10; i++) {
            System.out.println(i+1 + "° nome: " + nome[i]);
        }
        
        System.out.println("\nOrdem inversa:\n");
        
        for(i = 9; i >= 0; i--) {
            System.out.println(i+1 + "° nome: " + nome[i]);
        }
    }
}