package atividade2;
import java.util.Scanner;

public class Atividade2 { 
    public static void main(String[] args) { // método principal
        
    Conta c1 = new Conta(0, "null", 0.00); // objeto global
    Scanner scan = new Scanner(System.in);
       
        int escolha=0;
        
        do {
            System.out.println("1. Criar uma conta\n2. Imprimir dados\n3. Atualizar nome do titular\n4. Atualizar valor\n5. Sacar valor\n6. Sair do programa\n");
            System.out.print("Seleção: ");
            escolha = scan.nextInt();
            
            switch(escolha) {
                case 1:
                    c1.criarConta();
                    break;
                case 2: 
                    c1.imprimirDados();
                    break;
                case 3:
                    c1.atualizarNome();
                    break;
                case 4: {
                    c1.atualizarValor();
                    break;
                }
                case 5: 
                    c1.sacarValor();
                    break;
            }
        } while (escolha != 6);
        System.out.println();
    }
}
