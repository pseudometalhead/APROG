package pl5;


import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        int numSeq,perfeito,contPrimo=0,a=1,j=0;
        do {
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduza o numero da sequencia: ");
            numSeq= sc.nextInt();
        } while (numSeq<=0) ;
        System.out.println("\nOs " + numSeq + " primeiros numeros perfeitos sao:");
        while (j<numSeq) {
               a++;
               numeroPrimo(a);
               if (numeroPrimo(a)==0) {
                   perfeito=(int)((Math.pow(2,a-1))*((Math.pow(2,a)-1)));
                   j++;
                   System.out.println(perfeito);
               }

           }
    } 
    
    public static long numeroPrimo (int n) {
        int nPrimo=0;
        for (int i=2;i<n;i++) {
           if (n % i == 0) {
               nPrimo ++ ;
           }
        }
        return nPrimo;
    }
}
   
/*perfeito=(int)((Math.pow(2,i-1))*((Math.pow(2,i)-1)));
                System.out.println(perfeito); */