/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5;

import javax.swing.JOptionPane;

/**
 *
 * @author Diana Barros
 */
public class PL5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*funcionalidade do algoritmo: introuduz-se o numero a e o numero b
        e verifica-se se se uma dada sequência c de numeros d é multipla de a e 
        divisor de b */
        
        int a, b, aux, num, c, d, e;
        String aAux, bAux, dAux, numAux;
        aAux = JOptionPane.showInputDialog(null, "Digite o número a.");
        a = Integer.parseInt(aAux);
        bAux = JOptionPane.showInputDialog(null, "Digite o número b.");
        b = Integer.parseInt(bAux);
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        e = 0;
        dAux = JOptionPane.showInputDialog(null, "Digite o número d.");
        d = Integer.parseInt(dAux);
        for (c = 0; c <= d; c++) {
            do {
                numAux = JOptionPane.showInputDialog(null, "Digite o número.");
                num = Integer.parseInt(numAux);
            } while (num < 0);
            if ((num % a == 0) && (b % num == 0)) {
                e++;
            }
        }
        JOptionPane.showMessageDialog(null, e);
    }
}
