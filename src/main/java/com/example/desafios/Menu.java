package com.example.desafios;

import com.example.desafios.entities.Conta;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        System.out.println("1- opção 1"+ "\n2- opção 2"+ "\n3- opção 3" );
        escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("opcção 1 escolhida");
                break;
            case 2:
                System.out.println("opção 2 escolhida");
                break;
            case 3:
                System.out.println("opção 3 escolhida");
                break;
            default:
                System.out.println("opção inválida");
        } while (escolha != 3 );

        scanner.close();
    }
}
