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
public class PL6_01C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mensagem1 = new Scanner(System.in);
        
        for(int i=0; i<100; i++)
        {System.out.print("Insira um número para verificar se é capicua" + "\n");
        int num = mensagem1.nextInt();
        if(checkCapicua(num)==true)
        {System.out.print("Foi encontrada uma capicua!");
        break;}
        if(i==99)
        {System.out.print("Já foram analisados 100 números");}
        }
        
        
    }

    public static boolean checkCapicua(int num) {
        boolean teste = false;
        int dig, ordem, num3;
        int num2 = num;
        num3 = 0;
        ordem = 0;
        do {
            dig = num % 10;
            num = num / 10;
            num3 = (int) (num3 + dig * Math.pow(10, ordem));
            ordem = ordem + 1;
        } while (num > 0);
        if (num3!=num2) {
            teste = false;
        }
        return teste;
    }
;

}
