/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL7_2C {

    /**
     * @param args the command line arguments
     */
    /*Dado um número inteiro, aplicar as seguintes regras , 
            tanto ao primeiro número como aos resultados que se vão obtendo
    : • se o número for par , dividi
    -lo por 2;  • se o número for ímpar , adicionar
    -lhe 11.  Será que a sequência que se obtém volta 
            ao princípio ou reencontra algum dos valores obtidos
    ?   Limite a pesquisa a 231-1 tenta;  • se o número for ímpar , adicionartivas*/
    
    //ta por alto, falta Integer.maxvalue e modulos
    
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int v[] = new int[21474836  ];

        do {
            System.out.println("Insira o número a testar");
            v[0] = ler.nextInt();
        } while (v[0] < 0);
        boolean teste = true;
        int i;

        for (i = 0; i < 21474836; i++) {
            if (v[i] % 2 == 0) {
                v[i + 1] = v[i] / 2;

            } else {
                v[i + 1] = v[i] + 11;

            }
            teste = testeRepetidos(v, i);
            if (teste == true) {
                break;
            }
        }
        System.out.println(teste);

        mostrarLista(v, i);

    }

    public static boolean testeRepetidos(int v1[], int n) {
        boolean teste = false;
        int vecCop[] = new int[n];
        int aux;
        System.arraycopy(v1, 0, vecCop, 0, n);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (v1[i] == vecCop[j]) {
                    teste = true;
                    break;
                }
            }
        }
        return teste;
    }

    public static void mostrarLista(int[] v1, int n) {
        String aux = ""; //???? INICIALIZAR VARIAVEL
        for (int i = 0; i < n; i++) {
            if (v1[i] != 0) {
                aux = aux + v1[i] + " ";
            }
        }
        System.out.println(aux);
    }

}
