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
public class PL6_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mensagem1 = new Scanner(System.in);
        System.out.print("Quantos números da sequência Fibonnanci pretende ver?" + "\n");
        int num = mensagem1.nextInt();
        
        System.out.print(seqFibonacci(num));
    }

    public static String seqFibonacci(int quant) {
        String mensagem;
        int i, n, t, aux;
        mensagem = " ";
        n = 1;
        t = 0;
        for (i = 0; i < quant; i++) {
            n = n + t;
            aux = t;
            t = n;
            n = aux;
            mensagem = mensagem + n + " - ";

        }
        return mensagem;
    }
}
