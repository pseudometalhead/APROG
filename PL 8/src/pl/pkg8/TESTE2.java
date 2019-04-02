/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pkg8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Formatter;
import java.util.Scanner;
import static pl.pkg8.TESTE.ler;

/**
 *
 * @author Diana Barros
 */
public class TESTE2 {

    /**
     * @param args the command line arguments
     */
    static Formatter out;
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // TODO code application logic here
        out = new Formatter("novo_ficheiro.txt", "UTF-8");
        String[] nomes = new String[30];
        int nElem = carregarFicheiro(nomes);
        imprimeVec(nomes, nElem);
        ordernaVecAlfabeticamente(nomes, nElem);
        imprimeVec(nomes, nElem);
        out.close();
    }

    public static void ordernaVecAlfabeticamente(String[] nomes, int nElems) {
        String aux;
        for (int i = 0; i < nElems; i++) {
            for (int j = i + 1; j < nElems; j++) {
            if (nomes[i].compareTo(nomes[j]) > 0) {
                aux = nomes[i];
                nomes[i] = nomes[j];
                nomes[j] = aux;
            }
        }}

    }

    public static int carregarFicheiro(String[] nomes) throws FileNotFoundException {
        int i = 0;
        System.out.println("Insira nome do ficheiro");
        String ficheiro = ler.nextLine() + ".txt";
        Scanner fInput = new Scanner(new File(ficheiro));
        while (fInput.hasNext()) {
            nomes[i] = fInput.nextLine();// Verifica se linha não está em branco 
            i++;
        }
        return i;
    }

    public static void imprimeVec(String[] v, int n) {
        //imprime vec até n em argumento
        String aux = "";
        for (int i = 0; i < n; i++) {
            aux = aux + v[i] + " ";
        }
        System.out.println(aux);
        out.format(aux);
    }
}
