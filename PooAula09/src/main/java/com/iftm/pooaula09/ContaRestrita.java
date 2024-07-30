package com.iftm.pooaula09;

public interface ContaRestrita { /// a interface não pode ser instanciada, é basicamente uma classe abstrata
    double LIMITE = 0; // atributo se torna da classe (abstrato) (itálico)
    void saqueEspecial(); // sem necessidade de declarar publci nem abstract
}

// Java não tem herança múltipla, por isso o uso da interface

// interface é muito usada para manter regras dentro do projeto
// não é comum ter atributos na interface
// Quando usar interface? Quando se tem objetos similares (mais de duas classes) ContaPagamentos e ContaJovem (as outras não vão implemetar tal método
// saqueEspecial(), por isso o uso da interface)