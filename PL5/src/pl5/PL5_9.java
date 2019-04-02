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
public class PL5_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, dig, ordem, decimal;
        String aAux;
        aAux = JOptionPane.showInputDialog(null, "Digite um número binário para converter para decimal.");
        a = Integer.parseInt(aAux);
        ordem = 0;
        decimal = 0;
        do {
            dig = a % 10;
            if (dig > 1) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
                break;
            } else {
                decimal = (int) (decimal + dig * Math.pow(2, ordem));
            }
            a = a / 10;
            ordem++;
            if(a==0){
            JOptionPane.showMessageDialog(null, decimal);}
        } while ((a > 0) && (dig < 2));
    }

}
