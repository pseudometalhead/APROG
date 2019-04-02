
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diana Barros
 */
public class calcIdade {

    /**
     * @param args the command line arguments
     */
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String data = ler.nextLine();
        String dataEvento = ler.nextLine();
        System.out.println(calcIdade(data, dataEvento));

    }

    public static int calcIdade(String data, String dataEvento) {
        int ano = Integer.parseInt(data.substring(0, 4));
        int mes = Integer.parseInt(data.substring(4, 6));
        int dia = Integer.parseInt(data.substring(6, 8));
        final int ANO_EVENTO = Integer.parseInt(dataEvento.substring(0, 4));
        final int MES_EVENTO = Integer.parseInt(dataEvento.substring(4, 6));
        final int DIA_EVENTO = Integer.parseInt(dataEvento.substring(6, 8));
        int idade = ANO_EVENTO - ano;
        if (mes >= MES_EVENTO && dia >= DIA_EVENTO) {
            idade++;
        }
        return idade;
    }
}
