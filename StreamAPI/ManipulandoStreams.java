import java.util.*;
import java.util.stream.Collectors;

/*Estudando sobre StreamsAPI com o curso da DIO
em 15/06/2022 às 21:24 */

public class ExercicioStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0","4","1","2","3","9","9","6","5");


        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(System.out::println);
        //numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 ultimos primeiros e coloque dentro de um set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        /*Set<String> collect = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());*/

        System.out.println("Tranforme essa lista de String em uma lista de numeros inteiros: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*List<Integer> collect = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        collect.forEach(System.out::println);*/


        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> ListaParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        ListaParesMaioresQue2.forEach(System.out::println);

       System.out.println("Mostre a média dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer> numerosImpares = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        numerosImpares.removeIf(integer -> integer % 2 != 0);
        numerosImpares.forEach(System.out::println);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3).forEach(System.out::println);

        System.out.println("Retirando os numeros repetidos da lista, quantos ficam?");
        long count = numerosAleatorios.stream().collect(Collectors.toSet()).stream().count();
        System.out.println(count);

        System.out.println("Mostre o menor valor da lista: ");
        Integer min = numerosAleatorios.stream().map(Integer::parseInt).min(Integer::compare).get();
        System.out.println(min);

        System.out.println("Mostre o maior valor da lista: ");
        Integer max = numerosAleatorios.stream().map(Integer::parseInt).max(Integer::compare).get();
        System.out.println(max);

        System.out.println("Pegue apenas os numeros impares e some:");
        int sum = numerosAleatorios
                .stream()
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .sum();
        System.out.println(sum);

        System.out.println("Mostra a lista na ordem numerica");
        numerosAleatorios.stream().collect(Collectors.toList()).stream().sorted().forEach(System.out::println);

        System.out.println("Agrupe os valore impares multiplos de 3 e de 5");
        //dica, usarr collectors.groupingby(new Function)
        Map<Boolean, List<Integer>> multiplosde3e5 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(multiplosde3e5);


    }
}

