/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.exercicio1.teste;

import br.edu.etec.exercicio1.teste.model.*;

public class TesteReserva {
    public static void main(String[] args) {
        try {
            Voo voo1 = new Voo("São Paulo", "Salvador", 1010, 5);
            Passageiro passageiro1 = new Passageiro("Carlos Silva", "123.456.789-00");

            voo1.exibirInformacoes();
            System.out.println("------------------");

            Reserva reserva1 = new Reserva(passageiro1, voo1, 2);
            reserva1.exibirResumo();

            System.out.println("\nApós a reserva:");
            voo1.exibirInformacoes();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
