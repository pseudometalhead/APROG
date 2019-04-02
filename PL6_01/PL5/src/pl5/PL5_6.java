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
public class PL5_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, cont1, cont2;
        String mensagem;
        cont1 = 0;
        cont2 = 0;
        do {
            String n1Aux = JOptionPane.showInputDialog(null, "Insira um número para a primeira sequência. Para parar insira 0.");
            n1 = Integer.parseInt(n1Aux);

            if (n1 % 2 == 0) {
                cont1++;
            }
        } while (n1 != 0);

        do {
            String n2Aux = JOptionPane.showInputDialog(null, "Insira um número para a segunda sequência. Para parar insira -1.");

            n2 = Integer.parseInt(n2Aux);
            if (n2 % 2 == 0) {
                cont2++;
            }
        } while (n2 != -1);
        if (cont1 < cont2) {
            mensagem = "A sequência 2 tem mais pares.";
        } else if  (cont2 > cont1){
            mensagem = "A sequência 1 tem mais pares.";
        } else { mensagem = "Ambas as sequências têm o mesmo número de pares.";
        
        }
    JOptionPane.showMessageDialog(null, mensagem);
    }
}
