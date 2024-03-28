package com.mycompany.pooaula04;

public class PooAula04 {

    public static void main(String[] args) {
        
       Conta a = new Conta(1, "Dênis", 30.00); //construtor (isso é polimorfismo)
        
       //Conta a = new Conta(); // quem está herdando
       ContaEmpresa b = new ContaEmpresa(2, "Maria", 50.00, 100.00); // herda (deste jeito atribue tudo zero e null para os valores)
       
       // b.setCodigo(5); consigo usar atributo da classe a
       
    }
}
