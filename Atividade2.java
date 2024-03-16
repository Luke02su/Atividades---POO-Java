package atividade2;
import java.util.Scanner;

public class Atividade2 {
    
    static Conta c1 = new Conta(0, "null", 0); // objeto global
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) { // método principal
       
        int escolha=0;
        
        do {
            System.out.println("1. Criar uma conta\n2. Imprimir dados da conta\n3.Atualizar nome\n4. Atualizar valor\n5. Sacar valor\n6.Sair do programa\n");
            escolha = scan.nextInt();
            
            switch(escolha) {
                case 1:
                    criarConta();
                    break;
                case 2: 
                    imprimirDados();
                    break;
                case 3:
                    atualizarNome();
                    break;
                case 4: {
                    atualizarValor();
                    break;
                }
                case 5: 
                    sacarValor();
                    break;
            }
            
        } while (escolha != 6);
    }
    
    public static void criarConta() {
                  
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
        imprimirDados();
    }

        public static void imprimirDados() {           
            System.out.print("Conta " + c1.getNumero());
            System.out.print(", Titular: "+ c1.getTitular());
            System.out.println(", Saldo: " + c1.getValor());
        }
        
        public static void atualizarNome() {
            scan.nextLine();
            System.out.println("Altere o nome do titular: ");
            String titular = scan.nextLine();
            c1.setTitular(titular);
            imprimirDados();
        }
        
        public static void atualizarValor() {
            System.out.println("Digite um valor de depósito: ");
            double valor = c1.getValor();
            double valorDeposito = scan.nextDouble();
            valor += valorDeposito;
            c1.setValor(valor);
            imprimirDados();
        }
        
        public static void sacarValor() {
            System.out.print("Digite o valor do saque: ");
            double saque = scan.nextDouble();
            if(c1.getValor() < saque + 5) {
                System.out.println("Operação não realizada. Saldo insuficiente");
            } else {
                double valor = c1.getValor();
                valor -= saque;
                c1.setValor(valor);
            }
            imprimirDados();
        }
    }
   