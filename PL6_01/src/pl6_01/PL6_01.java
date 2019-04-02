/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_01;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static pl6_01.PL6_01.metodo2;

/**
 *
 * @author Diana Barros
 */
public class PL6_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        cont = 0;
        boolean flag;
        String palavra; 
        do {Scanner ler = new Scanner(System.in);
        System.out.print("Insira uma palavra." + "\n");
            palavra = ler.next();
            //palavra = JOptionPane.showInputDialog(null, "Insira palavra");
            flag = metodo2(palavra);
            cont++;}
            while (flag == false);         
        //JOptionPane.showMessageDialog(null, cont);
        System.out.print("Inseriu " + cont + " palavras.");
    }
    
    
    public static boolean metodo2(String pal) {
        int i, j;
        pal = pal.toLowerCase();
        i = 0;
        j = pal.length() - 1;
        while (i < j && pal.charAt(i) == pal.charAt(j)) {
            i++;
            j--;
        }
        return i >= j;
    }
}
