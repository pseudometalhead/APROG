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
public class PL6_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler1 = new Scanner(System.in);
        System.out.print("Insira o lado 1." + "\n");
        int lado1 = ler1.nextInt();
        
        Scanner ler2 = new Scanner(System.in);
        System.out.print("Insira o lado 2." + "\n");
        int lado2 = ler2.nextInt();
        
        Scanner ler3 = new Scanner(System.in);
        System.out.print("Insira o lado 3." + "\n");
        int lado3 = ler3.nextInt();
        
        if ((lado1 + lado2 <= lado3) || (lado3 + lado2 <= lado1) || (lado1 + lado3 <= lado2)) {
            System.out.print("Triângulo impossível");
        }
        else {calcAng(lado1, lado2, lado3);}}

    public static void calcAng(double a, double b, double c) { //porque é que os argumentos do módulo têm que ser double????????
        double angAB, angAC, angBC;
        angAB = (double) Math.toDegrees((Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b))));
        angAC = (double) Math.toDegrees(Math.acos(((a * a) + (c * c) - (b * b)) / (2 * a * c)));
        angBC = (double) Math.toDegrees(Math.acos(((b * b) + (c * c) - (a * a)) / (2 * b * c)));
        // String angulos;
        System.out.printf("%.2f %.2f %.2f", angAB, angAC, angBC);
        //angulos = Double.toString("%2f",angAB) + " " + Double.toString(angAC) + " " + Double.toString(angBC);
        //return angulos;
    }
}
