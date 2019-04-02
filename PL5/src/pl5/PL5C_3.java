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
public class PL5C_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num, dig, cont, prod;
        cont = 0;
        String numAux, mensagem = " ";
        numAux = JOptionPane.showInputDialog(null, "Digite um número para verificar a sua persistência.");
        num = Integer.parseInt(numAux);
        do {
            prod = 1;
            do {
                dig = num % 10;
                prod = prod * dig;
                num = num / 10;
            } while (num > 0);
            num = prod;
            mensagem = mensagem + num + "  ";
            cont++;
        } while (num > 9);
        JOptionPane.showMessageDialog(null, "A persistência do número é: " + cont + ". Termos da sequência:" + mensagem + ".");
    }
}
