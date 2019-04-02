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
public class PL5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String diasAux = JOptionPane.showInputDialog("Quantos dias pretende registar?");
        int dias = Integer.parseInt(diasAux);
        int max = 0;
        int i;
        for (i = 1; i <= dias; i++) {
            String tempAux = JOptionPane.showInputDialog("Qual a temperatura registada?");
            int temp = Integer.parseInt(tempAux);

            if (temp > max);
            {
                max = temp;
            }
        }
        String mensagem;
        if ((max <= -30) && (max >= 50)) {
            mensagem = "Temperatura extrema";
        } else if (max < 9) {
            mensagem = "Muito frio";
        } else if (max < 15) {
            mensagem = "Frio";
        } else if (max < 20) {
            mensagem = "Ameno";
        } else if (max < 30) {
            mensagem = "Quente";
        } else {
            mensagem = "Muito Quente";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
