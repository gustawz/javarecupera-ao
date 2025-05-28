/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;

public class Pedido {
    private Produto produto;
    private int quantidade;

    public Pedido(Produto produto, int quantidade) {
        if (quantidade > produto.getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Quantidade solicitada maior que o estoque disponível.");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void gerarResumo() {
        System.out.println("Resumo do Pedido:");
        produto.exibirDetalhes();
        System.out.println("Quantidade solicitada: " + quantidade);
        System.out.println("-----------------------------------");
    }
}

