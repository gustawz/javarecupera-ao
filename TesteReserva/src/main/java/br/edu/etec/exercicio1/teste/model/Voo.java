/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;

public class Voo {
    private String destino;
    private String origem;
    private int numeroVoo;
    private int assentosDisponiveis;

    public Voo(String origem, String destino, int numeroVoo, int assentosDisponiveis) {
        this.origem = origem;
        this.destino = destino;
        this.numeroVoo = numeroVoo;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public String getDestino() { return destino; }
    public String getOrigem() { return origem; }
    public int getNumeroVoo() { return numeroVoo; }
    public int getAssentosDisponiveis() { return assentosDisponiveis; }

    public void reservarAssento(int quantidade) {
        if (quantidade > assentosDisponiveis) {
            throw new IllegalArgumentException("Não há assentos suficientes.");
        }
        assentosDisponiveis -= quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Voo: " + numeroVoo + " | De: " + origem + " → Para: " + destino);
        System.out.println("Assentos disponíveis: " + assentosDisponiveis);
    }
}
