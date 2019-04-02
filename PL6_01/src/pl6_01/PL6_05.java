/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_01;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL6_05 {

    public static Scanner ler1 = new Scanner(System.in);

    public static void main(String[] args) {
        int max;
        int minDig = 0;
        int mostraNum1 = 0;
        int mostraNum2 = 0;
        int numero1, numero2;
        int digitos;
        do{
        System.out.print("Quantos pares de nÃºmeros pretende ler?" + "\n");
        max = ler1.nextInt();
        }while(max<1);

        for (int i = 1; i <= max; i++) {
            System.out.println("Insira o número 1.");
            numero1 = ler1.nextInt();

            System.out.println("Insira o número 2.");
            numero2 = ler1.nextInt();

            digitos = digitosIguais(numero1, numero2);
            if (digitos >= minDig && digitos != 0) {
                minDig = digitos;
                mostraNum1 = numero1;
                mostraNum2 = numero2;
            }
        }

        if (minDig== 0) {
            System.out.print("sem resultados");
        } else {

            System.out.print(mostraNum1 + "/" + mostraNum2);
        }

    }

    public static int digitosIguais(int num1, int num2) {
        int dig1, dig2;
        int contDig = 0;

        do {
            dig1 = num1 % 10;
            num1 = num1 / 10;
            dig2 = num2 % 10;
            num2 = num2 / 10;
            if (dig1 == dig2) {
                contDig = contDig + 1;
            }

        } while (num1 > 0 || num2 > 0);
        return contDig;
    }

}
