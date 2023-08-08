package com.example.desafios;

import java.util.Scanner;

public class LadoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("entre com o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("entre com o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("entre com o lado 3: ");
        lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilátero");
        } else if ((lado1 == lado2 && lado2!=lado3) || (lado2 == lado3 && lado2!=lado1) || (lado3 == lado1 && lado3!=lado2)){
            System.out.println("Isóceles");
        } else if (lado1!=lado2 && lado2 !=lado3 && lado3!=lado1){
            System.out.println("Escaleno");
        }
        scanner.close();
    }
}

