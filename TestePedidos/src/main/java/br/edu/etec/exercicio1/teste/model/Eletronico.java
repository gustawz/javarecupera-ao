/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;

import br.edu.etec.exercicio1.teste.exceptions.PrecoInvalidoException;
import br.edu.etec.exercicio1.teste.exceptions.QuantidadeInvalidaException;

public class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidadeEstoque, int garantiaMeses)
            throws PrecoInvalidoException, QuantidadeInvalidaException {
        super(nome, preco, quantidadeEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletronico: " + getNome() + " | Garantia: " + garantiaMeses + " meses");
        System.out.println("Preco: R$" + getPreco() + " | Estoque: " + getQuantidadeEstoque());
    }
}
