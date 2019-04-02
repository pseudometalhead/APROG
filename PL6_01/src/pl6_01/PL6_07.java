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
public class PL6_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mensagem1 = new Scanner(System.in);
        System.out.print("Insira um número octal" + "\n");
        int octal = mensagem1.nextInt();
        while (octalVerifica(octal) == true) {
            System.out.print(octalConvert(octal) + "\n");
            mensagem1 = new Scanner(System.in);
            System.out.print("Insira um número octal" + "\n");
            octal = mensagem1.nextInt();
        }
        if (octalVerifica(octal) == false)
        {System.out.print("O número não é octal!" + "\n");}
    }

    public static boolean octalVerifica(int num) {
        boolean teste = true;
        int dig;
        do {
            dig = num % 10;
            num = num / 10;
            if (dig > 7) {
                teste = false;
                break;
            }
        } while (num > 0);
        return teste;
    }

    public static int octalConvert(int a) {
        int decimal = 0;
        int ordem = 0;
        int dig;
        do {
            dig = a % 10;
            decimal = (int) (decimal + dig * Math.pow(8, ordem));
            a = a / 10;
            ordem++;
        } while (a > 0);
        return decimal;
    }

}
