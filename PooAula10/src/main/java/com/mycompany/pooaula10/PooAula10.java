package com.mycompany.pooaula10;

public class PooAula10 {

    public static void main(String[] args) {
        // Monta objeto para ser gravado no banco de dados
        Contato contato = new Contato();
        contato.setNome("Dênis Lima");
        contato.setEmail("denislima@iftm.edu.br");
        contato.setEndereco("Rua 1, 515");

        // Modelo de Contato para ações no DB
        ContatoDAO dao = new ContatoDAO();

        // Chama o método adicionar e passa o objeto como atributo
        dao.adicionar(contato);
        
        // Lista dos dados do banco DB
        dao.listar();
        
        // Editar registro (Informar o ID do objeto que será editado)
        Contato c2 = new Contato((long)2, "Dênis", "denis@live.com", "Rua 5, 645");
        
        // Chama o método alterar e passa o objeto como atributo
        dao.alterar(c2);
        
        // Lista dos dados do banco DB
        dao.listar();
        
        // Editar registro (Informar o ID do objeto que será editado)
        Contato c3 = new Contato((long)3);
        
        // Chama o método alterar e passa o objeto como atributo
        dao.remover(c3);
        
        // Lista dos dados do banco DB
        dao.listar();
        
    }
}
