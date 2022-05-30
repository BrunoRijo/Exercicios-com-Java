/*
Faça um programa que leia 20 numeros aleatórios (entre 0 e 100)
armazene-os em um vetor. Ao final mostre os numeros e seus sucessores

Questão resolvida por João Bruno dos Santos Rijo, em 30/05/2022 às 20:33
Linkedin: https://www.linkedin.com/in/brunorijo
*/

import java.util.Random;

public class LendoEExibindoValores {

    public static void main(String[] args) {

        Random random = new Random();
        int[] randomNumbers = new int[20];
        for (int i=0; i< randomNumbers.length; i++){
            randomNumbers[i] =random.nextInt(100);
        }

        System.out.print("Numeros aleatórios:");
        for (int elements: randomNumbers ) {
            System.out.print(elements + " ");
        }

        System.out.print("\nSucessores:");
        for (int elements: randomNumbers ) {
            System.out.print((elements+1) + " ");
        }
    }
}

