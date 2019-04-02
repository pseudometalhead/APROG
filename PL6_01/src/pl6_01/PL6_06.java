/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6_01;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Diana Barros
 */
public class PL6_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String solido;
        Scanner mensagem1 = new Scanner(System.in);
        System.out.print("Insira o nome do sólido para o qual pretende calcular o volume. Opções: esfera, cilindro, cone" + "\n");
        solido = mensagem1.next();
        solido = solido.toLowerCase();

        double volume;
        if ("esfera".equals(solido)) {
            volume = esfera();
            System.out.printf("%.2f",volume);
        }//inserir instruções para calcular esfera
        else {

            if ("cilindro".equals(solido)) {
                volume = cilindro();
                System.out.printf("%.2f",volume);
            }//inserir instruções para calc volume cilindro
            else if ("cone".equals(solido)) {
                volume = cone();
                System.out.printf("%.2f",volume);
            } else {
                System.out.print("Sólido inválido!");
            }

            
        }

    }

    public static double esfera() {
        Scanner mensagem2 = new Scanner(System.in);
        System.out.print("Insira o raio." + "\n");
        double r = mensagem2.nextDouble();
        double vol;
        vol = (4 * PI * Math.pow(r, 3))/3;
        return vol;
    }

    public static double cilindro() {
        Scanner mensagem2 = new Scanner(System.in);
        System.out.print("Insira o raio." + "\n");
        double r = mensagem2.nextDouble();
        Scanner mensagem3 = new Scanner(System.in);
        System.out.print("Insira a altura." + "\n");
        double a = mensagem3.nextDouble();
        double vol;
        vol = PI * Math.pow(r, 2) * a;
        return vol;
    }

    public static double cone() {
        Scanner mensagem2 = new Scanner(System.in);
        System.out.print("Insina o raio." + "\n");
        double r = mensagem2.nextDouble();
        Scanner mensagem3 = new Scanner(System.in);
        System.out.print("Insina a altura." + "\n");
        double a = mensagem3.nextDouble();
        double vol;
        vol = (PI * Math.pow(r, 2) * a)/3;
        return vol;
    }
}
