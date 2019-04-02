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
public class PL7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomes[] = new String[100];
        int n = lerNomes(nomes);
        System.out.println("Os nomes inseridos são: ");
        mostrarListagem(nomes, n);

        for (int i = 0; i < n; i++) {
            apelido(nomes[i]);
        }

        String apelidosS[] = new String[100];
        double quantS = preencherVectorApelidosS(nomes, apelidosS, n);
        System.out.println("Os nomes inseridos com apelidos começados por S são: ");
        mostrarListagem(apelidosS, n);
        System.out.println("A percentagem de nomes com S é: ");
        double perc= (quantS/(n-1))*100;
        System.out.println(perc);

    }

    private static int lerNomes(String[] vec) {
        int cont;
        cont = 0;
        String aux;
        do {
            Scanner lerNome = new Scanner(System.in);
            System.out.println("Insira um nome. Para terminar a leitura insira FIM.");
            aux = lerNome.nextLine();
            vec[cont] = aux;
            cont++;
        } while (!"FIM".equals(aux));
        return cont;
    }

    private static String apelido(String nome) {
        int last;
        String apelido;
        apelido = " ";
        last = nome.lastIndexOf(' ');
        if (last > -1) {
            apelido = nome.substring(last);
        }
        return apelido;
    }

    public static void mostrarListagem(String nome[], int max) {
        for (int i = 0; i < max - 1; i++) {
            if (nome[i]!=null){
            System.out.println(nome[i]);}
        }
        /*mostrarListagem que mostra no ecrã 
uma listagem do conteúdo de um vetor de strings. 
Este vetor e a quantidade de elementos 
listados são passados por parâmetros. */
    }

    public static double preencherVectorApelidosS(String v1[], String v2[], int n) {
        String aux[] = new String[100];
        for (int i = 0; i < n; i++) {
            int primeiro = v1[i].indexOf(' ');
            if (primeiro != -1) {
                aux[i] = v1[i].substring(primeiro);
            }
            else{aux[i]=" ";}
        }

        int espaco;
        int cont;
        cont = 0;
        for (int i = 0; i < n; i++) {
            if (aux[i].contains(" S") == true) {
                v2[i] = v1[i];
                cont++;
                //System.out.println(v1[i]);
            }
            //else{v2[i]=v2[i+1];}
        }

        return cont;
    }

}
