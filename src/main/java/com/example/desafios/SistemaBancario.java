package com.example.desafios;

import com.example.desafios.entities.Conta;

public class SistemaBancario {
    public static void main(String[] args) {
        Conta contaCaixa123 = new Conta(1);
        contaCaixa123.setTitular("jorge");
        contaCaixa123.depositar(200);
        contaCaixa123.sacar(50.00);
        contaCaixa123.toString();
    }
}
