package org.example;
import model.Conta;
import model.ContaInvestimento;
import model.ContaPoupanca;


public class Main {
    public static void main(String[] args) {
        Conta poupanca = new ContaPoupanca("Comum", "01/01/2022", 50);
        Conta investimento = new ContaInvestimento("Premium", "01/01/2023", 0);


        try {
            investimento.sacar(30); // Deve falhar pois ambas têm saldo insuficiente
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            poupanca.sacar(30); // Deve funcionar
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
