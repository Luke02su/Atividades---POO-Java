package atividade2;
import java.util.Scanner;

public class Atividade2 {
    
    static Conta c1 = new Conta(0, "null", 0); // objeto global
    
    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        
        int escolha=0;
        
        do {
            System.out.println("1. Criar uma conta\n2. Imprimir dados da conta\n3. Sair do programa\n");
            escolha = scan.nextInt();
            
            switch(escolha) {
                case 1:
                    criarConta();
                    break;
                case 2: 
                    imprimirDados();
                    break;
            }
            
        } while (escolha != 3);
    }
    
    public static void criarConta() {
        
        Scanner scan = new Scanner(System.in);
             
        System.out.print("Digite o  numero da conta: ");
        int numero = scan.nextInt();
        c1.setNumero(numero);
        
        scan.nextLine(); //quebra de linha para ler a string seguinte
        
        System.out.print("Digite o o titular da conta: ");
        String titular = scan.nextLine();
        c1.setTitular(titular);
        
        System.out.print("Há um depósito inicial (s/n)? ");
        char opcao = scan.nextLine().charAt(0); //converte string em char;
        if(opcao == 's') {
            System.out.print("Digite o valor de depósito inicial: ");
            double valor = scan.nextDouble();
            c1.setValor(valor);
        }
    }
  
        public static void imprimirDados() {           
            System.out.print("Conta " + c1.getNumero());
            System.out.print(", Titular: "+ c1.getTitular());
            System.out.println(", Saldo: " + c1.getValor());
        }
     
   }
