/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

import java.util.Scanner;

/**
 *
 * @author Diana Barrosº
 */
public class PL7_2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner ler = new Scanner(System.in);
    static final int MAXFUNC = 20;

    public static void main(String[] args) {
        int i = 0;
        String[] func = new String[MAXFUNC]; //array que contem nomes dos funcionarios
        double[] venc = new double[MAXFUNC]; // array que contem vencimentos dos funcionarios
        do {

            //System.out.println("Nome do funcionario? ");
            
            func[i] = ler.nextLine();
            if ("tt".equals(func[i]) && i == 0) {
                System.out.println("sem dados");
                break;
            }
            if (!"tt".equals(func[i])) {
                //System.out.println("Vencimento do funcionÃ¡rio ");
                do {
                    venc[i] = ler.nextDouble();
                    ler.nextLine();
                } while (venc[i] <= 0);
                
            }
            
            i++;

        } while (!"tt".equals(func[i - 1]) && i < MAXFUNC-1);
        //System.out.println("A mÃ©dia dos vencimentos Ã© " + media(venc, i));
        if ("tt".equals(func[i]) && i == 0) {
        } else {
            //System.out.println("Insira o limite!");
            double limMin;
            do {
                limMin = ler.nextDouble();
            } while (limMin <= 0);

            checkInferior(func, venc, limMin, i);
            double perc = percInferior(func, venc, limMin, i);
            System.out.format("%.2f%%", perc);
        }
    }

    public static double media(double valores[], int preenchidos) {
        int i;
        double s;
        s = 0;

        for (i = 0; i < valores.length; i++) {
            s = s + valores[i];
        }
        double media = (s / (preenchidos));
        return media;
    }

    public static void checkInferior(String nomes[], double valores[], double limite, int preenchidos) {
        int i;

        for (i = 0; i < preenchidos-1; i++) {
            if (valores[i] <= limite) {
                System.out.println(nomes[i]);
            }
        }
    }

    public static double percInferior(String[] nomes, double[] valores, double limMin, int limite) {
        int i;
        int cont = 0;
        for (i = 0; i < limite-1; i++) {
            if (valores[i] <limMin) {
                cont++;
            }
        }
        double perc = ((cont * 100) / (double) (limite-1));
        return perc;
    }
}
