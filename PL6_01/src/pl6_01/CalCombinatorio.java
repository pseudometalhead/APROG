package pl6_01;

import java.util.Scanner;

/**
 * * Disponibilizamétodos associados ao Cálculo Combinatório
 */
public class CalCombinatorio {

    public static void main(String[] args) {
    int n; 
    Scanner mensagem1 = new Scanner(System.in);
    System.out.print ("Insira n." + "\n");
    n = mensagem1.nextInt();
    int p; 
    Scanner mensagem2 = new Scanner(System.in);
    System.out.print ("Insira p." + "\n");
    p = mensagem2.nextInt();
    System.out.print("O factorial de n é " + factorial(n) + ". "+ n + " combinação " + p + " a " + p + " é igual a " + " " + combinacoes(n,p));
    }
    

    private static long factorial(long num) {
        long fact = 1;
        for (long i = num; i > 1; i = i - 1) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * * Calcula o combinações de n p a p * * @param n número inteiro não
     * negativo * @param p número inteiro não negativo * @return o valor
     * combinações de n p a p ou -1 caso n<p
     *
     * @param n
     * @param p
     * @return
     */
    public static long combinacoes(long n, long p) {
        if (n < p) {
            return -1;
        }
        return factorial(n) / (factorial(p) * factorial(n - p));
    }

    public static long arranjos(long n, long p) {
        //n! / (n-p)!
        if (n < p) {
            return -1;
        }
        return factorial(n) / factorial(n - p);
    }

    public static long permutacoes(long n, long p) {
        if (n < p) {
            return -1;
        }
        return factorial(n);
    }
}
