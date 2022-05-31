/*
Escreva um método que recebe um array de números e devolve a posição onde se
encontra o maior valor do array. Se houver mais de um valor maior, devolver a posição da primeira
ocorrência.

Questão resolvida por João Bruno dos Santos Rijo, em 30/05/2022 às 21:56
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
            array[i] = random.nextInt(10); //preenche o array com numero aleatórios entre 0 - 10
        }

        System.out.print("Array: ");
        for (int number: array) {
            System.out.print(number + " ");
        }
        System.out.println("\nO maior elemento está na posição: "+ biggestPosition(array));
    }

    public static int biggestPosition(int[] a){
        int biggest = 0, position = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > biggest){
                biggest = a[i];
                position = i;
            }
        } return position;
    }
}

