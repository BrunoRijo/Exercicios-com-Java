package Map.Exercicios;

/*
Faça um programa que simule um lançamento de dados.
Lance o dado 100x e armazene.
Depois mostre, quantas verze cada valor foi inserido

Resolvida po João Bruno dos Santos Rijo em 14/06/2022 às 19:54
LinkedIn: https://www.linkedin.com/in/brunorijo/
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class JogarDado {

    public static void main(String[] args) {

        Random random = new Random();
        Map<Integer, Integer> dado = new HashMap<>();
        Map<Integer, Integer> resultados = new HashMap<>(){{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        System.out.println("Lançando os dados.");
        for (int i = 0; i < 100; i++) dado.put(i, random.nextInt(6)+1);

//        Quantificando as aparições
        for (Map.Entry<Integer, Integer> d : dado.entrySet()){
            resultados.put(d.getValue(), resultados.get(d.getValue()).intValue()+1);
        }

//        Mostrando os resultados
        for (Map.Entry<Integer, Integer> m : resultados.entrySet()) System.out.println("A face "
        + m.getKey() + " aparece " + m.getValue()+ " vezes");
    }
}

