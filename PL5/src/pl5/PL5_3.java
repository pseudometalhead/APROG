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
public class PL5_3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        String name, auxAge;
        int age;
        String adults = "";
        int contador = 0;
        int contadorAdultos = 0;
        double perc = 0;
        do {
            name = JOptionPane.showInputDialog("Introduzir nome");
            if (!"zzz".equals(name)) {
                auxAge = JOptionPane.showInputDialog("Introduzir idade");
                age = Integer.parseInt(auxAge);
                contador = contador + 1;
                if (age >= 18) {
                    perc = contadorAdultos * 100 / contador;
                    contadorAdultos = contadorAdultos + 1;
                    adults = adults + name + " ";

                }
            }
        } while (!"zzz".equals(name));
        //LER + WHILE 
        JOptionPane.showMessageDialog(null, adults + "são adultos. " + "A percentagem de adultos é: " + perc + " %.");
    }
}
