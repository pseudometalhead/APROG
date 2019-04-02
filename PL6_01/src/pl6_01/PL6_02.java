/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_01;

import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL6_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.print("Insira o número de alunos da turma." + "\n");
        int numAlunos = ler.nextInt();

        Scanner ler2 = new Scanner(System.in);
        System.out.print("Insira o número de disciplinas." + "\n");
        int numDisciplinas = ler2.nextInt();

        for (int i = 1; i <= numDisciplinas; i++) {
            Scanner ler3 = new Scanner(System.in);
            System.out.print("Insira nome da disciplina " + i + "." + "\n");
            String nomeDisciplina = ler3.next();
            Scanner ler4 = new Scanner(System.in);
            System.out.print("Insira o número de aprovados a " + nomeDisciplina + "\n");
            int numAprovados = ler4.nextInt();
            String TEMPORARIO = metodo1(numAlunos, numAprovados, nomeDisciplina);
            System.out.println(TEMPORARIO);
        }
 

    }

    public static String metodo1(int alunos, int aprovados, String nome) {
        String asteriscosPos = " ";
        String asteriscosNeg = " ";
        String escreve;
        for (int i = 1; i <= aprovados; i++) {
            asteriscosPos = asteriscosPos + "*";
        }
        for (int i = 1; i <= (alunos-aprovados); i++) {
            asteriscosNeg = asteriscosNeg + "*";
        }
        escreve = nome + "\n" + "Positivas: " + asteriscosPos + "\n" + "Negativas: " + asteriscosNeg;

        return escreve;
    }

    /*for (int i = 1; i < disciplinas; i++) {
            Scanner ler3 = new Scanner(System.in);
            System.out.print("Insira nome da disciplina" + i + "\n");
            String = ler3.nextInt();

            Scanner ler3 = new Scanner(System.in);
            System.out.print("Quantos alunos foram aprovados à discipina" + i + "\n");
            int numAprovados = ler3.nextInt();
        }*/
}
