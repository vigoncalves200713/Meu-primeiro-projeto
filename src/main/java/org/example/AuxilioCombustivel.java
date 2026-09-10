package org.example;
import java.util.Scanner;

public class AuxilioCombustivel {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("O funcionário utiliza veículo próprio? (sim/nao): ");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Possui auxílio combustível disponível.");
        } else {
            System.out.println("Não possui auxílio combustível.");
        }

        entrada.close();
    }
}