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
public class PL7 {
//FUNCIONALIDADE: Calcula a média de pares de um array com 10 elementos. 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, s = 0, c = 0;
        int[] v = new int[10];
        Scanner ler = new Scanner(System.in);
        for (i = 0; i < v.length; i++) {
            System.out.println("Número ?");
            v[i] = ler.nextInt();
        }
        for (i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                s = s + v[i];
                c++;
            }
        }
        if (c != 0) {
            System.out.println("A média dos pares introduzidos é " +(((double) s) / c));
        } else {
            System.out.println("Operação impossível de realizar");
        }
        System.out.println("O menor elementos introduzido é " +menorElmArray(v));
        System.out.println("O menor elemento foi introduzido na posição número "+ indMenorElmArray(v));
    }
public static int menorElmArray(int v[]) {
        int menor;
        menor = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
                    
        }
        return menor;
    }
public static int indMenorElmArray(int v[]) {
        int menor, indice;
        menor = v[0];
        indice=0;
        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
                indice= i;
            }
        }
        return indice;
    }
}
