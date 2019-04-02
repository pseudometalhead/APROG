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
public class PL7_6 {

    /**
     * @param args the command line arguments
     */
    
    /*CORREÇÕES: comentar código; mensagens de erro; problema 
    repetições muda array original, elm não funciona depois de repetição*/
    public static void main(String[] args) {
        String nomes[] = new String[100];
        Scanner ler = new Scanner(System.in);
        char op;
        int n = 0;
        do {
            System.out.println("Selecione as opções: \n "
                    + "1 - Inserir um visitante; \n "
                    + "2 - Listar todos os visitantes; \n "
                    + "3 - Atualizar um nome dado; \n "
                    + "4 - Eliminar um visitante dado; \n "
                    + "5 - Listar os nomes começados por uma dada letra; \n "
                    + "6 - Listar nomes repetidos.");
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    n = lerNomes(nomes, n); //CHECK
                    break;
                case '2':
                    System.out.println("nomes");
                    mostrarListagem(nomes, n); //CHECK
                    break;
                case '3':
                    nomes = atualizarNome3(nomes, n);
                    break;
                case '4':
                    n=apagarNome4(nomes, n);
                    break;
                case '5':
                    String[] letras = preencherVectorApelidosLetra5(nomes, n);
                    mostrarListagem(letras, n); //CHECK
                    break;
                case '6':
                    String[] repetidos = listarRepetidos6(nomes, n);
                    mostrarListagem(repetidos, n);
                    break;  //CHECK
                case '7':
                    break;

                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != '7');
    }

    private static int lerNomes(String[] vec, int cont) {
        String aux;
        Scanner lerNome = new Scanner(System.in);
        System.out.println("Insira um nome. ");
        aux = lerNome.nextLine();
        vec[cont] = aux;
        cont++;
        return cont;
    }

    public static void mostrarListagem(String nome[], int max) {
        for (int i = 0; i < max; i++) {
            if (nome[i] != null) {
                System.out.println(nome[i]);
            }
        }
        /*mostrarListagem que mostra no ecrã uma listagem do conteúdo de um vetor de strings. 
Este vetor e a quantidade de elementos listados são passados por parâmetros. */
    }

    public static int apagarNome4(String v1[], int n) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome que pretende apagar");
        String aux = ler.nextLine();
        for (int i = 0; i < n; i++) {
            if (v1[i].equalsIgnoreCase(aux)) {
                for (int j = i; j < n; j++) {
                    v1[j] = v1[j + 1];
                }
                n = n - 1;
            break;} //POSSO FAZER ESTE BREAK? OU FAÇO UMA FLAG???????
            //else {System.out.println("O nome inserido não se encontra na lista!");}
        }    
        return n;
    }

    public static String[] atualizarNome3(String v1[], int n) {
        int[] v = new int[10];
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome que pretende alterar");
        String aux = ler.nextLine();
        for (int i = 0; i < n; i++) {
            if (v1[i].equalsIgnoreCase(aux)) {
                System.out.println("Digite o novo nome");
                String nome2 = ler.nextLine();
                v1[i] = nome2;
            }
            //else {System.out.println("O nome inserido não se encontra na lista");}
        }
        return v1;
    }

    public static String[] preencherVectorApelidosLetra5(String v1[], int n) {
        int[] v = new int[10];
        String[] v2 = new String[100];
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a letra pela qual pretende pesquisar");
        String aux = ler.nextLine();
        char car = aux.charAt(0);
        for (int i = 0; i < n; i++) {
            if (v1[i].charAt(0) == car) {
                v2[i] = v1[i];
            }
            //else {System.out.println("Não foi encontrado nenhum nome começado por " + car);}
        }
        return v2;
    }

    public static String[] listarRepetidos6(String v1[], int n) {
        String vecRep[] = new String[100];
        String vecCop[] = new String[100];
        System.arraycopy(v1, 0, vecCop, 0, n);
        for (int i = 0; i < n; i++) {
            String aux = vecCop[i];
            if (aux != null) {
                for (int j = i + 1; j < n; j++) {
                    if (aux.equalsIgnoreCase(vecCop[j])) {
                        vecCop[j] = null;
                        do {
                            vecRep[i] = aux;
                        } while (vecRep[i] == null);
                    }
                    //else {System.out.println("Não há elementos repetidos na lista!");}
                }
            }
        }
        return vecRep;
    }
}