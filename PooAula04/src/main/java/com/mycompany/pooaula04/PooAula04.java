package com.mycompany.pooaula04;

public class PooAula04 {

    public static void main(String[] args) {

       //Conta a = new Conta(1, "Dênis", 30.00); //construtor (isso é polimorfismo) (vira abstract e n pode ser usada)

       //Conta a = new Conta(); // quem está herdando
       ContaEmpresa b = new ContaEmpresa(2, "Maria", 50.00, 100.00); // herda (deste jeito atribue tudo zero e null para os valores)
       ContaPoupanca a = new ContaPoupanca(1, "José", 100.00, 20.00);
       // b.setCodigo(5); consigo usar atributo da classe a
     
       a.atualizarSaldo(20);
        System.out.println(a.getSaldo());
    }
}