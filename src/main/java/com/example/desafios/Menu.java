package com.example.desafios;

import com.example.desafios.entities.Conta;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        boolean menuContinua = false;
        do{
            System.out.println("Escolha uma opção:"+"\n1- Continuar" + "\n2- Sair");
            escolha = sc.nextInt();
            if (escolha == 1){
                menuContinua = true;
            } else if (escolha == 2) {
                menuContinua = false;
            }

        } while (menuContinua);
    }
}
