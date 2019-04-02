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
public class PL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s = 0;
        int c = 0;
        int i;
        double media;
        String nAux = JOptionPane.showInputDialog("Qual é o máximo de números que vai introduzir?");
        int n = Integer.parseInt(nAux);
        for (i = 1; i<=n; i++) {
            String numAux = JOptionPane.showInputDialog("Introduza um numero inteiro");
            int num = Integer.parseInt(numAux);
            if (num % 2 == 0) {
                c = c + 1;
                s = s + num;
            }
        }

        if (c != 0) {
            media = s / c;

            JOptionPane.showMessageDialog(null,"A media e: " + media + " E a percentagem de pares é " + (float)(100*c/n) + " %."); //FREQUENCIA RELATIVA 
        } else {
            JOptionPane.showMessageDialog(null, "Não existe");
        }  
        
    }
}