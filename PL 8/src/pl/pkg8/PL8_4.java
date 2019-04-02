/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pkg8;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL8_4 {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Quantos números pretende inserir?");
        int N = pedeNumInteiroPositivo();
        int v[] = preencheVecDiferentes(N);
        int vOrdenado[] = ordenaVec(v);
        System.out.println("Defina quantos números quer ver.");
        int limite = pedeNumIntMenorQue(N);
        imprimeVec(vOrdenado, limite);
    }

    public static void imprimeVec(int[] v, int n) {
        //imprime vec até n em argumento
        String aux = "";
        for (int i = 0; i < n; i++) {
            aux = aux + v[i] + " ";
        }
        System.out.println(aux);
    }

    public static int[] ordenaVec(int[] v) {
        //ordena vec num decrescente
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] < v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }

        imprimeVec(v, v.length);
        return v;
    }

    public static int pedeNumIntMenorQue(int limite) {
        //solicita inteiro positivo menor que limite
        int N;
        do {

            N = ler.nextInt();
        } while (N > limite | N<0);

        return N;
    }

    public static int pedeNumInteiroPositivo() {
        //metodo que valida e retorna int positivo 
        int N;
        do {

            N = ler.nextInt();
        } while (N < 1);

        return N;
    }

    public static int[] preencheVecDiferentes(int N) {
//        preenche vetor com N elementos em argumento e 
//        que devem ser diferentes
        int[] v = new int[N];
        boolean teste;
        for (int i = 0; i < N; i++) {
            do {
                System.out.println("Insira número");
                v[i] = ler.nextInt();
                teste = true;
                for (int j = i - 1; j >= 0; j--) {
                    if (v[i] == v[j]) {
                        teste = false;
                        break;
                    }
                }
            } while (teste == false);
        }
        imprimeVec(v, v.length);
        return v;

    }

}
