/*
    Crie um conjunto contendo as cores do arco-íris e:
-> Exiba todas as cores uma abaixo da outra
-> Mostre a quantidade de cores que o arco-íris tem
-> Exiba as cores em ordem alfabética
-> Exiba as cores na ordem inversa da que foi informada
-> Exiba todas as cores que começam com a letra V
-> Remova todas as cores que não começam com a letra V
-> Limpe o conjunto
-> Confira se o conjunto está limpo


Exercício resolvido por João Bruno dos Santos Rijo em 09/06/2022 às 00:46
LinkedIn: linkedin.com/in/brunorijo
*/

import java.util.*;

public class ArcoIris {

    public static void main(String[] args) {
//      Criando o conjunto
        Set<String> colors = new LinkedHashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul claro");
            add("Azul");
            add("Violeta");
        }};

        System.out.println("Exibindo uma abaixo da outra");
        for (String cor: colors ) System.out.println(cor);

        System.out.println("Quantidade de cores que o arco-íris tem");
        System.out.println(colors.size());

        System.out.println("Cores em ordem alfabética");
        Set<String> ordemAlph = new TreeSet<>(colors);
        System.out.println(ordemAlph);

        System.out.println("Cores na ordem inversa da que foi informada");
        List<String> inverse = new ArrayList<>(ordemAlph);
        Collections.reverse(inverse);
        System.out.println(inverse);

        System.out.println("Cores que começam com V");
        for (String cor: colors ) {
            if (cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("Removendo as cores que não começam com V");
        Iterator iterator= colors.iterator();
        while (iterator.hasNext()){
            String cor = (String) iterator.next();
            if(!cor.startsWith("V")) iterator.remove();
        }
        System.out.println(colors);

        System.out.println("Limpando o conjunto Set...");
        colors.clear();
        if (colors.isEmpty()) System.out.println("O conjunto está vazio");
    }
}

