package Set.ExerciciosSet;
/*
Crie um set e execute as seguintes operações
-> Adicione 5 numeros inteiros 3,88,20,44,3
Navegue no Set exibindo cada numero no console
Remova o primeiro item do Set
Adicione um novo numero no set: 23
Verifique o tamanho so set
Verifique se o set está vazio

Feito por João Bruno dos Santos Rijo em 17/06/2022 às 13:36
*/

import java.util.HashSet;
import java.util.Set;

public class ListaDeNumeros {

    public static void main(String[] args) {
        Set<Integer> numberList = new HashSet<>(){{
           add(3);
           add(88);
           add(20);
           add(44);
           add(3);
        }};
        numberList.forEach(System.out::println);

        numberList.remove(numberList.stream().findFirst());
        numberList.forEach(System.out::println);

        numberList.add(23);
        System.out.println("Tamanho do set: "+ numberList.size());
        System.out.println("Está vazio? R: "+ numberList.isEmpty());

    }
}

