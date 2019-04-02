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
public class PL7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        String nomes[] = new String[100];
        Scanner ler = new Scanner(System.in);
        String m = "\n1-Ler Nomes\n2-Escrever Nome\n3-Terminar\n\nEscolha uma opção:";
        char op;
        do {
            System.out.println(m);
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    n = lerNomes(nomes);
                    break;
                case '2':
                    System.out.println("Nome:");
                    String nome = ler.nextLine(); 
                    n = enigma(nomes, nome, n);
                    
                    System.out.println(n);
                    break;
                case '3':
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != '3');
    }

    private static int lerNomes(String[] vec) {
        int cont;
        cont = 0;
        String aux;
        do {
            Scanner lerNome = new Scanner(System.in);
            System.out.println("Insira um nome. Para terminar a leitura insira FIM.");
            aux = lerNome.next();
            vec[cont] = aux;
            cont++;
        }
        while (!"FIM".equals(aux) );
        return cont;
    }

    private static void listar(String[] vec, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(vec[i]);
        }

    }

    private static int enigma(String[] nomes, String nome, int n) {
        int i = 0;
        while (i < n && !nomes[i].equalsIgnoreCase(nome)) {
            i++;
        }

        if (i
                == n) {
            return n;
        } else {
            for (int j = i; j < n - 1; j++) {
                nomes[j] = nomes[j + 1];
            }
            return --n;
        }
    }
}
