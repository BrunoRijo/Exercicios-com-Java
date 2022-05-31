/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9

Questão resolvida por João Bruno dos Santos Rijo, em 30/05/2022 às 20:48
Linkedin: https://www.linkedin.com/in/brunorijo
*/

import java.util.Random;

public class LendoEExibindoValores {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[4][4];

        //Adicionando os elementos
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        //Mostrando os elementos inseridos usando foreach
        for (int[] linha: matriz) {
            for (int elementoDaColuna: linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }

    }
}

