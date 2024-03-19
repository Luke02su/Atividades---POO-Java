package atividade2;
import java.util.Scanner;

public class Atividade2 {
    
    static Conta c1 = new Conta(0, "null", 0.00); // objeto global
    static Scanner scan = new Scanner(System.in);
    static boolean status = false;
    
    public static void main(String[] args) { // método principal
       
        int escolha=0;
        
        do {
            System.out.println("1. Criar uma conta\n2. Imprimir dados\n3. Atualizar nome do titular\n4. Atualizar valor\n5. Sacar valor\n6. Sair do programa\n");
            System.out.print("Seleção: ");
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
        System.out.println();
    }
    
    public static void criarConta() {
                  
        System.out.print("\nDigite o número da conta: ");
        int numero = scan.nextInt();
        c1.setNumero(numero);
        
        scan.nextLine(); //quebra de linha para ler a string seguinte
        
        System.out.print("Digite o nome titular da conta: ");
        String titular = scan.nextLine();
        c1.setTitular(titular);
        
        char opcao = 's';
        while(opcao != 's'  || opcao != 'n') {
            System.out.print("Há um depósito inicial (s/n)? ");
            opcao = scan.nextLine().charAt(0); //converte string em char;
            if(opcao == 's') {
                System.out.print("Digite o valor de depósito inicial: ");
                double valor = scan.nextDouble();
                c1.setValor(valor);
                break;
            } else if(opcao == 'n'){
                break;
            }
        }
        status = true;
        imprimirDados();
    }

    public static void imprimirDados() {
        System.out.println();
        if(status == false) {
            System.out.println("A conta não foi criada.\n");
        } else {
            System.out.println("Dados atualizados da conta:");
            System.out.print("Conta " + c1.getNumero());
            System.out.print(", Titular: "+ c1.getTitular());
            System.out.printf(", Saldo: $ %.2f", c1.getValor());
            System.out.println("\n");
        }
    }

    public static void atualizarNome() {
        if(status == false) {
            System.out.println("\nA conta não foi criada.\n");
        } else {
            scan.nextLine();
            System.out.print("\nAltere o nome do titular: ");
            String titular = scan.nextLine();
            c1.setTitular(titular);
            imprimirDados();
        }
    }

    public static void atualizarValor() {
        if(status == false) {
            System.out.println("\nA conta não foi criada.\n");
        } else {
            System.out.print("\nDigite um valor de depósito: ");
            double valor = c1.getValor();
            double valorDeposito = scan.nextDouble();
            valor += valorDeposito;
            c1.setValor(valor);
            imprimirDados();
        }
    }

    public static void sacarValor() {
        if(status == false) {
            System.out.println("\nA conta não foi criada.\n");
        } else {
            System.out.print("\nDigite o valor do saque: ");
            double saque = scan.nextDouble();
            if(c1.getValor() < (saque + 5) || saque <= 0.00) { // taxa de 5 reais ao sacar
                System.out.print("\nOperação não realizada. Saldo insuficiente.");
            } else {
                double valor = c1.getValor();
                valor -= (saque + 5);
                c1.setValor(valor);
            }
        imprimirDados();
        }
    }
}
   