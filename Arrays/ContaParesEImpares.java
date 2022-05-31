/*
Crie um método que receba um array de inteiros e retorna a quantidade de impares e pares.

Questão resolvida por João Bruno dos Santos Rijo, em 30/05/2022 às 22:10
Linkedin: https://www.linkedin.com/in/brunorijo
*/

import java.util.Random;
import java.util.Scanner;

public class LendoEExibindoValores {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe o tamanho do array: ");
        int[] array = new int[scan.nextInt()];

        for(int i = 0; i < array.length ; i++){
            System.out.print("Numero: ");
            array[i] = scan.nextInt();
        }

        System.out.print("Array: ");
        for (int number: array) {
            System.out.print(number + " ");
        }

        oddOrEven(array);
    }

    public static void oddOrEven (int[] a){
        int countOdd = 0, countEven = 0;
        for (int element: a) {
            if ((element%2) == 0) countOdd++;
            else countEven++;
        }
        System.out.println("\nPares: "+ countOdd);
        System.out.println("Ímpares: "+ countEven);
    }
}

