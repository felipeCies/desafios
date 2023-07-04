package com.example.desafios;

import java.util.Scanner;

public class Desafio_dois { public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double preco_um, preco_dois, preco_tres;
    String nome1, nome2, nome3;

    System.out.println("Primeiro Produto: ");
    nome1 = entrada.nextLine();
    System.out.println("preço:");
    preco_um = entrada.nextDouble();
    entrada.nextLine();

    System.out.println("\n Segundo Produto: ");
    nome2 = entrada.nextLine();
    System.out.println("\n preço:" );
    preco_dois = entrada.nextDouble();
    entrada.nextLine();

    System.out.println("\n Terceiro Produto: ");
    nome3 = entrada.nextLine();
    System.out.println("\n preço:" );
    preco_tres = entrada.nextDouble();
    entrada.nextLine();

    if (preco_um < preco_dois <= preco_tres){
        System.out.println("O produto mais barato é: " + nome1);
    }


}
}
