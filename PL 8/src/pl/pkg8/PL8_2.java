/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pkg8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL8_2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);
    static Formatter out;

    public static void main(String[] args) throws FileNotFoundException {
        out = new Formatter(new File("teste4.txt", "UTF-8")); //cria o ficheiro quad_mag.txt
        int lado = dimensaoMatriz();
        int m[][] = preencheMatriz(lado);
        imprimeMatriz(m);
        System.out.println(checkQuadradoMagico(m, lado));
        out.close();

    }

    public static int dimensaoMatriz() {
        //metodo que pergunta ao utilizador que tamanho pretende que a matriz tenha        
        System.out.println("Insira lado do quadrado mágico que pretende verificar");
        int lado;
        do {
            lado = ler.nextInt();
            out.format("lado = %d %n", lado); //imptime para o ficheiro quad_mag.txt o resultado entre aspas
        } while (lado < 1);

        return lado;
    }

    public static int[][] preencheMatriz(int n) throws FileNotFoundException {
        //metodo que preenche matriz quadrada de n elementos fornecidos em argumento
        Scanner ficheiro = new Scanner(new File("qm_ficheiro.txt"));
        int m[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.println("Insira elemento da posição " + (i + 1) + " " + (j + 1));
                m[i][j] = ficheiro.nextInt();
            }
        }
        
        ficheiro.close();
        return m;
    }

    public static void imprimeMatriz(int[][] m) {
        //metodo que imprime matriz
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

    public static boolean checkQuadradoMagico(int[][] m, int n) {
        boolean teste = true;
        int somaTeste = 0;
        for (int k = 0; k < n; k++) {
            somaTeste = somaTeste + m[0][k];
        }

        if (somaLinha(m, n, somaTeste) != true) {
            return false;
        }
        if (somaColuna(m, n, somaTeste) != true) {
            return false;
        }
        if (somaDiagonalPrincipal(m, n, somaTeste) != true) {
            return false;
        }
        if (somaDiagonalSecundaria(m, n, somaTeste) != true) {
            return false;
        }
        return teste;
    }

    public static boolean somaLinha(int[][] m, int n, int somaTeste) {
        boolean teste = true;
        int somaAux = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                somaAux = somaAux + m[i][j];
            }
            if (somaAux != somaTeste) {
                return false;
            }
            somaAux = 0;
        }
        return teste;
    }

    public static boolean somaColuna(int[][] m, int n, int somaTeste) {
        boolean teste = true;
        int somaAux = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                somaAux = somaAux + m[j][i];
            }
            if (somaAux != somaTeste) {
                return false;
            }
            somaAux = 0;
        }
        return teste;
    }

    public static boolean somaDiagonalPrincipal(int[][] m, int n, int somaTeste) {
        boolean teste = true;
        int somaAux = 0;

        for (int i = 0; i < n; i++) {
            somaAux = somaAux + m[i][i];
        }
        if (somaAux != somaTeste) {
            return false;
        }
        return teste;
    }

    public static boolean somaDiagonalSecundaria(int[][] m, int n, int somaTeste) {
        boolean teste = true;
        int somaAux = 0;
        int p = n;
        for (int i = 0; i < n; i++) {
            p--;
            somaAux = somaAux + m[i][p];
        }
        if (somaAux != somaTeste) {
            return false;
        }

        return teste;
    }
}
