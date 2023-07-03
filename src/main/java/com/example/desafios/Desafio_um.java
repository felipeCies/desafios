package com.example.desafios;

import java.util.Scanner;

public class Desafio_um { public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int fome, dinheiro;

    System.out.println("Voce esta com fome? " + "\n1 Sim" + "\n2 Não");
    fome = entrada.nextInt();

    System.out.println("Voce tem dinheiro? " + "\n1 Sim" + "\n2 Não");
    dinheiro = entrada.nextInt();

    if (fome == 1 && dinheiro == 1) {
        System.out.println("Va para a cantina");
    } else if (fome == 2 && dinheiro == 1) {
        System.out.println("Vai trabalhar!!");
    } else if (fome == 1 && dinheiro == 2) {
        System.out.println("Guarde o dinheiro");
    } else if (fome == 2 && dinheiro == 2 ){
        System.out.println("Vai arrumar o que fazer então");}
    else {
        System.out.println("inválido");
    }
}
}
