/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL7_5C {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantos números?");
        int N = ler.nextInt();
        
        
    }

    public static int[] gerarVecAleatorios(int N) {
        int[] v = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        return v;
    }

}
