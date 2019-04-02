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
public class PL5_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, d, aux, res;
        String numAux;
        res = 0;
        aux = 1;
        numAux = JOptionPane.showInputDialog(null, "Digite o número.");
        num = Integer.parseInt(numAux);
        while (num != 0) {
            d = num % 10;
            if (d % 2 == 1) {
                res = res + d * aux;
                aux = aux * 10;
            }
            num = num / 10;
        }
        System.out.println("O resultado é: " + res);
    }
}
//cria um novo número com os algarismos de um número introduzido