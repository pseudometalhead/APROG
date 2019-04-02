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
//FALTA TERMINAR DESLOCADOS 
public class PL7_6C {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escolha o nível de dificuldade! (1-9)");
        int nivel = ler.nextInt();
        int v[] = gerarArray(nivel);
        int flag=700;
        //int v[] = {0, 0, 6, 5, 3};
        int certos = 0;
        //mostrarLista(v, nivel);
        int contTent = 0;
        do {
            int resp[] = preencheArrayResposta(nivel, v);
            if (resp[0] != flag) {
                contTent++;
                System.out.println("Tentativa: " + contTent);
                //mostrarLista(resp, nivel);
                certos = checkResposta(nivel, v, resp);
            } else {
                break;
            }
        } while (certos != nivel);
        if (certos == nivel) {
            System.out.println("Parabéns! Acertou em " + contTent + " tentativas.");
        }

    }

    public static int checkResposta(int n, int[] vec, int[] resp) {
        int contCertos = 0;
        int contDesloc = 0;
        int[] v = new int[n];
        System.arraycopy(vec, 0, v, 0, n);
        boolean teste = false;
        for (int i = 0; i < n; i++) {
            if (v[i] == resp[i]) {
                contCertos++;
                resp[i] = 10;
                v[i] = 10;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                if (v[k] == resp[j] && v[k] != 10) {
                    contDesloc++;
                    //teste = true;
                    resp[j] = 10;
                }
            }
            if (teste == true) {
                break;
            }
        }

        //contDesloc = contDesloc - contCertos;
        System.out.println("Certos = " + contCertos);
        System.out.println("Deslocados = " + contDesloc);
        return contCertos;
    }

    public static int[] preencheArrayResposta(int n, int[] sol) {
        int tent;
        int[] v;
        do {
            System.out.println("Insira o seu palpite! Para desistir e ver a solução, digite 1.");
            tent = ler.nextInt();
            v = new int[n];
            if (tent == 1) {
                mostrarLista(sol, n);
                
                v[0] = 700;
                break;
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    v[i] = tent % 10;
                    tent = tent / 10;
                }
                if (tent != 0) {
                    System.out.println("Número com demasiados digitos!");
                }
            }
        } while (tent != 0);
        return v;
    }

    public static int[] gerarArray(int n) {
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 10);
        }
        return v;
    }

    public static void mostrarLista(int[] v1, int n) {
        String aux = ""; //???? INICIALIZAR VARIAVEL
        for (int i = 0; i < n; i++) {
            aux = aux + v1[i] + " ";
        }
        System.out.println(aux);
    }
}
