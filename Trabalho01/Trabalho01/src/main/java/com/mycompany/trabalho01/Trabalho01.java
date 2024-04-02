package com.mycompany.trabalho01;
import java.util.Date;

public class Trabalho01 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("João Maria", "Rua A", "(34) 9 9834-0832", 1); // objeto da classe Pessoa instanciado
        
        p1.imprimir();
         
        Date dataNascimento = new Date(99, 9, 9);
        PessoaFisica pf1 = new PessoaFisica("José Aparecido", "Rua X", "(34) 9 9833-6738", 1, "Manoel Aparecido", "Maria Aparecida", 'M', dataNascimento, "123.287.837-08", "MG-21.267.287", "Brasileiro", "Mineiro", 1973.09); // objeto da classe PessoaFísica instanciado
        
        pf1.imprimir();
        pf1.imprimirDados();
        pf1.exibirSalarioAnual();
        pf1.aumentarSalario(10.00);
        pf1.exibirSalarioAnual();
        pf1.aumentarSalario(1000);
        pf1.exibirSalarioAnual();
        pf1.temQuePagar(2000.00);
        pf1.imprimirDados();
        pf1.imprimePrestacaoIR(2, 1375.0);
        
        PessoaJuridica pj1 = new PessoaJuridica("Espedito Cunha", "Rua Y", "(34) 9 9856-6493", 2, "1733.8938.393-33", "GWU27QH", 20000, 6); // objeto da classe PessoaJuidica instanciado
        
        pj1.imprimir();
        pj1.imprimirDados();
        pj1.alterarFaturamento(20000.00);
        pj1.imprimirFaturamentoAnual();
        pj1.imprimirDados();
        pj1.gerarGuiaPagamento();
        pj1.imprimirDados();
    }
}