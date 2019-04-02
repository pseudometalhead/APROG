/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana Barros
 */
public class PL5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String auxMax;
        long numPerf;
        System.out.println("Quantos números perfeitos quer visualizar?");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        System.out.println("Os " + max + " primeiros números perfeitos são: ");
        for (int i = 2; i <= max + 1; i++) {
            numPerf = (long) ((Math.pow(2, i - 1)) * ((Math.pow(2, i)) - 1));
            System.out.println(numPerf);
        }

    }
}
/* System.out.println(numPerf)*/
