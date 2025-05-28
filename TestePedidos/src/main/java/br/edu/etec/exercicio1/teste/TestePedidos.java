/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio1.teste;

import br.edu.etec.exercicio1.teste.model.*;
import br.edu.etec.exercicio1.teste.exceptions.*;

public class TestePedidos {
    public static void main(String[] args) {
        try {
            Produto[] produtos = new Produto[3];

            produtos[0] = new Livro("Java Basico", 59.90, 10, "Jose Silva");
            produtos[1] = new Eletronico("Fone Bluetooth", 120.00, 5, 12);
            produtos[2] = new Roupa("Camiseta", 35.00, 20, "M");

            for (Produto p : produtos) {
                p.exibirDetalhes();
                System.out.println("------------------------");
            }

            Pedido pedido = new Pedido(produtos[0], 2);
            pedido.gerarResumo();

        } catch (PrecoInvalidoException | QuantidadeInvalidaException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
