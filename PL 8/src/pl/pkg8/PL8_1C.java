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
public class PL8_1C {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] armazem = new String[10][10];
        menu(armazem);
    }

    public static void menu(String[][] m) {
        char op;
        do {
            System.out.println("Selecione as opções: \n "
                    + "1 - Inserir produto; \n "
                    + "2 - Modificar prateleira ocupada por produto; \n "
                    + "3 - Remover produto; \n "
                    + "4 - Listar produtos ordenados; \n ");
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    System.out.println("1");
                    inserirProduto(m);
                    break;
                case '2':
                    System.out.println("2");
                    modificarPrateleira(m);
                    break;
                case '3':
                    System.out.println("3");
                    apagarProduto(m);
                    break;
                case '4':
                    System.out.println("4");
                    imprimeMatriz(m);
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != '5');
    }

    public static void inserirProduto(String[][] m) {
        boolean flag;
        int l;
        int c;
        do {
            flag = true;
            System.out.println("Insira linha");
            l = ler.nextInt();
            System.out.println("Insira coluna");
            c = ler.nextInt();
            if (m[l][c] != null) {
                System.out.println("Prateleira já ocupada.");   
                    flag = false;
            }
        } while (flag == false);

        System.out.println("Insira nome do produto");
        ler.nextLine();
        String aux = ler.nextLine();
        m[l][c] = l + "-" + c + "-" + aux;
    }

    public static void modificarPrateleira(String[][] m) {
        boolean flag;
        int l;
        int c;
        do {
            flag = true;
            System.out.println("Insira linha de prateleira onde se encontra o produto");
            l = ler.nextInt();
            System.out.println("Insira coluna");
            c = ler.nextInt();
            if (m[l][c] != null) {
                String temp = m[l][c];
                m[l][c] = null;
                System.out.println("Digite linha da nova prateleira");
                int lAux = ler.nextInt();
                System.out.println("Digite coluna da nova prateleira");
                int cAux = ler.nextInt();
                int aux = temp.lastIndexOf("-");
                m[l][c] = lAux + "-" + cAux + temp.substring(aux);
            } else {
                System.out.print("Prateleira vazia! Tente novamente.");
                flag = false;
            }
        } while (flag == false);
    }
    public static void apagarProduto(String[][] m) {
        boolean flag;
        int l;
        int c;
        do {
            flag = true;
            System.out.println("Insira linha de prateleira onde se encontra o produto");
            l = ler.nextInt();
            System.out.println("Insira coluna");
            c = ler.nextInt();
            if (m[l][c] != null) {
                m[l][c] = null;
                System.out.println("Produto apagado com sucesso!");
            } else {
                System.out.print("Prateleira vazia! Tente novamente.");
                flag = false;
            }
        } while (flag == false);
    }

    public static void imprimeMatriz(String[][] m) {
        String aux = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != null) {
                    aux = aux + m[i][j] + " ";
                } else {
                    aux = aux + "    ";
                }
            }

            System.out.print(aux);
            aux = "";
            System.out.println(" ");
        }
    }
}
