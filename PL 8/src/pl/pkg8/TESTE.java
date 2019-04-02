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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class TESTE {

    /**
     * @param args the command line arguments
     */
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        int[] anosNascimento = new int[30];
        int[] idades = new int[30];
        int [][] frequencia = new int [2][30];
        int nElem = carregarFicheiro(anosNascimento);
        //imprimeVec(anosNascimento, nElem);
        vectorIdade(idades, anosNascimento, nElem);
        //imprimeVec(idades, nElem);
        ordenaVector(idades, nElem);
        //imprimeVec(idades, nElem);
        frequencia = freqVector(idades, nElem);
        nElem= apagaRepVec(frequencia, nElem);
        //imprimeMatriz(frequencia, nElem);
        output(frequencia, nElem);
    }
    public static void output (int [][] v, int nElem)
    {for (int i = 0; i < nElem; i++) {
                System.out.println(v [0][i] + " anos ---- " + v[1][i] + " participantes");
        }
}
    public static int apagaRepVec(int[][] v, int nElem) {
        boolean teste = false;
        int n = nElem;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (v[0][i] == v[0][j] && i != j) {
                    n--;
                    for (int k = j; k < n; k++) {
                        v[0][k] = v[0][k + 1];
                        v[1][k] = v[1][k + 1];
                    }
                    teste = true;
                }
            }
            if (teste == true) {
                teste = false;
                i--;
            }
        }
        //System.out.println(n);
        return n;
    }
    public static void imprimeMatriz(int[][] m, int nElem) {
        String aux = "";
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < nElem; j++) {
                aux = aux + m[i][j] + "   ";           
            }
            System.out.print(aux);
            aux = "";
            System.out.println(" ");
        }
    }

    public static int checkRepetidos(int m[], int aux, int nElem) {
        int cont = 0;
        for (int i = 0; i < nElem; i++) {

            if (aux == m[i]) {
                cont++;
            }
        }
        return cont;
    }

    public static int[][] freqVector(int[] m, int nElem) {
//metodo que devolve frequencia de elementos de matriz dada em argumento
        int aux;
        int[][] frequencias = new int[2][nElem];
        int k = 0;
        for (int i = 0; i < nElem; i++) {
                aux = m[i];
                frequencias[0][k] = aux;
                frequencias[1][k] = checkRepetidos(m, aux, nElem);
                k++;
            }
        

        return frequencias;
    }

    public static void ordenaVector(int[] m, int n) {//ordena vec num decrescente
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (m[i] > m[j]) {
                    aux = m[i];
                    m[i] = m[j];
                    m[j] = aux;
                }
            }
        }
    }

    public static void vectorIdade(int[] idades, int[] anosNascimento, int nElem) {
        for (int i = 0; i < nElem; i++) {
            idades[i] = converteIdade(anosNascimento[i]);
        }
    }

    public static int converteIdade(int anoNascimento) {
        int anoAtual = 2018;
        int idade = anoAtual - anoNascimento;
        return idade;
    }

    public static int carregarFicheiro(int[] anosNascimento) throws FileNotFoundException {
        String[] temp = null;
        int i = 0;
        System.out.println("Insira nome do ficheiro");
        String ficheiro = ler.nextLine() + ".txt";
        Scanner fInput = new Scanner(new File(ficheiro));
        while (fInput.hasNext()) {
            String linha = fInput.nextLine(); // Verifica se linha não está em branco 
            if (linha.trim().length() > 0) {
                temp = linha.split("/"); // split converte partes da String para array
            }
            anosNascimento[i] = Integer.parseInt(temp[2]);
            i++;
        }
        return i;
    }

    public static void imprimeVec(int[] v, int n) {
        //imprime vec até n em argumento
        String aux = "";
        for (int i = 0; i < n; i++) {
            aux = aux + v[i] + " ";
        }
        System.out.println(aux);
    }
}
