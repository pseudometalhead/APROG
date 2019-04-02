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
public class PL6_03_VPL {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insira o lado 1." + "\n");
        double a = ler.nextDouble();
        System.out.print("Insira o lado 2." + "\n");
        double b = ler.nextDouble();
        System.out.print("Insira o lado 3." + "\n");
        double c = ler.nextDouble();
        
        if (verTriangulo(a,b,c)==true)
        {double angAB = calcAng(a,b,c);
        double angAC = calcAng(a,c,b);
        double angBC = calcAng(b,c,a);
        System.out.printf("%.0f %.0f %.0f", angAB, angAC, angBC);}
        else{System.out.println("impossivel");}
    }

    public static boolean verTriangulo(double a, double b, double c) {
        boolean teste = true;
        if ((a + b <= c || a + c <= b || b + c <= a)) {
            teste = false;
        }
        return teste;
    }

    public static double calcAng(double a, double b, double c) { //porque é que os argumentos do módulo têm que ser double????????
        double ang;
        ang = (double) Math.toDegrees((Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b))));
        return ang;
    }
}
