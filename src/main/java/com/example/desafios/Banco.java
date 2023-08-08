package com.example.desafios;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        double sacar, depositar;
        double saldo = 100.0;

        System.out.println("Qual a operação desejada: " + "\n1- Sacar" + "\n2- Depositar");
        escolha= scanner.nextInt();
        if (escolha == 1 ){
            System.out.println("Quanto desaja Sacar? ");
            sacar = scanner.nextDouble();
            sacar = (saldo - sacar);
            if (saldo == 0){
                System.out.println("Saldo insuficiente!");
            } else {
                System.out.println("Seu saldo é: " +sacar+ " Reais");
            }
        } else if (escolha == 2) {
            System.out.println("Quanto deseja depositar? ");
            depositar = scanner.nextDouble();
            depositar = (saldo + depositar);
            System.out.println("Seu saldo é: "+depositar+ " Reais");
        }

            scanner.close();
    }
}
