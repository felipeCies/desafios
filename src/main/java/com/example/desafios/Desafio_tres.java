package com.example.desafios;

import java.util.Scanner;

public class Desafio_tres {public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    int pontos = 0;
    String nome, quiz1, quiz2, quiz3;
    System.out.println("Bem vindos ao quiz do Felipe");

    System.out.println("Qual seu nome: ");
    nome = entrada.nextLine();

    System.out.println("Qual é o meu nome? " +"\nA - Felipe " + "\nB Luan" + "\nC- Pedro");
    quiz1 = entrada.nextLine();

            if (quiz1.equals("A")){
                System.out.println("Acertou!" + nome);
                pontos += 1;
            } else {
                System.out.println("Errou " + nome);


            }

    System.out.println("Quanto é 2+2? " + "\nA- 1" + "\nB- 566" + "\nC- 4");
    quiz2 = entrada.nextLine();

            if (quiz2.equals("C")){
                System.out.println("Acertou! " +nome);
                pontos +=  1;

            } else {
                System.out.println("Errou! " +nome);

            }

    System.out.println("A sentença: (Eu sou um bixão) Possui quantas letras? " + "\nA- 10"+ "\nB- 3" + "\nC- 12 "  );
     quiz3 = entrada.nextLine();


    if (quiz3.equals("C")){
        System.out.println("Acertou! " +nome);
        pontos += 1;
    } else {
        System.out.println("Errou! " +nome);

    }

    System.out.println(+pontos);
}
}
