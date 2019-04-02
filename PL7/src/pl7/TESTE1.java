/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl7;

/**
 *
 * @author Diana Barros
 */
public class TESTE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean diana;
        diana = true;
        System.out.println(diana);

        diana = false;
        System.out.println(diana);

        String gabi;
        gabi = "idoso";

        System.out.println(gabi);

        int tobias;
        tobias = 2;
        System.out.println(tobias);

        if (tobias == 1) {
            System.out.println("o gabi é " + gabi);
        } else {
            diana = true;
                  System.out.println(diana);
        }
        
        for (int i = 0; i <= 1000; i=i+500) {
            System.out.println("macatum " + i);
        }
    }

}
