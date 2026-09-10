package org.example;

import java.util.Scanner;

public class CursoIdiomas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = entrada.nextLine();

        if (cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("lideranca")) {
            System.out.println("Pode participar do programa de idiomas.");
        } else {
            System.out.println("Não pode participar do programa de idiomas.");
        }

        entrada.close();
    }
}