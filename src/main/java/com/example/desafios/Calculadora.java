package com.example.desafios;

import java.util.Scanner;

public class Calculadora { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double valor_um, valor_dois;
    int  escolha;


    System.out.println("entre com o primeiro numero: ");
    valor_um = scanner.nextDouble();
    System.out.println("entre com o segundo numero: ");
    valor_dois = scanner.nextDouble();

    System.out.println("Escolha a operação" + "\n 1 adição" + "\n 2 subtração" + "\n 3 multiplicação" + "\n 4 divisão");
    escolha = scanner.nextInt();
    if (escolha == 1 ){
        System.out.println(valor_um + valor_dois);
    } else if (escolha == 2 ) {
        System.out.println(valor_um - valor_dois);
    } else if (escolha == 3) {
        System.out.println(valor_um * valor_dois);
    } else if (escolha == 4){
        System.out.println(valor_um / valor_dois );
    }

    scanner.close();


}
}
