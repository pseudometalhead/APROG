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
public class PL5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String aAux;
        long a, binAux, ordem;
        ordem = 0; 
        long binario = 0;
        aAux = JOptionPane.showInputDialog(null, "Qual o número que pretender converter para binário?");
        a = Integer.parseInt(aAux);
        do {
            binAux = a % 2;
            binario = (long) ((Math.pow(10,ordem)*  binAux) + binario );
            a = a/2;
            ordem = ordem +1;
        } while (a > 0);
        JOptionPane.showMessageDialog(null, "Binário: " + binario);
//algo errado 1222 ex

    }}
