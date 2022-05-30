/*Faça um programa que leia um vetor de 6 caracteres e
 diga quantas cosoantes foram lidas. Imprima as consoantes*/

import java.util.Scanner;

public class LendoEExibindoValores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int count = 0, numeroConsoantes = 0;
        do {
            System.out.print("Letra:");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                numeroConsoantes++;
            }
            count++;
        }while (count < consoantes.length);

        System.out.println("Numero de consoantes: "+ numeroConsoantes);
        System.out.print("Foram elas: ");
        for ( String consoante: consoantes ) {
            if (consoante != null) System.out.print(consoante + " ");
        }
    }
}

