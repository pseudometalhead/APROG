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
public class PL5C_1 {

    /**
     * @param args the command line arguments
     */
    
    /*PASSOS
    tipificar resp
    import JOptionPane
    inicializar j
    alg % 2 = 0 erro - operador de atribuição
    inicializar i
    declarar perc float
    JOptionPane.showMessageDialog(null, "Valor=" + perc) 2 argumentos e tirar (int)
  
    Qual é o significado de +0,5f?
    
    */
    public static void main(String[] args) {
        float perc; 
        int numero, alg, i, j;
        String resp; 
        resp = JOptionPane.showInputDialog("Qual o número?");
        j=0; i=0;
        numero = Integer.parseInt(resp);
        do {
            j = j + 1;
            alg = numero % 10;
            if (alg % 2 == 0) {
                i = i + 1;
            }
            numero = numero / 10;
        } while (numero > 0);
        perc = (float) i / j + 0.5f;
        JOptionPane.showMessageDialog(null, "Valor=" + perc);
    }
}


