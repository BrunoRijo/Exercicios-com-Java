package List;

/*
Crie uma lista e execute as seguintes operações:
Adicione 5 nomes de bancos: Santander, BB, Caixa, Nubank, Inter
-> Navegue na lista exibindo cada nome
-> Substitua o banco BB por WillBank
-> Retorne o banco da posição 1
-> Retorne o banco da posição 4
-> Remova  Inter
-> Retorne a quantidade de itens na lista
-> Verifique se BB existe na lista
-> Crie uma nova lista com os nomes: BB, Itau e adicione na primeira lista
-> Ordene de modo alfabético
-> verifique se a lista está vazia

Resolvida por João Bruno dos Santos Rijo em 15/06/2022 às 22:19
LinkedIn: https://linkedin.com/in/brunorijo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankList {
    public static void main(String[] args) {

    List<String> bancos = new ArrayList<>(){{
        add("Santander");
        add("BB");
        add("Caixa");
        add("Nubank");
        add("Inter");
    }};

    bancos.forEach(System.out::println);

    bancos.set(bancos.indexOf("BB"), "WillBank");

    System.out.println("Banco da posição 1:"+ bancos.get(1));
    System.out.println("Banco da posição 4:"+ bancos.get(4));

    bancos.remove("Inter");

    System.out.println("O tamanho atual da lista é: " + bancos.size());

    System.out.println("O banco BB ainda está na lista? R:" + bancos.contains("BB"));

    List<String> bancos1 = new ArrayList<>(){{
        add("BB");
        add("Itau");
    }};
    bancos.addAll(bancos1);

    System.out.println("Ordenando de forma alfabética: ");
    Collections.sort(bancos);
    bancos.forEach(System.out::println);

    System.out.println("A lista está vazia? R: " + bancos.isEmpty());

    }

}



