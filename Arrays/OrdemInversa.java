//Faça um programa que leia um vetor de 6 numeros e mostre-os em ordem inversa.

public class LendoEExibindoValores {

    public static void main(String[] args) {

            int[] vector = {2,15,-8,50,7,3};
            int count = vector.length-1;
            while (count > 0){
                System.out.print(vector[count] + " ");
                count--;
            }

    }
}

