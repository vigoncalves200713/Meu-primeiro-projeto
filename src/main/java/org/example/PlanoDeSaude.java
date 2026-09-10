
package org.example;
import java.util.Scanner;

public class PlanoDeSaude
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o tempo de contratação da empresa: ");
        int tempoContrato = sc.nextInt();

        if (tempoContrato >= 3){
            System.out.println("adesão ao plano de saude disponivel!");
        }
    }
}
