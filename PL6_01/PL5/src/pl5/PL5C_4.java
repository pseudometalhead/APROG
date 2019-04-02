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
public class PL5C_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String quantAux, mensagem;
        int quant, i, n, t, aux;
        mensagem = " ";
        quantAux = JOptionPane.showInputDialog(null, "Quantos números da sequência Fibonacci pretende ver?");
        quant = Integer.parseInt(quantAux);
        n = 1;
        t = 0;
        for (i = 0; i < quant; i++) {
            n = n + t;
            aux = t;
            t = n;
            n = aux;
            mensagem = mensagem + n + " - ";

        }
        JOptionPane.showMessageDialog(null, mensagem);  

    }
}
