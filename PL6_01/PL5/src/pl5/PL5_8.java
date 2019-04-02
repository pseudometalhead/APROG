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
public class PL5_8 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int a, dig;
        String aAux;
        aAux = JOptionPane.showInputDialog(null, "Digite um número para verificar se é binário.");
        a = Integer.parseInt(aAux);
        do {
            dig = a % 10;
            if (dig > 1) {
                JOptionPane.showMessageDialog(null, "O número não é binário.");
            }
            a = a / 10;
        } while ((a > 0) && (dig<2));
        if (a < 2) {
            JOptionPane.showMessageDialog(null, "O número é binário.");
        }
    }
}
