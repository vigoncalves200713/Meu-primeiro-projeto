package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu salario: R$ ");
        double salario = entrada.nextDouble();

        if (salario <= 4000) {
            System.out.println("Você recebe vale refeição!");
        } else {
            System.out.println("Você não recebe vale refeição.");
        }

        entrada.close();
    }
}

