/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pkg8;



/**
 *
 * @author Diana Barros
 */
public class PL8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x;
        int m[][] = {{1, 4, 2, 1}, {9, 7, 2, 2}, {1, 7, 3, 5}, {2, 5, 0, 3}, {4, 7, 2, 1}};
        for (int i = 0; i < m.length; i++) {
            x = m[i][0];
            for (int j = 1; j < m[i].length; j++) {
                if (m[i][j] > x) {
                    x = m[i][j];
                }
            } 
            System.out.println(x); //imprime o maior elemento de cada linha da matriz
        }
        imprimeMatriz(m);
        
        imprimeMatrizTransposta(m);
    }

    public static void imprimeMatriz(int[][] m) {
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                aux = aux + m[i][j] + "   ";
                // System.out.print(m[i][j]);              
            }
            System.out.print(aux);
            aux = "";
            System.out.println(" ");
        }
    }
    public static void imprimeMatrizTransposta(int[][] m) {
        String aux = "";
        System.out.print("\n");
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m.length; j++) {
                aux = aux + m[j][i] + "   ";
                // System.out.print(m[i][j]);              
            }
            
            System.out.print(aux);
            aux = "";
            System.out.println(" ");

        }

    }
}
