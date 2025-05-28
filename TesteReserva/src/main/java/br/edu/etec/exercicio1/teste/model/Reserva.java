/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste.model;

public class Reserva {
    private Passageiro passageiro;
    private Voo voo;
    private int quantidadeAssentos;

    public Reserva(Passageiro passageiro, Voo voo, int quantidadeAssentos) {
        if (quantidadeAssentos <= 0) {
            throw new IllegalArgumentException("Quantidade de assentos inválida.");
        }
        this.passageiro = passageiro;
        this.voo = voo;
        this.quantidadeAssentos = quantidadeAssentos;
        voo.reservarAssento(quantidadeAssentos);
    }

    public void exibirResumo() {
        System.out.println("===== RESERVA =====");
        passageiro.exibirDados();
        voo.exibirInformacoes();
        System.out.println("Assentos reservados: " + quantidadeAssentos);
        System.out.println("====================");
    }
}
