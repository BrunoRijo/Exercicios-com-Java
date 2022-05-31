/*
Crie um método que recebe um array de inteiros a e um valor inteiro x e retorna a
quantidade de vezes que x aparece no array a.

Questão resolvida por João Bruno dos Santos Rijo, em 30/05/2022 às 21:32
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

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.print("Informe o numero que deseja contar: ");
        int numero = scan.nextInt();

        System.out.println("No seguinte array: ");
        for (int elements: array) {
            System.out.print(elements + " ");
        }
        System.out.println("O elemento " + numero + " aparece :"+ countElements(array, numero) + " vezes");

    }

    public static int countElements(int[] a, int value){
        int count = 0;
        for (int element: a) {
            if (element == value) count++;
        } return count;
    }


}

